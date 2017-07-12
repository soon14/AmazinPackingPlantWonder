package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the trans_consign_clubbing database table.
 * 
 */
@Entity
@Table(name="trans_consign_clubbing")
@NamedQuery(name="TransConsignClubbing.findAll", query="SELECT t FROM TransConsignClubbing t")
public class TransConsignClubbing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	//bi-directional many-to-one association to TransConsignAllocationDetail
	@OneToMany(mappedBy="transConsignClubbing")
	private List<TransConsignAllocationDetail> transConsignAllocationDetails;

	//bi-directional many-to-one association to TransConsignBiddingPrice
	@OneToMany(mappedBy="transConsignClubbing")
	private List<TransConsignBiddingPrice> transConsignBiddingPrices;

	//bi-directional many-to-one association to TransConsignmentDetail
	@OneToMany(mappedBy="transConsignClubbing")
	private List<TransConsignmentDetail> transConsignmentDetails;

	//bi-directional many-to-one association to TransTripdetail
	@OneToMany(mappedBy="transConsignClubbing")
	private List<TransTripdetail> transTripdetails;

	public TransConsignClubbing() {
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

	public List<TransConsignAllocationDetail> getTransConsignAllocationDetails() {
		return this.transConsignAllocationDetails;
	}

	public void setTransConsignAllocationDetails(List<TransConsignAllocationDetail> transConsignAllocationDetails) {
		this.transConsignAllocationDetails = transConsignAllocationDetails;
	}

	public TransConsignAllocationDetail addTransConsignAllocationDetail(TransConsignAllocationDetail transConsignAllocationDetail) {
		getTransConsignAllocationDetails().add(transConsignAllocationDetail);
		transConsignAllocationDetail.setTransConsignClubbing(this);

		return transConsignAllocationDetail;
	}

	public TransConsignAllocationDetail removeTransConsignAllocationDetail(TransConsignAllocationDetail transConsignAllocationDetail) {
		getTransConsignAllocationDetails().remove(transConsignAllocationDetail);
		transConsignAllocationDetail.setTransConsignClubbing(null);

		return transConsignAllocationDetail;
	}

	public List<TransConsignBiddingPrice> getTransConsignBiddingPrices() {
		return this.transConsignBiddingPrices;
	}

	public void setTransConsignBiddingPrices(List<TransConsignBiddingPrice> transConsignBiddingPrices) {
		this.transConsignBiddingPrices = transConsignBiddingPrices;
	}

	public TransConsignBiddingPrice addTransConsignBiddingPrice(TransConsignBiddingPrice transConsignBiddingPrice) {
		getTransConsignBiddingPrices().add(transConsignBiddingPrice);
		transConsignBiddingPrice.setTransConsignClubbing(this);

		return transConsignBiddingPrice;
	}

	public TransConsignBiddingPrice removeTransConsignBiddingPrice(TransConsignBiddingPrice transConsignBiddingPrice) {
		getTransConsignBiddingPrices().remove(transConsignBiddingPrice);
		transConsignBiddingPrice.setTransConsignClubbing(null);

		return transConsignBiddingPrice;
	}

	public List<TransConsignmentDetail> getTransConsignmentDetails() {
		return this.transConsignmentDetails;
	}

	public void setTransConsignmentDetails(List<TransConsignmentDetail> transConsignmentDetails) {
		this.transConsignmentDetails = transConsignmentDetails;
	}

	public TransConsignmentDetail addTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().add(transConsignmentDetail);
		transConsignmentDetail.setTransConsignClubbing(this);

		return transConsignmentDetail;
	}

	public TransConsignmentDetail removeTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().remove(transConsignmentDetail);
		transConsignmentDetail.setTransConsignClubbing(null);

		return transConsignmentDetail;
	}

	public List<TransTripdetail> getTransTripdetails() {
		return this.transTripdetails;
	}

	public void setTransTripdetails(List<TransTripdetail> transTripdetails) {
		this.transTripdetails = transTripdetails;
	}

	public TransTripdetail addTransTripdetail(TransTripdetail transTripdetail) {
		getTransTripdetails().add(transTripdetail);
		transTripdetail.setTransConsignClubbing(this);

		return transTripdetail;
	}

	public TransTripdetail removeTransTripdetail(TransTripdetail transTripdetail) {
		getTransTripdetails().remove(transTripdetail);
		transTripdetail.setTransConsignClubbing(null);

		return transTripdetail;
	}

}