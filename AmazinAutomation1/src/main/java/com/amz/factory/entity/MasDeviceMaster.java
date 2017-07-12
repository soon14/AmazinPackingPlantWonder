package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_device_master database table.
 * 
 */
@Entity
@Table(name="mas_device_master")
@NamedQuery(name="MasDeviceMaster.findAll", query="SELECT m FROM MasDeviceMaster m")
public class MasDeviceMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="connection_type")
	private String connectionType;

	@Column(name="device_name")
	private String deviceName;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="is_active")
	private String isActive;

	@Column(name="port_number")
	private String portNumber;

	//bi-directional many-to-one association to MasDeviceTypeQty
	@ManyToOne
	@JoinColumn(name="device_type_qty_id")
	private MasDeviceTypeQty masDeviceTypeQty;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plant_id")
	private MasPlant masPlant;

	//bi-directional many-to-one association to MasStage
	@ManyToOne
	@JoinColumn(name="stage_id")
	private MasStage masStage;

	public MasDeviceMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPortNumber() {
		return this.portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public MasDeviceTypeQty getMasDeviceTypeQty() {
		return this.masDeviceTypeQty;
	}

	public void setMasDeviceTypeQty(MasDeviceTypeQty masDeviceTypeQty) {
		this.masDeviceTypeQty = masDeviceTypeQty;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

	public MasStage getMasStage() {
		return this.masStage;
	}

	public void setMasStage(MasStage masStage) {
		this.masStage = masStage;
	}

}