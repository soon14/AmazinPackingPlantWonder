package com.amz.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "di_master")
@Entity
public class DiMaster implements Serializable
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "trip_id")
	private String trip_id;
	
	@Column(name = "order_number")
	private String order_number;
	@Column(name = "di_loading_sequence_id")
	private String di_loding_sequence_id;
	@Column(name = "qty")
	private String qty;
	
	@Column(name = "mrp")
	private String mrp;
	@Column(name = "loader_number")
	private String loader_number;
	@Column(name = "sales_channel")
	private String sales_channel;
	 
	
	@Column(name = "di_number")
	private String di_number;
	@Column(name = "is_active")
	private String is_active;
	@Column(name = "product_id")
	private String product_id;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTrip_id() {
		return trip_id;
	}


	public void setTrip_id(String trip_id) {
		this.trip_id = trip_id;
	}


	public String getOrder_number() {
		return order_number;
	}


	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}


	public String getDi_loding_sequence_id() {
		return di_loding_sequence_id;
	}


	public void setDi_loding_sequence_id(String di_loding_sequence_id) {
		this.di_loding_sequence_id = di_loding_sequence_id;
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


	public String getLoader_number() {
		return loader_number;
	}


	public void setLoader_number(String loader_number) {
		this.loader_number = loader_number;
	}


	public String getSales_channel() {
		return sales_channel;
	}


	public void setSales_channel(String sales_channel) {
		this.sales_channel = sales_channel;
	}


	public String getDi_number() {
		return di_number;
	}


	public void setDi_number(String di_number) {
		this.di_number = di_number;
	}


	public String getIs_active() {
		return is_active;
	}


	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	
	

	@OneToMany(fetch = FetchType.EAGER,mappedBy="id",cascade = CascadeType.ALL)
	private List<BustedDetail> bustedDetail;


	public List<BustedDetail> getBustedDetail() {
		return bustedDetail;
	}


	public void setBustedDetail(List<BustedDetail> bustedDetail) {
		this.bustedDetail = bustedDetail;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="id", cascade=CascadeType.ALL)
	private List<BustedDetail> bustedDetails;


	public List<BustedDetail> getBustedDetails() {
		return bustedDetails;
	}


	public void setBustedDetails(List<BustedDetail> bustedDetails) {
		this.bustedDetails = bustedDetails;
	}


	
	
	
}
