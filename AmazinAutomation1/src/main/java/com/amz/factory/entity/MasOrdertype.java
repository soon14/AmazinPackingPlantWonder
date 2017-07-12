package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_ordertype database table.
 * 
 */
@Entity
@Table(name="mas_ordertype")
@NamedQuery(name="MasOrdertype.findAll", query="SELECT m FROM MasOrdertype m")
public class MasOrdertype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="order_type_code")
	private String orderTypeCode;

	@Column(name="order_type_name")
	private String orderTypeName;

	public MasOrdertype() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderTypeCode() {
		return this.orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public String getOrderTypeName() {
		return this.orderTypeName;
	}

	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}

}