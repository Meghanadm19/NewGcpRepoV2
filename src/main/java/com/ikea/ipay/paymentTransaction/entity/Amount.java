package com.ikea.ipay.paymentTransaction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AMOUNT_T")
public class Amount implements Serializable {
	
	@Id
	@Column(name = "AMOUNT_ID")
	private int amountId;
	
	@Column(name ="CARD_ID")
	private int cardId;
	
	@Column(name = "AMOUNT_TYPE")
	private String amountType;
	
	@Column(name = "CURRENT_AMOUNT")
	private double currentAmount;
	
	@Column(name = "PRIORITY")
	private int priority;
	
	@Column(name = "CAMPAIGN_ID")
	private int campaignId;
	
	@Column(name = "MASS_LOAD_ID")
	private int massLoadId;
	
	@Column(name = "ORIGINAL_AMOUNT")
	private double originalAmount;
	
	@Column(name = "BU_TYPE")
	private String buType;
	
	@Column(name = "BU_CODE")
	private String buCode;
	
	@Column(name = "BONUS_CODE_ID")
	private int bonusCodeId;
	
	@Column(name = "BONUS_ID")
	private int bonusId;
	
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
	
	@Column(name = "MULTIPLE_SINGLE_LOAD_ID")
	private int multipleSingleLoadId;

	public int getAmountId() {
		return amountId;
	}

	public void setAmountId(int amountId) {
		this.amountId = amountId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getMassLoadId() {
		return massLoadId;
	}

	public void setMassLoadId(int massLoadId) {
		this.massLoadId = massLoadId;
	}

	public double getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(double originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getBuType() {
		return buType;
	}

	public void setBuType(String buType) {
		this.buType = buType;
	}

	public String getBuCode() {
		return buCode;
	}

	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}

	public int getBonusCodeId() {
		return bonusCodeId;
	}

	public void setBonusCodeId(int bonusCodeId) {
		this.bonusCodeId = bonusCodeId;
	}

	public int getBonusId() {
		return bonusId;
	}

	public void setBonusId(int bonusId) {
		this.bonusId = bonusId;
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

	public int getMultipleSingleLoadId() {
		return multipleSingleLoadId;
	}

	public void setMultipleSingleLoadId(int multipleSingleLoadId) {
		this.multipleSingleLoadId = multipleSingleLoadId;
	}

	@Override
	public String toString() {
		return "Amount [amountId=" + amountId + ", cardId=" + cardId + ", amountType=" + amountType + ", currentAmount="
				+ currentAmount + ", priority=" + priority + ", campaignId=" + campaignId + ", massLoadId=" + massLoadId
				+ ", originalAmount=" + originalAmount + ", buType=" + buType + ", buCode=" + buCode + ", bonusCodeId="
				+ bonusCodeId + ", bonusId=" + bonusId + ", versionNumber=" + versionNumber + ", createdBy=" + createdBy
				+ ", createdDateTime=" + createdDateTime + ", updatedBy=" + updatedBy + ", updatedDateTime="
				+ updatedDateTime + ", multipleSingleLoadId=" + multipleSingleLoadId + "]";
	}

}
