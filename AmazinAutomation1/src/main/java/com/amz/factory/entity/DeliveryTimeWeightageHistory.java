package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the delivery_time_weightage_history database table.
 * 
 */
@Entity
@Table(name="delivery_time_weightage_history")
@NamedQuery(name="DeliveryTimeWeightageHistory.findAll", query="SELECT d FROM DeliveryTimeWeightageHistory d")
public class DeliveryTimeWeightageHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dtwh_id")
	private int dtwhId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dtwh_last_updtd_on")
	private Date dtwhLastUpdtdOn;

	@Column(name="dtwh_last_weightage")
	private String dtwhLastWeightage;

	//bi-directional many-to-one association to DeliveryTimeWeightage
	@ManyToOne
	@JoinColumn(name="dtwh_dtw_id")
	private DeliveryTimeWeightage deliveryTimeWeightage;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="dtwh_last_updtd_by")
	private UserDetail userDetail;

	public DeliveryTimeWeightageHistory() {
	}

	public int getDtwhId() {
		return this.dtwhId;
	}

	public void setDtwhId(int dtwhId) {
		this.dtwhId = dtwhId;
	}

	public Date getDtwhLastUpdtdOn() {
		return this.dtwhLastUpdtdOn;
	}

	public void setDtwhLastUpdtdOn(Date dtwhLastUpdtdOn) {
		this.dtwhLastUpdtdOn = dtwhLastUpdtdOn;
	}

	public String getDtwhLastWeightage() {
		return this.dtwhLastWeightage;
	}

	public void setDtwhLastWeightage(String dtwhLastWeightage) {
		this.dtwhLastWeightage = dtwhLastWeightage;
	}

	public DeliveryTimeWeightage getDeliveryTimeWeightage() {
		return this.deliveryTimeWeightage;
	}

	public void setDeliveryTimeWeightage(DeliveryTimeWeightage deliveryTimeWeightage) {
		this.deliveryTimeWeightage = deliveryTimeWeightage;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}