package com.ikea.ipay.paymentTransaction.dao;

import com.ikea.ipay.paymentTransaction.entity.Card;
import com.ikea.ipay.paymentTransaction.entity.CheckBalanceResult;

public interface PaymentTransactionDAO  {
	
	public CheckBalanceResult getCardBalance(String cardno);
}
