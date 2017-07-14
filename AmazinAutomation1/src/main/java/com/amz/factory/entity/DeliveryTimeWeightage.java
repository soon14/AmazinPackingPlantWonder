package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the delivery_time_weightage database table.
 * 
 */
@Entity
@Table(name="delivery_time_weightage")
@NamedQuery(name="DeliveryTimeWeightage.findAll", query="SELECT d FROM DeliveryTimeWeightage d")
public class DeliveryTimeWeightage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dtw_id")
	private int dtwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="dtw_max_hrs")
	private String dtwMaxHrs;

	@Column(name="dtw_min_hrs")
	private String dtwMinHrs;

	@Column(name="dtw_weightage")
	private String dtwWeightage;

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

	//bi-directional many-to-one association to DeliveryTimeWeightageHistory
	@OneToMany(mappedBy="deliveryTimeWeightage")
	private List<DeliveryTimeWeightageHistory> deliveryTimeWeightageHistories;

	public DeliveryTimeWeightage() {
	}

	public int getDtwId() {
		return this.dtwId;
	}

	public void setDtwId(int dtwId) {
		this.dtwId = dtwId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDtwMaxHrs() {
		return this.dtwMaxHrs;
	}

	public void setDtwMaxHrs(String dtwMaxHrs) {
		this.dtwMaxHrs = dtwMaxHrs;
	}

	public String getDtwMinHrs() {
		return this.dtwMinHrs;
	}

	public void setDtwMinHrs(String dtwMinHrs) {
		this.dtwMinHrs = dtwMinHrs;
	}

	public String getDtwWeightage() {
		return this.dtwWeightage;
	}

	public void setDtwWeightage(String dtwWeightage) {
		this.dtwWeightage = dtwWeightage;
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

	public List<DeliveryTimeWeightageHistory> getDeliveryTimeWeightageHistories() {
		return this.deliveryTimeWeightageHistories;
	}

	public void setDeliveryTimeWeightageHistories(List<DeliveryTimeWeightageHistory> deliveryTimeWeightageHistories) {
		this.deliveryTimeWeightageHistories = deliveryTimeWeightageHistories;
	}

	public DeliveryTimeWeightageHistory addDeliveryTimeWeightageHistory(DeliveryTimeWeightageHistory deliveryTimeWeightageHistory) {
		getDeliveryTimeWeightageHistories().add(deliveryTimeWeightageHistory);
		deliveryTimeWeightageHistory.setDeliveryTimeWeightage(this);

		return deliveryTimeWeightageHistory;
	}

	public DeliveryTimeWeightageHistory removeDeliveryTimeWeightageHistory(DeliveryTimeWeightageHistory deliveryTimeWeightageHistory) {
		getDeliveryTimeWeightageHistories().remove(deliveryTimeWeightageHistory);
		deliveryTimeWeightageHistory.setDeliveryTimeWeightage(null);

		return deliveryTimeWeightageHistory;
	}

}