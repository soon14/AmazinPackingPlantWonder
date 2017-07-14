package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the mas_bidding_timeperiod database table.
 * 
 */
@Entity
@Table(name="mas_bidding_timeperiod")
@NamedQuery(name="MasBiddingTimeperiod.findAll", query="SELECT m FROM MasBiddingTimeperiod m")
public class MasBiddingTimeperiod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private Time from;

	@Column(name="is_active")
	private String isActive;

	private Time to;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plant")
	private MasPlant masPlant;

	public MasBiddingTimeperiod() {
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

	public Time getTo() {
		return this.to;
	}

	public void setTo(Time to) {
		this.to = to;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

}