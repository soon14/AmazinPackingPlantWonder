package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the trans_tripdetail database table.
 * 
 */
@Entity
@Table(name="trans_tripdetail")
@NamedQuery(name="TransTripdetail.findAll", query="SELECT t FROM TransTripdetail t")
public class TransTripdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="announcement_time")
	private Date announcementTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="consignment_creation")
	private Date consignmentCreation;

	@Column(name="driver_licence")
	private String driverLicence;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="final_out")
	private Date finalOut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gate_out")
	private Date gateOut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gross_wt")
	private Date grossWt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="out_yard_in")
	private Date outYardIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="out_yard_out")
	private Date outYardOut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="packing_in")
	private Date packingIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="packing_out")
	private Date packingOut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plant_gate_in")
	private Date plantGateIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sequenced_time")
	private Date sequencedTime;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tare_weight")
	private Date tareWeight;

	@Column(name="vehicle_number")
	private String vehicleNumber;

	//bi-directional many-to-one association to TransConsignClubbing
	@ManyToOne
	@JoinColumn(name="consign_clubbing_id")
	private TransConsignClubbing transConsignClubbing;

	//bi-directional many-to-one association to MasTransporter
	@ManyToOne
	@JoinColumn(name="transporter_id")
	private MasTransporter masTransporter;

	public TransTripdetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAnnouncementTime() {
		return this.announcementTime;
	}

	public void setAnnouncementTime(Date announcementTime) {
		this.announcementTime = announcementTime;
	}

	public Date getConsignmentCreation() {
		return this.consignmentCreation;
	}

	public void setConsignmentCreation(Date consignmentCreation) {
		this.consignmentCreation = consignmentCreation;
	}

	public String getDriverLicence() {
		return this.driverLicence;
	}

	public void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}

	public Date getFinalOut() {
		return this.finalOut;
	}

	public void setFinalOut(Date finalOut) {
		this.finalOut = finalOut;
	}

	public Date getGateOut() {
		return this.gateOut;
	}

	public void setGateOut(Date gateOut) {
		this.gateOut = gateOut;
	}

	public Date getGrossWt() {
		return this.grossWt;
	}

	public void setGrossWt(Date grossWt) {
		this.grossWt = grossWt;
	}

	public Date getOutYardIn() {
		return this.outYardIn;
	}

	public void setOutYardIn(Date outYardIn) {
		this.outYardIn = outYardIn;
	}

	public Date getOutYardOut() {
		return this.outYardOut;
	}

	public void setOutYardOut(Date outYardOut) {
		this.outYardOut = outYardOut;
	}

	public Date getPackingIn() {
		return this.packingIn;
	}

	public void setPackingIn(Date packingIn) {
		this.packingIn = packingIn;
	}

	public Date getPackingOut() {
		return this.packingOut;
	}

	public void setPackingOut(Date packingOut) {
		this.packingOut = packingOut;
	}

	public Date getPlantGateIn() {
		return this.plantGateIn;
	}

	public void setPlantGateIn(Date plantGateIn) {
		this.plantGateIn = plantGateIn;
	}

	public Date getSequencedTime() {
		return this.sequencedTime;
	}

	public void setSequencedTime(Date sequencedTime) {
		this.sequencedTime = sequencedTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTareWeight() {
		return this.tareWeight;
	}

	public void setTareWeight(Date tareWeight) {
		this.tareWeight = tareWeight;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public TransConsignClubbing getTransConsignClubbing() {
		return this.transConsignClubbing;
	}

	public void setTransConsignClubbing(TransConsignClubbing transConsignClubbing) {
		this.transConsignClubbing = transConsignClubbing;
	}

	public MasTransporter getMasTransporter() {
		return this.masTransporter;
	}

	public void setMasTransporter(MasTransporter masTransporter) {
		this.masTransporter = masTransporter;
	}

}