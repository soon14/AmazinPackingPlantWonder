package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="sales_channel_master")
@Entity
public class SalesChannelMaster implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "sales_channel")
	private String sales_channel;
	@Column(name = "is_Active")
	private String is_Active;
	
	@Column(name = "sales_channel_code")
	private String sales_channel_code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSales_channel() {
		return sales_channel;
	}

	public void setSales_channel(String sales_channel) {
		this.sales_channel = sales_channel;
	}

	public String getIs_Active() {
		return is_Active;
	}

	public void setIs_Active(String is_Active) {
		this.is_Active = is_Active;
	}

	public String getSales_channel_code() {
		return sales_channel_code;
	}

	public void setSales_channel_code(String sales_channel_code) {
		this.sales_channel_code = sales_channel_code;
	}


	
}