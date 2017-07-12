package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_shippingtype database table.
 * 
 */
@Entity
@Table(name="mas_shippingtype")
@NamedQuery(name="MasShippingtype.findAll", query="SELECT m FROM MasShippingtype m")
public class MasShippingtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String capacity;

	@Column(name="is_active")
	private String isActive;

	@Column(name="shipping_code")
	private String shippingCode;

	private String wheels;

	public MasShippingtype() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getShippingCode() {
		return this.shippingCode;
	}

	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}

	public String getWheels() {
		return this.wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

}