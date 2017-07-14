package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_printingformat database table.
 * 
 */
@Entity
@Table(name="mas_printingformat")
@NamedQuery(name="MasPrintingformat.findAll", query="SELECT m FROM MasPrintingformat m")
public class MasPrintingformat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="created_on")
	private String createdOn;

	@Column(name="is_active")
	private String isActive;

	@Column(name="is_prefix_applied")
	private String isPrefixApplied;

	@Column(name="key_value")
	private String keyValue;

	private String prefix;

	@Column(name="sequence_number")
	private String sequenceNumber;

	@Column(name="updated_on")
	private String updatedOn;

	private String value;

	public MasPrintingformat() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsPrefixApplied() {
		return this.isPrefixApplied;
	}

	public void setIsPrefixApplied(String isPrefixApplied) {
		this.isPrefixApplied = isPrefixApplied;
	}

	public String getKeyValue() {
		return this.keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSequenceNumber() {
		return this.sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}