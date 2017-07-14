package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_vehicle database table.
 * 
 */
@Entity
@Table(name="mas_vehicle")
@NamedQuery(name="MasVehicle.findAll", query="SELECT m FROM MasVehicle m")
public class MasVehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="certified_capacity")
	private String certifiedCapacity;

	@Column(name="chassis_number")
	private String chassisNumber;

	private String column1;

	@Column(name="fitness_expiry_date")
	private String fitnessExpiryDate;

	@Column(name="manufacturing_date")
	private String manufacturingDate;

	@Column(name="model_number")
	private String modelNumber;

	@Column(name="no_of_wheels")
	private int noOfWheels;

	@Column(name="permit_state")
	private String permitState;

	@Column(name="permit_validity")
	private String permitValidity;

	@Column(name="pollution_certificate_number")
	private String pollutionCertificateNumber;

	@Column(name="pollution_expiry_date")
	private String pollutionExpiryDate;

	@Column(name="road_tax_renewable_date")
	private String roadTaxRenewableDate;

	@Column(name="tag_id")
	private String tagId;

	@Column(name="vehicle_cap_max")
	private int vehicleCapMax;

	@Column(name="vehicle_cap_min")
	private int vehicleCapMin;

	@Column(name="vehicle_number")
	private String vehicleNumber;

	@Column(name="vehicle_type")
	private String vehicleType;

	@Column(name="year_of_manufacturing")
	private String yearOfManufacturing;

	public MasVehicle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCertifiedCapacity() {
		return this.certifiedCapacity;
	}

	public void setCertifiedCapacity(String certifiedCapacity) {
		this.certifiedCapacity = certifiedCapacity;
	}

	public String getChassisNumber() {
		return this.chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getColumn1() {
		return this.column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getFitnessExpiryDate() {
		return this.fitnessExpiryDate;
	}

	public void setFitnessExpiryDate(String fitnessExpiryDate) {
		this.fitnessExpiryDate = fitnessExpiryDate;
	}

	public String getManufacturingDate() {
		return this.manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public String getModelNumber() {
		return this.modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getPermitState() {
		return this.permitState;
	}

	public void setPermitState(String permitState) {
		this.permitState = permitState;
	}

	public String getPermitValidity() {
		return this.permitValidity;
	}

	public void setPermitValidity(String permitValidity) {
		this.permitValidity = permitValidity;
	}

	public String getPollutionCertificateNumber() {
		return this.pollutionCertificateNumber;
	}

	public void setPollutionCertificateNumber(String pollutionCertificateNumber) {
		this.pollutionCertificateNumber = pollutionCertificateNumber;
	}

	public String getPollutionExpiryDate() {
		return this.pollutionExpiryDate;
	}

	public void setPollutionExpiryDate(String pollutionExpiryDate) {
		this.pollutionExpiryDate = pollutionExpiryDate;
	}

	public String getRoadTaxRenewableDate() {
		return this.roadTaxRenewableDate;
	}

	public void setRoadTaxRenewableDate(String roadTaxRenewableDate) {
		this.roadTaxRenewableDate = roadTaxRenewableDate;
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public int getVehicleCapMax() {
		return this.vehicleCapMax;
	}

	public void setVehicleCapMax(int vehicleCapMax) {
		this.vehicleCapMax = vehicleCapMax;
	}

	public int getVehicleCapMin() {
		return this.vehicleCapMin;
	}

	public void setVehicleCapMin(int vehicleCapMin) {
		this.vehicleCapMin = vehicleCapMin;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getYearOfManufacturing() {
		return this.yearOfManufacturing;
	}

	public void setYearOfManufacturing(String yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

}