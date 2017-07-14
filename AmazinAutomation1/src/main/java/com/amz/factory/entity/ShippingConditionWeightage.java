package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the shipping_condition_weightage database table.
 * 
 */
@Entity
@Table(name="shipping_condition_weightage")
@NamedQuery(name="ShippingConditionWeightage.findAll", query="SELECT s FROM ShippingConditionWeightage s")
public class ShippingConditionWeightage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="scw_id")
	private int scwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="scw_max")
	private String scwMax;

	@Column(name="scw_min")
	private String scwMin;

	@Column(name="scw_shipping_code")
	private String scwShippingCode;

	@Column(name="scw_truck_type")
	private String scwTruckType;

	@Column(name="scw_weightage")
	private String scwWeightage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_on")
	private Date updatedOn;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="added_by")
	private UserDetail userDetail1;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="updated_by")
	private UserDetail userDetail2;

	public ShippingConditionWeightage() {
	}

	public int getScwId() {
		return this.scwId;
	}

	public void setScwId(int scwId) {
		this.scwId = scwId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getScwMax() {
		return this.scwMax;
	}

	public void setScwMax(String scwMax) {
		this.scwMax = scwMax;
	}

	public String getScwMin() {
		return this.scwMin;
	}

	public void setScwMin(String scwMin) {
		this.scwMin = scwMin;
	}

	public String getScwShippingCode() {
		return this.scwShippingCode;
	}

	public void setScwShippingCode(String scwShippingCode) {
		this.scwShippingCode = scwShippingCode;
	}

	public String getScwTruckType() {
		return this.scwTruckType;
	}

	public void setScwTruckType(String scwTruckType) {
		this.scwTruckType = scwTruckType;
	}

	public String getScwWeightage() {
		return this.scwWeightage;
	}

	public void setScwWeightage(String scwWeightage) {
		this.scwWeightage = scwWeightage;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public UserDetail getUserDetail1() {
		return this.userDetail1;
	}

	public void setUserDetail1(UserDetail userDetail1) {
		this.userDetail1 = userDetail1;
	}

	public UserDetail getUserDetail2() {
		return this.userDetail2;
	}

	public void setUserDetail2(UserDetail userDetail2) {
		this.userDetail2 = userDetail2;
	}

}