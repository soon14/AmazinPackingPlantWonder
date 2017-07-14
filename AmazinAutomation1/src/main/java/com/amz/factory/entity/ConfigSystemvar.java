package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_systemvar database table.
 * 
 */
@Entity
@Table(name="config_systemvar")
@NamedQuery(name="ConfigSystemvar.findAll", query="SELECT c FROM ConfigSystemvar c")
public class ConfigSystemvar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="is_automatic")
	private String isAutomatic;

	@Column(name="is_bidding")
	private String isBidding;

	@Column(name="is_manual")
	private String isManual;

	@Column(name="is_open_allocation")
	private String isOpenAllocation;

	@Column(name="is_percentage_wise_allocation")
	private String isPercentageWiseAllocation;

	public ConfigSystemvar() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsAutomatic() {
		return this.isAutomatic;
	}

	public void setIsAutomatic(String isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public String getIsBidding() {
		return this.isBidding;
	}

	public void setIsBidding(String isBidding) {
		this.isBidding = isBidding;
	}

	public String getIsManual() {
		return this.isManual;
	}

	public void setIsManual(String isManual) {
		this.isManual = isManual;
	}

	public String getIsOpenAllocation() {
		return this.isOpenAllocation;
	}

	public void setIsOpenAllocation(String isOpenAllocation) {
		this.isOpenAllocation = isOpenAllocation;
	}

	public String getIsPercentageWiseAllocation() {
		return this.isPercentageWiseAllocation;
	}

	public void setIsPercentageWiseAllocation(String isPercentageWiseAllocation) {
		this.isPercentageWiseAllocation = isPercentageWiseAllocation;
	}

}