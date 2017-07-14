package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_salesoffice database table.
 * 
 */
@Entity
@Table(name="mas_salesoffice")
@NamedQuery(name="MasSalesoffice.findAll", query="SELECT m FROM MasSalesoffice m")
public class MasSalesoffice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="bidding_sales_is_active")
	private String biddingSalesIsActive;

	@Column(name="is_active")
	private String isActive;

	@Column(name="plantmaster_id")
	private int plantmasterId;

	@Column(name="sales_office_code")
	private String salesOfficeCode;

	@Column(name="sales_office_name")
	private String salesOfficeName;

	public MasSalesoffice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBiddingSalesIsActive() {
		return this.biddingSalesIsActive;
	}

	public void setBiddingSalesIsActive(String biddingSalesIsActive) {
		this.biddingSalesIsActive = biddingSalesIsActive;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getPlantmasterId() {
		return this.plantmasterId;
	}

	public void setPlantmasterId(int plantmasterId) {
		this.plantmasterId = plantmasterId;
	}

	public String getSalesOfficeCode() {
		return this.salesOfficeCode;
	}

	public void setSalesOfficeCode(String salesOfficeCode) {
		this.salesOfficeCode = salesOfficeCode;
	}

	public String getSalesOfficeName() {
		return this.salesOfficeName;
	}

	public void setSalesOfficeName(String salesOfficeName) {
		this.salesOfficeName = salesOfficeName;
	}

}