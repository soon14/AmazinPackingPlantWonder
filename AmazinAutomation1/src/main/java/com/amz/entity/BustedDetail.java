package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="busted_detail")
@Entity
public class BustedDetail implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "di_master_id")
	private long di_master_id;
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
	
	@Column(name = "loader_master_id")
	private String loader_master_id;
	
	@Column(name = "updated_date")
	private String updatedDate;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Column(name = "reusable_bags")
	private String reusable_bags;
	
	public String getReusable_bags() {
		return reusable_bags;
	}

	public void setReusable_bags(String reusable_bags) {
		this.reusable_bags = reusable_bags;
	}

	public long getDi_master_id() {
		return di_master_id;
	}

	public void setDi_master_id(long di_master_id) {
		this.di_master_id = di_master_id;
	}

	public String getLoader_master_id() {
		return loader_master_id;
	}

	public void setLoader_master_id(String loader_master_id) {
		this.loader_master_id = loader_master_id;
	}

		
}
	
	
	