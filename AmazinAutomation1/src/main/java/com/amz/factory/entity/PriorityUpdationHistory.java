package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the priority_updation_history database table.
 * 
 */
@Entity
@Table(name="priority_updation_history")
@NamedQuery(name="PriorityUpdationHistory.findAll", query="SELECT p FROM PriorityUpdationHistory p")
public class PriorityUpdationHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="puh_id")
	private int puhId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_added_on")
	private Date lastAddedOn;

	@Column(name="puh_percentage")
	private String puhPercentage;

	@Column(name="puh_pu_id")
	private int puhPuId;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="last_update_by")
	private UserDetail userDetail;

	public PriorityUpdationHistory() {
	}

	public int getPuhId() {
		return this.puhId;
	}

	public void setPuhId(int puhId) {
		this.puhId = puhId;
	}

	public Date getLastAddedOn() {
		return this.lastAddedOn;
	}

	public void setLastAddedOn(Date lastAddedOn) {
		this.lastAddedOn = lastAddedOn;
	}

	public String getPuhPercentage() {
		return this.puhPercentage;
	}

	public void setPuhPercentage(String puhPercentage) {
		this.puhPercentage = puhPercentage;
	}

	public int getPuhPuId() {
		return this.puhPuId;
	}

	public void setPuhPuId(int puhPuId) {
		this.puhPuId = puhPuId;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}