package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the shipping_condition_weightage_history database table.
 * 
 */
@Entity
@Table(name="shipping_condition_weightage_history")
@NamedQuery(name="ShippingConditionWeightageHistory.findAll", query="SELECT s FROM ShippingConditionWeightageHistory s")
public class ShippingConditionWeightageHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="scwh_id")
	private int scwhId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="scwh_last_updtd_on")
	private Date scwhLastUpdtdOn;

	@Column(name="scwh_last_weightage")
	private String scwhLastWeightage;

	@Column(name="scwh_scw_id")
	private int scwhScwId;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="scwh_last_updtd_by")
	private UserDetail userDetail;

	public ShippingConditionWeightageHistory() {
	}

	public int getScwhId() {
		return this.scwhId;
	}

	public void setScwhId(int scwhId) {
		this.scwhId = scwhId;
	}

	public Date getScwhLastUpdtdOn() {
		return this.scwhLastUpdtdOn;
	}

	public void setScwhLastUpdtdOn(Date scwhLastUpdtdOn) {
		this.scwhLastUpdtdOn = scwhLastUpdtdOn;
	}

	public String getScwhLastWeightage() {
		return this.scwhLastWeightage;
	}

	public void setScwhLastWeightage(String scwhLastWeightage) {
		this.scwhLastWeightage = scwhLastWeightage;
	}

	public int getScwhScwId() {
		return this.scwhScwId;
	}

	public void setScwhScwId(int scwhScwId) {
		this.scwhScwId = scwhScwId;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}