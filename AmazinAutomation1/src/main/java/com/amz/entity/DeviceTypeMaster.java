package com.amz.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="device_type_master")
@Entity
public class DeviceTypeMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "device_type")
	private String deviceType;
	
	@Column(name = "vendor")
	private String vendor;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "last_updated")
	private String lastUpdated;
	
	@Column(name = "added_by")
	private String addedBy;

	@Column(name = "updated_by")
	private String updatedBy;
	
	
	
	
	
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
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

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
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
//	@OneToOne
//	@JoinColumn(name="device_type_master_id")
	//@OneToOne(mappedBy="device_type_master_id", cascade=CascadeType.ALL)
	
	
	//@OneToOne(mappedBy = "device_type_master")
	//private DeviceTypeQty deviceTypeQty;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="id",cascade = CascadeType.ALL)
	private List<DeviceTypeQty> deviceTypeQtyList;



	public List<DeviceTypeQty> getDeviceTypeQtyList() {
		return deviceTypeQtyList;
	}

	public void setDeviceTypeQtyList(List<DeviceTypeQty> deviceTypeQtyList) {
		this.deviceTypeQtyList = deviceTypeQtyList;
	}

	
	
	
	
}	