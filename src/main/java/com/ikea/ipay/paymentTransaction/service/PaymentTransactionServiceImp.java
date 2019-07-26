package com.ikea.ipay.paymentTransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikea.ipay.paymentTransaction.dao.PaymentTransactionDAO;
import com.ikea.ipay.paymentTransaction.entity.Card;
import com.ikea.ipay.paymentTransaction.entity.CheckBalanceResult;

@Service
public class PaymentTransactionServiceImp implements PaymentTransactionService {
	
	@Autowired PaymentTransactionDAO paymentTransactionDao;
	@Override
	public CheckBalanceResult getCardBalance(String cardno) {
		
		return paymentTransactionDao.getCardBalance(cardno);
	}

}
