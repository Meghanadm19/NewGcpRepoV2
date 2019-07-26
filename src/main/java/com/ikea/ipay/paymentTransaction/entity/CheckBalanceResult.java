package com.ikea.ipay.paymentTransaction.entity;

public class CheckBalanceResult {
	
	private String cardNumber;
	
	private int cardBalance1;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCardBalance1() {
		return cardBalance1;
	}

	public void setCardBalance1(int cardBalance1) {
		this.cardBalance1 = cardBalance1;
	}

	@Override
	public String toString() {
		return "CheckBalanceResult [cardNumber=" + cardNumber + ", cardBalance1=" + cardBalance1 + "]";
	}

}
