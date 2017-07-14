package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trans_consign_bidding_price database table.
 * 
 */
@Entity
@Table(name="trans_consign_bidding_price")
@NamedQuery(name="TransConsignBiddingPrice.findAll", query="SELECT t FROM TransConsignBiddingPrice t")
public class TransConsignBiddingPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="is_active")
	private String isActive;

	private String price;

	//bi-directional many-to-one association to TransConsignClubbing
	@ManyToOne
	@JoinColumn(name="consignclubbing_id")
	private TransConsignClubbing transConsignClubbing;

	//bi-directional many-to-one association to MasTransporter
	@ManyToOne
	@JoinColumn(name="transportermaster_id")
	private MasTransporter masTransporter;

	public TransConsignBiddingPrice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public TransConsignClubbing getTransConsignClubbing() {
		return this.transConsignClubbing;
	}

	public void setTransConsignClubbing(TransConsignClubbing transConsignClubbing) {
		this.transConsignClubbing = transConsignClubbing;
	}

	public MasTransporter getMasTransporter() {
		return this.masTransporter;
	}

	public void setMasTransporter(MasTransporter masTransporter) {
		this.masTransporter = masTransporter;
	}

}