package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the trans_consignment_detail database table.
 * 
 */
@Entity
@Table(name="trans_consignment_detail")
@NamedQuery(name="TransConsignmentDetail.findAll", query="SELECT t FROM TransConsignmentDetail t")
public class TransConsignmentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="bag_count_complete")
	private String bagCountComplete;

	@Column(name="bag_type")
	private String bagType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="di_creation")
	private Date diCreation;

	@Column(name="di_number")
	private int diNumber;

	@Column(name="diverted_loader")
	private String divertedLoader;

	@Column(name="is_active")
	private String isActive;

	private String LR_number1;

	private String LR_number2;

	private String mrp;

	@Column(name="mrp_complete")
	private String mrpComplete;

	@Column(name="no_of_bags")
	private int noOfBags;

	@Column(name="plantmaster_id")
	private int plantmasterId;

	@Column(name="product_code")
	private String productCode;

	@Column(name="sequenced_loader")
	private String sequencedLoader;

	//bi-directional many-to-one association to TransConsignClubbing
	@ManyToOne
	@JoinColumn(name="consignclubbing_id")
	private TransConsignClubbing transConsignClubbing;

	//bi-directional many-to-one association to DriverDetail
	@ManyToOne
	@JoinColumn(name="driver_detail_id")
	private DriverDetail driverDetail;

	//bi-directional many-to-one association to MasProduction
	@ManyToOne
	@JoinColumn(name="productionmaster_id")
	private MasProduction masProduction;

	//bi-directional many-to-one association to TransSalesorder
	@ManyToOne
	@JoinColumn(name="salesorder_id")
	private TransSalesorder transSalesorder;

	public TransConsignmentDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBagCountComplete() {
		return this.bagCountComplete;
	}

	public void setBagCountComplete(String bagCountComplete) {
		this.bagCountComplete = bagCountComplete;
	}

	public String getBagType() {
		return this.bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public Date getDiCreation() {
		return this.diCreation;
	}

	public void setDiCreation(Date diCreation) {
		this.diCreation = diCreation;
	}

	public int getDiNumber() {
		return this.diNumber;
	}

	public void setDiNumber(int diNumber) {
		this.diNumber = diNumber;
	}

	public String getDivertedLoader() {
		return this.divertedLoader;
	}

	public void setDivertedLoader(String divertedLoader) {
		this.divertedLoader = divertedLoader;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getLR_number1() {
		return this.LR_number1;
	}

	public void setLR_number1(String LR_number1) {
		this.LR_number1 = LR_number1;
	}

	public String getLR_number2() {
		return this.LR_number2;
	}

	public void setLR_number2(String LR_number2) {
		this.LR_number2 = LR_number2;
	}

	public String getMrp() {
		return this.mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getMrpComplete() {
		return this.mrpComplete;
	}

	public void setMrpComplete(String mrpComplete) {
		this.mrpComplete = mrpComplete;
	}

	public int getNoOfBags() {
		return this.noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}

	public int getPlantmasterId() {
		return this.plantmasterId;
	}

	public void setPlantmasterId(int plantmasterId) {
		this.plantmasterId = plantmasterId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSequencedLoader() {
		return this.sequencedLoader;
	}

	public void setSequencedLoader(String sequencedLoader) {
		this.sequencedLoader = sequencedLoader;
	}

	public TransConsignClubbing getTransConsignClubbing() {
		return this.transConsignClubbing;
	}

	public void setTransConsignClubbing(TransConsignClubbing transConsignClubbing) {
		this.transConsignClubbing = transConsignClubbing;
	}

	public DriverDetail getDriverDetail() {
		return this.driverDetail;
	}

	public void setDriverDetail(DriverDetail driverDetail) {
		this.driverDetail = driverDetail;
	}

	public MasProduction getMasProduction() {
		return this.masProduction;
	}

	public void setMasProduction(MasProduction masProduction) {
		this.masProduction = masProduction;
	}

	public TransSalesorder getTransSalesorder() {
		return this.transSalesorder;
	}

	public void setTransSalesorder(TransSalesorder transSalesorder) {
		this.transSalesorder = transSalesorder;
	}

}