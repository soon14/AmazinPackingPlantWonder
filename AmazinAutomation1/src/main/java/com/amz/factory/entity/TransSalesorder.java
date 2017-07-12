package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the trans_salesorder database table.
 * 
 */
@Entity
@Table(name="trans_salesorder")
@NamedQuery(name="TransSalesorder.findAll", query="SELECT t FROM TransSalesorder t")
public class TransSalesorder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="bidding_is_active")
	private String biddingIsActive;

	private String city;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="distribution_channel")
	private String distributionChannel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="document_date")
	private Date documentDate;

	@Column(name="is_active")
	private String isActive;

	@Column(name="is_sent")
	private int isSent;

	@Column(name="material_code")
	private int materialCode;

	@Column(name="material_desc")
	private String materialDesc;

	@Column(name="material_group")
	private String materialGroup;

	@Column(name="material_type")
	private String materialType;

	private int mrp;

	@Column(name="order_type")
	private String orderType;

	@Column(name="plant_code")
	private int plantCode;

	@Column(name="qty_mt")
	private String qtyMt;

	private int quantity;

	@Column(name="sales_order")
	private String salesOrder;

	@Column(name="sap_destination_code")
	private String sapDestinationCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="schedule_delivery_date")
	private Date scheduleDeliveryDate;

	@Column(name="scheduled_quantity")
	private int scheduledQuantity;

	@Column(name="ship_party_to")
	private String shipPartyTo;

	@Column(name="ship_to_party_code")
	private int shipToPartyCode;

	@Column(name="ship_to_party_name")
	private String shipToPartyName;

	@Column(name="shipment_type_id")
	private int shipmentTypeId;

	@Column(name="shipping_type")
	private int shippingType;

	@Column(name="shipping_type_id")
	private int shippingTypeId;

	@Column(name="so_state")
	private String soState;

	@Column(name="sole_to_party_code")
	private int soleToPartyCode;

	@Column(name="sole_to_party_name")
	private String soleToPartyName;

	private String state;

	private String status;

	@Column(name="transport_mode")
	private String transportMode;

	//bi-directional many-to-one association to TransConsignmentDetail
	@OneToMany(mappedBy="transSalesorder")
	private List<TransConsignmentDetail> transConsignmentDetails;

	public TransSalesorder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBiddingIsActive() {
		return this.biddingIsActive;
	}

	public void setBiddingIsActive(String biddingIsActive) {
		this.biddingIsActive = biddingIsActive;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getDistributionChannel() {
		return this.distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public Date getDocumentDate() {
		return this.documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getIsSent() {
		return this.isSent;
	}

	public void setIsSent(int isSent) {
		this.isSent = isSent;
	}

	public int getMaterialCode() {
		return this.materialCode;
	}

	public void setMaterialCode(int materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialDesc() {
		return this.materialDesc;
	}

	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}

	public String getMaterialGroup() {
		return this.materialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
	}

	public String getMaterialType() {
		return this.materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public int getMrp() {
		return this.mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getPlantCode() {
		return this.plantCode;
	}

	public void setPlantCode(int plantCode) {
		this.plantCode = plantCode;
	}

	public String getQtyMt() {
		return this.qtyMt;
	}

	public void setQtyMt(String qtyMt) {
		this.qtyMt = qtyMt;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSalesOrder() {
		return this.salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

	public String getSapDestinationCode() {
		return this.sapDestinationCode;
	}

	public void setSapDestinationCode(String sapDestinationCode) {
		this.sapDestinationCode = sapDestinationCode;
	}

	public Date getScheduleDeliveryDate() {
		return this.scheduleDeliveryDate;
	}

	public void setScheduleDeliveryDate(Date scheduleDeliveryDate) {
		this.scheduleDeliveryDate = scheduleDeliveryDate;
	}

	public int getScheduledQuantity() {
		return this.scheduledQuantity;
	}

	public void setScheduledQuantity(int scheduledQuantity) {
		this.scheduledQuantity = scheduledQuantity;
	}

	public String getShipPartyTo() {
		return this.shipPartyTo;
	}

	public void setShipPartyTo(String shipPartyTo) {
		this.shipPartyTo = shipPartyTo;
	}

	public int getShipToPartyCode() {
		return this.shipToPartyCode;
	}

	public void setShipToPartyCode(int shipToPartyCode) {
		this.shipToPartyCode = shipToPartyCode;
	}

	public String getShipToPartyName() {
		return this.shipToPartyName;
	}

	public void setShipToPartyName(String shipToPartyName) {
		this.shipToPartyName = shipToPartyName;
	}

	public int getShipmentTypeId() {
		return this.shipmentTypeId;
	}

	public void setShipmentTypeId(int shipmentTypeId) {
		this.shipmentTypeId = shipmentTypeId;
	}

	public int getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(int shippingType) {
		this.shippingType = shippingType;
	}

	public int getShippingTypeId() {
		return this.shippingTypeId;
	}

	public void setShippingTypeId(int shippingTypeId) {
		this.shippingTypeId = shippingTypeId;
	}

	public String getSoState() {
		return this.soState;
	}

	public void setSoState(String soState) {
		this.soState = soState;
	}

	public int getSoleToPartyCode() {
		return this.soleToPartyCode;
	}

	public void setSoleToPartyCode(int soleToPartyCode) {
		this.soleToPartyCode = soleToPartyCode;
	}

	public String getSoleToPartyName() {
		return this.soleToPartyName;
	}

	public void setSoleToPartyName(String soleToPartyName) {
		this.soleToPartyName = soleToPartyName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransportMode() {
		return this.transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public List<TransConsignmentDetail> getTransConsignmentDetails() {
		return this.transConsignmentDetails;
	}

	public void setTransConsignmentDetails(List<TransConsignmentDetail> transConsignmentDetails) {
		this.transConsignmentDetails = transConsignmentDetails;
	}

	public TransConsignmentDetail addTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().add(transConsignmentDetail);
		transConsignmentDetail.setTransSalesorder(this);

		return transConsignmentDetail;
	}

	public TransConsignmentDetail removeTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().remove(transConsignmentDetail);
		transConsignmentDetail.setTransSalesorder(null);

		return transConsignmentDetail;
	}

}