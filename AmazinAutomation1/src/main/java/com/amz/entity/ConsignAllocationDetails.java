package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="consign_allocation_details")
@Entity
public class ConsignAllocationDetails implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "consignment_detail_id")
	private String consignmentDetailId;
	@Column(name = "busted_bag")
	private String bustedBag;
	
	@Column(name = "busted_bag_time")
	private String bustedBagTime;
	@Column(name = "verified_qty")
	private String verifiedQty;
	
	@Column(name = "verified_time")
	private String VerifiedTime;
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_date")
	private String createdDate;
	
	
	
	@Column(name = "updated_date")
	private String updatedDate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConsignmentDetailId() {
		return consignmentDetailId;
	}

	public void setConsignmentDetailId(String consignmentDetailId) {
		this.consignmentDetailId = consignmentDetailId;
	}

	public String getBustedBag() {
		return bustedBag;
	}

	public void setBustedBag(String bustedBag) {
		this.bustedBag = bustedBag;
	}

	public String getBustedBagTime() {
		return bustedBagTime;
	}

	public void setBustedBagTime(String bustedBagTime) {
		this.bustedBagTime = bustedBagTime;
	}

	public String getVerifiedQty() {
		return verifiedQty;
	}

	public void setVerifiedQty(String verifiedQty) {
		this.verifiedQty = verifiedQty;
	}

	public String getVerifiedTime() {
		return VerifiedTime;
	}

	public void setVerifiedTime(String verifiedTime) {
		VerifiedTime = verifiedTime;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getVerifitedBy() {
		return verifitedBy;
	}

	public void setVerifitedBy(String verifitedBy) {
		this.verifitedBy = verifitedBy;
	}

	@Column(name = "added_by")
	private String addedBy;
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "verified_by")
	private String verifitedBy;

		
}
	
	
	