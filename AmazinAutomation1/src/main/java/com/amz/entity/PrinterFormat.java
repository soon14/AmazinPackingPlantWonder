package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="printer_format")
@Entity
public class PrinterFormat implements Serializable 

{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "sequence_number")
	private String sequence_number;
	@Column(name = "updated_on")
	private String updated_on;
	
	@Column(name = "created_on")
	private String created_on;
	@Column(name = "is_active")
	private String is_active;
	
	
	@Column(name = "is_prefix_applied")
	private String is_prefix_applied;
	@Column(name = "prefix")
	private String prefix;
	
	
	
	@Column(name = "value")
	private String value;
	@Column(name = "key_value")
	private String keyvalue;
	
	
	public String getKeyvalue() {
		return keyvalue;
	}
	public void setKeyvalue(String keyvalue) {
		this.keyvalue = keyvalue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSequence_number() {
		return sequence_number;
	}
	public void setSequence_number(String sequence_number) {
		this.sequence_number = sequence_number;
	}
	public String getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getIs_prefix_applied() {
		return is_prefix_applied;
	}
	public void setIs_prefix_applied(String is_prefix_applied) {
		this.is_prefix_applied = is_prefix_applied;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
		
}
	
	
	