package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="discharged_side")
@Entity
public class DischargedSide implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "device_type_master_id")
	private String deviceTypeMasterId;
	
	@Column(name = "total_qty")
	private String totalQty;
	
	@Column(name = "installed_qty")
	private String installedQty;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_on")
	private String createdOn;

	@Column(name = "updated_on")
	private String updatedOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeviceTypeMasterId() {
		return deviceTypeMasterId;
	}

	public void setDeviceTypeMasterId(String deviceTypeMasterId) {
		this.deviceTypeMasterId = deviceTypeMasterId;
	}

	public String getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}

	public String getInstalledQty() {
		return installedQty;
	}

	public void setInstalledQty(String installedQty) {
		this.installedQty = installedQty;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
	
}	