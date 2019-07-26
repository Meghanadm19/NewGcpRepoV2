package com.ikea.ipay.paymentTransaction.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikea.ipay.paymentTransaction.entity.Amount;
import com.ikea.ipay.paymentTransaction.entity.Card;
import com.ikea.ipay.paymentTransaction.entity.CardNumber;
import com.ikea.ipay.paymentTransaction.entity.CheckBalanceResult;

@Transactional
@Repository
public class PaymentTransactionDAOImp implements PaymentTransactionDAO {
	
	@PersistenceContext
	private EntityManager entitymaneger;
	@Override
	/*public Card getCardBalance(int cardno) {
		
		return entitymaneger.find(Card.class, cardno);
		
	}*/
	
	public CheckBalanceResult getCardBalance(String cardno) {
		
		String issuer = cardno.substring(0, 6);
		int cardTypeDigit = Integer.parseInt(cardno.substring(6, 7));
		String accountNumber = cardno.substring(7, 18);
		int digitCheck = Integer.parseInt(cardno.substring(18, 19));

		/*Query query = entitymaneger.createQuery("Select c from CardNumber c where c.issuer=" + issuer + " and c.cardTypeDigit="
				+ cardTypeDigit + " and c.accountNumber=" + accountNumber + " and c.checkDigit=" + digitCheck);
*/
		Query query = entitymaneger.createQuery("FROM CardNumber");
		
		@SuppressWarnings("unchecked")
		List<CardNumber> list = query.getResultList();
		int cardNumberId = list.get(0).getCardNumberId();
		Card card = entitymaneger.find(Card.class, cardNumberId);
		int cardId = card.getCardId();
		Amount amount = entitymaneger.find(Amount.class, cardId);
		int balance = amount.getCurrentAmount();
		//System.out.println("Balance"+balance);
		CheckBalanceResult result = new CheckBalanceResult();
		result.setCardNumber(cardno);
		result.setCardBalance1(balance);
		
		return result;
		
	}

}
