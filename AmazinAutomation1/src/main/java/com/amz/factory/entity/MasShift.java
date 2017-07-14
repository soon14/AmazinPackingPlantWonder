package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the mas_shift database table.
 * 
 */
@Entity
@Table(name="mas_shift")
@NamedQuery(name="MasShift.findAll", query="SELECT m FROM MasShift m")
public class MasShift implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private Time from;

	@Column(name="is_active")
	private String isActive;

	@Column(name="shift_type")
	private String shiftType;

	private Time to;

	public MasShift() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Time getFrom() {
		return this.from;
	}

	public void setFrom(Time from) {
		this.from = from;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getShiftType() {
		return this.shiftType;
	}

	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}

	public Time getTo() {
		return this.to;
	}

	public void setTo(Time to) {
		this.to = to;
	}

}