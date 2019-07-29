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
	public CheckBalanceResult getCardBalance(String cardno) {
		
		StringBuffer issuer = new StringBuffer(cardno.substring(0, 6));
		int cardTypeDigit = Integer.parseInt(cardno.substring(6, 7));
		StringBuffer accountNumber = new StringBuffer(cardno.substring(7, 18));
		int digitCheck = Integer.parseInt(cardno.substring(18, 19));

		Query query = entitymaneger.createQuery("Select a.currentAmount from CardNumber c, Card p, Amount a where c.cardNumberId = p.cardNumberId and p.cardId = a.cardId and c.issuer = '" + issuer + "' and c.cardTypeDigit = "
				+ cardTypeDigit + " and c.accountNumber = '" + accountNumber + "' and c.checkDigit = " + digitCheck);

		Double balance = (Double) query.getSingleResult();
		
		CheckBalanceResult result = new CheckBalanceResult();
		result.setCardNumber(cardno);
		result.setCardBalance1(balance);
		
		return result;
		
	}

}
