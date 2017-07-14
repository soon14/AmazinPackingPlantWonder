package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the mas_device_type_qty database table.
 * 
 */
@Entity
@Table(name="mas_device_type_qty")
@NamedQuery(name="MasDeviceTypeQty.findAll", query="SELECT m FROM MasDeviceTypeQty m")
public class MasDeviceTypeQty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="device_type_master_id")
	private int deviceTypeMasterId;

	@Column(name="installed_qty")
	private String installedQty;

	@Column(name="is_active")
	private String isActive;

	@Column(name="total_qty")
	private String totalQty;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to MasDeviceMaster
	@OneToMany(mappedBy="masDeviceTypeQty")
	private List<MasDeviceMaster> masDeviceMasters;

	public MasDeviceTypeQty() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getDeviceTypeMasterId() {
		return this.deviceTypeMasterId;
	}

	public void setDeviceTypeMasterId(int deviceTypeMasterId) {
		this.deviceTypeMasterId = deviceTypeMasterId;
	}

	public String getInstalledQty() {
		return this.installedQty;
	}

	public void setInstalledQty(String installedQty) {
		this.installedQty = installedQty;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getTotalQty() {
		return this.totalQty;
	}

	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}

	public Timestamp getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public List<MasDeviceMaster> getMasDeviceMasters() {
		return this.masDeviceMasters;
	}

	public void setMasDeviceMasters(List<MasDeviceMaster> masDeviceMasters) {
		this.masDeviceMasters = masDeviceMasters;
	}

	public MasDeviceMaster addMasDeviceMaster(MasDeviceMaster masDeviceMaster) {
		getMasDeviceMasters().add(masDeviceMaster);
		masDeviceMaster.setMasDeviceTypeQty(this);

		return masDeviceMaster;
	}

	public MasDeviceMaster removeMasDeviceMaster(MasDeviceMaster masDeviceMaster) {
		getMasDeviceMasters().remove(masDeviceMaster);
		masDeviceMaster.setMasDeviceTypeQty(null);

		return masDeviceMaster;
	}

}