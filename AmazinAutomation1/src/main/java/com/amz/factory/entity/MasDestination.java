package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_destination database table.
 * 
 */
@Entity
@Table(name="mas_destination")
@NamedQuery(name="MasDestination.findAll", query="SELECT m FROM MasDestination m")
public class MasDestination implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="allocated_bidding_qty")
	private String allocatedBiddingQty;

	@Column(name="dest_is_active")
	private String destIsActive;

	@Column(name="dest_is_bidding_active")
	private String destIsBiddingActive;

	private String destination;

	@Column(name="destination_code")
	private String destinationCode;

	private String frieght;

	@Column(name="remaining_bidding_qty")
	private String remainingBiddingQty;

	@Column(name="target_qty")
	private String targetQty;

	//bi-directional many-to-one association to MapDesTrptrQty
	@OneToMany(mappedBy="masDestination")
	private List<MapDesTrptrQty> mapDesTrptrQties;

	//bi-directional many-to-one association to MasDestinationType
	@ManyToOne
	@JoinColumn(name="destination_type_id")
	private MasDestinationType masDestinationType;

	public MasDestination() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAllocatedBiddingQty() {
		return this.allocatedBiddingQty;
	}

	public void setAllocatedBiddingQty(String allocatedBiddingQty) {
		this.allocatedBiddingQty = allocatedBiddingQty;
	}

	public String getDestIsActive() {
		return this.destIsActive;
	}

	public void setDestIsActive(String destIsActive) {
		this.destIsActive = destIsActive;
	}

	public String getDestIsBiddingActive() {
		return this.destIsBiddingActive;
	}

	public void setDestIsBiddingActive(String destIsBiddingActive) {
		this.destIsBiddingActive = destIsBiddingActive;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestinationCode() {
		return this.destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public String getFrieght() {
		return this.frieght;
	}

	public void setFrieght(String frieght) {
		this.frieght = frieght;
	}

	public String getRemainingBiddingQty() {
		return this.remainingBiddingQty;
	}

	public void setRemainingBiddingQty(String remainingBiddingQty) {
		this.remainingBiddingQty = remainingBiddingQty;
	}

	public String getTargetQty() {
		return this.targetQty;
	}

	public void setTargetQty(String targetQty) {
		this.targetQty = targetQty;
	}

	public List<MapDesTrptrQty> getMapDesTrptrQties() {
		return this.mapDesTrptrQties;
	}

	public void setMapDesTrptrQties(List<MapDesTrptrQty> mapDesTrptrQties) {
		this.mapDesTrptrQties = mapDesTrptrQties;
	}

	public MapDesTrptrQty addMapDesTrptrQty(MapDesTrptrQty mapDesTrptrQty) {
		getMapDesTrptrQties().add(mapDesTrptrQty);
		mapDesTrptrQty.setMasDestination(this);

		return mapDesTrptrQty;
	}

	public MapDesTrptrQty removeMapDesTrptrQty(MapDesTrptrQty mapDesTrptrQty) {
		getMapDesTrptrQties().remove(mapDesTrptrQty);
		mapDesTrptrQty.setMasDestination(null);

		return mapDesTrptrQty;
	}

	public MasDestinationType getMasDestinationType() {
		return this.masDestinationType;
	}

	public void setMasDestinationType(MasDestinationType masDestinationType) {
		this.masDestinationType = masDestinationType;
	}

}