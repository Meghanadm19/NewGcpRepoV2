package com.ikea.ipay.paymentTransaction.service;

import com.ikea.ipay.paymentTransaction.entity.Card;
import com.ikea.ipay.paymentTransaction.entity.CheckBalanceResult;

public interface PaymentTransactionService {
	
	public CheckBalanceResult getCardBalance(String cardno);

}
