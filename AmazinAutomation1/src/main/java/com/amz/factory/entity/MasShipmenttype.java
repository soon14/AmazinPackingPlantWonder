package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_shipmenttype database table.
 * 
 */
@Entity
@Table(name="mas_shipmenttype")
@NamedQuery(name="MasShipmenttype.findAll", query="SELECT m FROM MasShipmenttype m")
public class MasShipmenttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="shipment_desc")
	private String shipmentDesc;

	@Column(name="shipment_type")
	private String shipmentType;

	public MasShipmenttype() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getShipmentDesc() {
		return this.shipmentDesc;
	}

	public void setShipmentDesc(String shipmentDesc) {
		this.shipmentDesc = shipmentDesc;
	}

	public String getShipmentType() {
		return this.shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

}