package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="device_master")
@Entity
public class DeviceMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "device_type_qty_id")
	private int deviceTypeQtyId;
	

	

	@Column(name = "plant_id")
	private String plantId;
	
	@Column(name = "stage_id")
	private String stageId;
	
	@Column(name = "ip_address")
	private String ipAddress;
	
	@Column(name = "port_number")
	private String portNumber;
	
	@Column(name = "device_name")
	private String deviceName;
	
	@Column(name = "connection_type")
	private String connectionType;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "last_updated")
	private String lastUpdated;
	
	@Column(name = "added_by")
	private String added_by;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getPlantId() {
		return plantId;
	}

	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}

	public String getStageId() {
		return stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
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

	public String getAdded_by() {
		return added_by;
	}

	public void setAdded_by(String added_by) {
		this.added_by = added_by;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public int getDeviceTypeQtyId() {
		return deviceTypeQtyId;
	}

	public void setDeviceTypeQtyId(int deviceTypeQtyId) {
		this.deviceTypeQtyId = deviceTypeQtyId;
	}

	


	
	
	
}	