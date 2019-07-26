package com.ikea.ipay.paymentTransaction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARD_NUMBER_T")
public class CardNumber implements Serializable {
	
	@Id
	@Column(name = "CARD_NUMBER_ID")
	private int cardNumberId;

	@Column(name = "ISSUER")
	private String issuer;

	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "CARD_TYPE_DIGIT")
	private int cardTypeDigit;

	@Column(name = "CHECK_DIGIT")
	private int checkDigit;

	@Column(name = "VERIFICATION_CODE")
	private String verificationCode;

	@Column(name = "VERSION_NO")
	private int versionNumber;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE_TIME")
	private String createdDateTime;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "UPDATED_DATE_TIME")
	private String updatedDateTime;

	public int getCardNumberId() {
		return cardNumberId;
	}

	public void setCardNumberId(int cardNumberId) {
		this.cardNumberId = cardNumberId;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getCardTypeDigit() {
		return cardTypeDigit;
	}

	public void setCardTypeDigit(int cardTypeDigit) {
		this.cardTypeDigit = cardTypeDigit;
	}

	public int getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(int checkDigit) {
		this.checkDigit = checkDigit;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public int getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(int versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	@Override
	public String toString() {
		return "CardNumber [cardNumberId=" + cardNumberId + ", issuer=" + issuer + ", accountNumber=" + accountNumber
				+ ", cardTypeDigit=" + cardTypeDigit + ", checkDigit=" + checkDigit + ", verificationCode="
				+ verificationCode + ", versionNumber=" + versionNumber + ", createdBy=" + createdBy
				+ ", createdDateTime=" + createdDateTime + ", updatedBy=" + updatedBy + ", updatedDateTime="
				+ updatedDateTime + "]";
	}
	
}
