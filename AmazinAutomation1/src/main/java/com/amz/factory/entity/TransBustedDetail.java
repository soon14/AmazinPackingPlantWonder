package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the trans_busted_detail database table.
 * 
 */
@Entity
@Table(name="trans_busted_detail")
@NamedQuery(name="TransBustedDetail.findAll", query="SELECT t FROM TransBustedDetail t")
public class TransBustedDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="busted_bag")
	private String bustedBag;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="busted_bag_time")
	private Date bustedBagTime;

	@Column(name="consignment_detail_id")
	private int consignmentDetailId;

	@Column(name="is_active")
	private String isActive;

	@Column(name="reusable_bags")
	private String reusableBags;

	@Column(name="verified_by")
	private String verifiedBy;

	@Column(name="verified_qty")
	private String verifiedQty;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="verified_time")
	private Date verifiedTime;

	public TransBustedDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBustedBag() {
		return this.bustedBag;
	}

	public void setBustedBag(String bustedBag) {
		this.bustedBag = bustedBag;
	}

	public Date getBustedBagTime() {
		return this.bustedBagTime;
	}

	public void setBustedBagTime(Date bustedBagTime) {
		this.bustedBagTime = bustedBagTime;
	}

	public int getConsignmentDetailId() {
		return this.consignmentDetailId;
	}

	public void setConsignmentDetailId(int consignmentDetailId) {
		this.consignmentDetailId = consignmentDetailId;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getReusableBags() {
		return this.reusableBags;
	}

	public void setReusableBags(String reusableBags) {
		this.reusableBags = reusableBags;
	}

	public String getVerifiedBy() {
		return this.verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public String getVerifiedQty() {
		return this.verifiedQty;
	}

	public void setVerifiedQty(String verifiedQty) {
		this.verifiedQty = verifiedQty;
	}

	public Date getVerifiedTime() {
		return this.verifiedTime;
	}

	public void setVerifiedTime(Date verifiedTime) {
		this.verifiedTime = verifiedTime;
	}

}