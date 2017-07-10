package com.amz.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Table(name="device_type_qty")
@Entity
public class DeviceTypeQty implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "device_type_master_id")
	private int device_type_master_id;
	
	
//	@ManyToOne
//	@JoinColumn(name="device_type_master_id")
//	private DeviceTypeMaster deviceTypeMaster;
	
	
	
	
	
	
	
	@Column(name = "plant_id")
	private String plant_id;
	
	@Column(name = "total_qty")
	private String total_qty;
	
	@Column(name = "installed_qty")
	private String installed_qty;
	
	@Column(name = "is_active")
	private String is_active;
	
	@Column(name = "created_on")
	private String created_on;
	
	@Column(name = "updated_on")
	private String updated_on;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="id",cascade = CascadeType.ALL)
	private List<DeviceMaster> deviceMasterList;
	
	
	
	
	
	
	
	public int getDevice_type_master_id() {
		return device_type_master_id;
	}

	public void setDevice_type_master_id(int device_type_master_id) {
		this.device_type_master_id = device_type_master_id;
	}

	public List<DeviceMaster> getDeviceMasterList() {
		return deviceMasterList;
	}

	public void setDeviceMasterList(List<DeviceMaster> deviceMasterList) {
		this.deviceMasterList = deviceMasterList;
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getTotal_qty() {
		return total_qty;
	}

	public void setTotal_qty(String total_qty) {
		this.total_qty = total_qty;
	}

	public String getInstalled_qty() {
		return installed_qty;
	}

	public void setInstalled_qty(String installed_qty) {
		this.installed_qty = installed_qty;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}

	public String getPlant_id() {
		return plant_id;
	}

	public void setPlant_id(String plant_id) {
		this.plant_id = plant_id;
	}

	
	
	

	

	
}	