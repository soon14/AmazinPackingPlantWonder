package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_functiongroup database table.
 * 
 */
@Entity
@Table(name="mas_functiongroup")
@NamedQuery(name="MasFunctiongroup.findAll", query="SELECT m FROM MasFunctiongroup m")
public class MasFunctiongroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_sub_avl")
	private String isSubAvl;

	@Column(name="main_function_id")
	private int mainFunctionId;

	//bi-directional many-to-one association to MasFunction
	@ManyToOne
	@JoinColumn(name="sub_function_id")
	private MasFunction masFunction;

	public MasFunctiongroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsSubAvl() {
		return this.isSubAvl;
	}

	public void setIsSubAvl(String isSubAvl) {
		this.isSubAvl = isSubAvl;
	}

	public int getMainFunctionId() {
		return this.mainFunctionId;
	}

	public void setMainFunctionId(int mainFunctionId) {
		this.mainFunctionId = mainFunctionId;
	}

	public MasFunction getMasFunction() {
		return this.masFunction;
	}

	public void setMasFunction(MasFunction masFunction) {
		this.masFunction = masFunction;
	}

}