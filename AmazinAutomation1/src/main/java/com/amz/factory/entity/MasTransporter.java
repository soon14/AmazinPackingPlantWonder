package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_transporter database table.
 * 
 */
@Entity
@Table(name="mas_transporter")
@NamedQuery(name="MasTransporter.findAll", query="SELECT m FROM MasTransporter m")
public class MasTransporter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="allocation_is_active")
	private String allocationIsActive;

	@Column(name="allocation_percentage")
	private String allocationPercentage;

	@Column(name="alternate_contactno")
	private String alternateContactno;

	private String city;

	private String contactnumber;

	private String contactperson;

	private String country;

	private String district;

	@Column(name="`email-id`")
	private String email_id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="is_bidding")
	private String isBidding;

	@Column(name="is_bidding_active")
	private String isBiddingActive;

	@Column(name="mobile_no")
	private String mobileNo;

	@Column(name="owner_add")
	private String ownerAdd;

	@Column(name="owner_dob")
	private String ownerDob;

	@Column(name="owner_name")
	private String ownerName;

	private String pincode;

	private String state;

	@Column(name="transporter_code")
	private String transporterCode;

	@Column(name="transporter_name")
	private String transporterName;

	//bi-directional many-to-one association to MapDesTrptrQty
	@OneToMany(mappedBy="masTransporter")
	private List<MapDesTrptrQty> mapDesTrptrQties;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plantmaster_id")
	private MasPlant masPlant;

	//bi-directional many-to-one association to TransConsignAllocationDetail
	@OneToMany(mappedBy="masTransporter")
	private List<TransConsignAllocationDetail> transConsignAllocationDetails;

	//bi-directional many-to-one association to TransConsignBiddingPrice
	@OneToMany(mappedBy="masTransporter")
	private List<TransConsignBiddingPrice> transConsignBiddingPrices;

	//bi-directional many-to-one association to TransTripdetail
	@OneToMany(mappedBy="masTransporter")
	private List<TransTripdetail> transTripdetails;

	public MasTransporter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAllocationIsActive() {
		return this.allocationIsActive;
	}

	public void setAllocationIsActive(String allocationIsActive) {
		this.allocationIsActive = allocationIsActive;
	}

	public String getAllocationPercentage() {
		return this.allocationPercentage;
	}

	public void setAllocationPercentage(String allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}

	public String getAlternateContactno() {
		return this.alternateContactno;
	}

	public void setAlternateContactno(String alternateContactno) {
		this.alternateContactno = alternateContactno;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactnumber() {
		return this.contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getContactperson() {
		return this.contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail_id() {
		return this.email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsBidding() {
		return this.isBidding;
	}

	public void setIsBidding(String isBidding) {
		this.isBidding = isBidding;
	}

	public String getIsBiddingActive() {
		return this.isBiddingActive;
	}

	public void setIsBiddingActive(String isBiddingActive) {
		this.isBiddingActive = isBiddingActive;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOwnerAdd() {
		return this.ownerAdd;
	}

	public void setOwnerAdd(String ownerAdd) {
		this.ownerAdd = ownerAdd;
	}

	public String getOwnerDob() {
		return this.ownerDob;
	}

	public void setOwnerDob(String ownerDob) {
		this.ownerDob = ownerDob;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTransporterCode() {
		return this.transporterCode;
	}

	public void setTransporterCode(String transporterCode) {
		this.transporterCode = transporterCode;
	}

	public String getTransporterName() {
		return this.transporterName;
	}

	public void setTransporterName(String transporterName) {
		this.transporterName = transporterName;
	}

	public List<MapDesTrptrQty> getMapDesTrptrQties() {
		return this.mapDesTrptrQties;
	}

	public void setMapDesTrptrQties(List<MapDesTrptrQty> mapDesTrptrQties) {
		this.mapDesTrptrQties = mapDesTrptrQties;
	}

	public MapDesTrptrQty addMapDesTrptrQty(MapDesTrptrQty mapDesTrptrQty) {
		getMapDesTrptrQties().add(mapDesTrptrQty);
		mapDesTrptrQty.setMasTransporter(this);

		return mapDesTrptrQty;
	}

	public MapDesTrptrQty removeMapDesTrptrQty(MapDesTrptrQty mapDesTrptrQty) {
		getMapDesTrptrQties().remove(mapDesTrptrQty);
		mapDesTrptrQty.setMasTransporter(null);

		return mapDesTrptrQty;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

	public List<TransConsignAllocationDetail> getTransConsignAllocationDetails() {
		return this.transConsignAllocationDetails;
	}

	public void setTransConsignAllocationDetails(List<TransConsignAllocationDetail> transConsignAllocationDetails) {
		this.transConsignAllocationDetails = transConsignAllocationDetails;
	}

	public TransConsignAllocationDetail addTransConsignAllocationDetail(TransConsignAllocationDetail transConsignAllocationDetail) {
		getTransConsignAllocationDetails().add(transConsignAllocationDetail);
		transConsignAllocationDetail.setMasTransporter(this);

		return transConsignAllocationDetail;
	}

	public TransConsignAllocationDetail removeTransConsignAllocationDetail(TransConsignAllocationDetail transConsignAllocationDetail) {
		getTransConsignAllocationDetails().remove(transConsignAllocationDetail);
		transConsignAllocationDetail.setMasTransporter(null);

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
		transConsignBiddingPrice.setMasTransporter(this);

		return transConsignBiddingPrice;
	}

	public TransConsignBiddingPrice removeTransConsignBiddingPrice(TransConsignBiddingPrice transConsignBiddingPrice) {
		getTransConsignBiddingPrices().remove(transConsignBiddingPrice);
		transConsignBiddingPrice.setMasTransporter(null);

		return transConsignBiddingPrice;
	}

	public List<TransTripdetail> getTransTripdetails() {
		return this.transTripdetails;
	}

	public void setTransTripdetails(List<TransTripdetail> transTripdetails) {
		this.transTripdetails = transTripdetails;
	}

	public TransTripdetail addTransTripdetail(TransTripdetail transTripdetail) {
		getTransTripdetails().add(transTripdetail);
		transTripdetail.setMasTransporter(this);

		return transTripdetail;
	}

	public TransTripdetail removeTransTripdetail(TransTripdetail transTripdetail) {
		getTransTripdetails().remove(transTripdetail);
		transTripdetail.setMasTransporter(null);

		return transTripdetail;
	}

}