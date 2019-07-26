package com.ikea.ipay.paymentTransaction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARD_T")
public class Card implements Serializable  {
	
	@Id
	@Column(name ="CARD_ID")
	private int cardId;
	
	@Column(name ="CARD_STATE")
	private String cardState;
	
	@Column(name ="CURRENCY_CODE")
	private String currencyCode;
	
	@Column(name ="LAST_LIFE_CYCLE_DATE_TIME")
	private String lastLifeCycleDateTime;
	
	@Column(name ="LAST_TRANSACTION_DATE_TIME")
	private String lastTransactionDateTime;
	
	@Column(name ="COUNTRY_CODE" )
	private String countryCode;
	
	@Column(name = "CARD_NUMBER_ID")
	private int cardNumberId;
	
	@Column(name = "CARD_TYPE")
	private String cardType;
	
	@Column(name ="EXPIRE_DATE"  )
	private String expireDate;
	
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

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardState() {
		return cardState;
	}

	public void setCardState(String cardState) {
		this.cardState = cardState;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getLastLifeCycleDateTime() {
		return lastLifeCycleDateTime;
	}

	public void setLastLifeCycleDateTime(String lastLifeCycleDateTime) {
		this.lastLifeCycleDateTime = lastLifeCycleDateTime;
	}

	public String getLastTransactionDateTime() {
		return lastTransactionDateTime;
	}

	public void setLastTransactionDateTime(String lastTransactionDateTime) {
		this.lastTransactionDateTime = lastTransactionDateTime;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getCardNumberId() {
		return cardNumberId;
	}

	public void setCardNumberId(int cardNumberId) {
		this.cardNumberId = cardNumberId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
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
		return "Card [cardId=" + cardId + ", cardState=" + cardState + ", currencyCode=" + currencyCode
				+ ", lastLifeCycleDateTime=" + lastLifeCycleDateTime + ", lastTransactionDateTime="
				+ lastTransactionDateTime + ", countryCode=" + countryCode + ", cardNumberId=" + cardNumberId
				+ ", cardType=" + cardType + ", expireDate=" + expireDate + ", versionNumber=" + versionNumber
				+ ", createdBy=" + createdBy + ", createdDateTime=" + createdDateTime + ", updatedBy=" + updatedBy
				+ ", updatedDateTime=" + updatedDateTime + "]";
	}
	
}
