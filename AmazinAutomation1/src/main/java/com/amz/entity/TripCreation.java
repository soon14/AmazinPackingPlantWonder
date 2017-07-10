package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="trip_creation")
@Entity
public class TripCreation implements  Serializable 
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "trip_id")
	private String tripId;
	
	@Column(name = "vehicle_number")
	private String vehicleNumber;

	@Column(name = "order_number")
	private String orderNumber;
	
	@Column(name = "di_number")
	private String diNumber;
	
	@Column(name = "sales_channel")
	private String salesChannel;
	
	
	@Column(name = "product_id")
	private String productId;
	
	
	@Column(name = "qty")
	private String qty;
	
	
	
	@Column(name = "mrp")
	private String mrp;
	
	
	
	
	@Column(name = "loader_number")
	private String loaderNumber;
	
	
	
	
	@Column(name = "di_loading_sequence_id")
	private String diLoadingSequenceId;
	
	@Column(name = "is_active")
	private String isActive;
	



	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTripId() {
		return tripId;
	}




	public void setTripId(String tripId) {
		this.tripId = tripId;
	}




	public String getVehicleNumber() {
		return vehicleNumber;
	}




	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}




	public String getOrderNumber() {
		return orderNumber;
	}




	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}




	public String getDiNumber() {
		return diNumber;
	}




	public void setDiNumber(String diNumber) {
		this.diNumber = diNumber;
	}




	public String getSalesChannel() {
		return salesChannel;
	}




	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}




	public String getProductId() {
		return productId;
	}




	public void setProductId(String productId) {
		this.productId = productId;
	}




	public String getQty() {
		return qty;
	}




	public void setQty(String qty) {
		this.qty = qty;
	}




	public String getMrp() {
		return mrp;
	}




	public void setMrp(String mrp) {
		this.mrp = mrp;
	}




	public String getLoaderNumber() {
		return loaderNumber;
	}




	public void setLoaderNumber(String loaderNumber) {
		this.loaderNumber = loaderNumber;
	}




	public String getDiLoadingSequenceId() {
		return diLoadingSequenceId;
	}




	public void setDiLoadingSequenceId(String diLoadingSequenceId) {
		this.diLoadingSequenceId = diLoadingSequenceId;
	}




	public String getIsActive() {
		return isActive;
	}




	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	

	
	
}
