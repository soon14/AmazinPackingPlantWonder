package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_device_type_master database table.
 * 
 */
@Entity
@Table(name="mas_device_type_master")
@NamedQuery(name="MasDeviceTypeMaster.findAll", query="SELECT m FROM MasDeviceTypeMaster m")
public class MasDeviceTypeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="device_type")
	private String deviceType;

	@Column(name="device_type_code")
	private String deviceTypeCode;

	@Column(name="is_active")
	private String isActive;

	private String vendor;

	public MasDeviceTypeMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceTypeCode() {
		return this.deviceTypeCode;
	}

	public void setDeviceTypeCode(String deviceTypeCode) {
		this.deviceTypeCode = deviceTypeCode;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}