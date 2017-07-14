package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name = "user_details")
@NamedQuery(name = "UserDetail.findAll", query = "SELECT u FROM UserDetail u")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "added_by")
	private String addedBy;

	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "is_active")
	private String isActive;

	@Column(name = "last_updated")
	private Timestamp lastUpdated;

	@Column(name = "multi_login")
	private String multiLogin;

	private String password;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "user_fname")
	private String userFname;

	@Column(name = "user_lname")
	private String userLname;

	@Column(name = "user_mobile")
	private String userMobile;

	@Column(name = "user_type")
	private String userType;

	private String username;

	// bi-directional many-to-one association to DeliveryTimeWeightage
	@OneToMany(mappedBy = "userDetail1")
	private List<DeliveryTimeWeightage> deliveryTimeWeightages1;

	// bi-directional many-to-one association to DeliveryTimeWeightage
	@OneToMany(mappedBy = "userDetail2")
	private List<DeliveryTimeWeightage> deliveryTimeWeightages2;

	// bi-directional many-to-one association to DeliveryTimeWeightageHistory
	@OneToMany(mappedBy = "userDetail")
	private List<DeliveryTimeWeightageHistory> deliveryTimeWeightageHistories;

	// bi-directional many-to-one association to DistChnlWeightage
	@OneToMany(mappedBy = "userDetail1")
	private List<DistChnlWeightage> distChnlWeightages1;

	// bi-directional many-to-one association to DistChnlWeightage
	@OneToMany(mappedBy = "userDetail2")
	private List<DistChnlWeightage> distChnlWeightages2;

	// bi-directional many-to-one association to DistChnlWeightageHistory
	@OneToMany(mappedBy = "userDetail")
	private List<DistChnlWeightageHistory> distChnlWeightageHistories;

	// bi-directional many-to-one association to DistanceWeightage
	@OneToMany(mappedBy = "userDetail1")
	private List<DistanceWeightage> distanceWeightages1;

	// bi-directional many-to-one association to DistanceWeightage
	@OneToMany(mappedBy = "userDetail2")
	private List<DistanceWeightage> distanceWeightages2;

	// bi-directional many-to-one association to DistanceWeightageHistory
	@OneToMany(mappedBy = "userDetail")
	private List<DistanceWeightageHistory> distanceWeightageHistories;

	// bi-directional many-to-one association to FleetTypeWeightage
	@OneToMany(mappedBy = "userDetail1")
	private List<FleetTypeWeightage> fleetTypeWeightages1;

	// bi-directional many-to-one association to FleetTypeWeightage
	@OneToMany(mappedBy = "userDetail2")
	private List<FleetTypeWeightage> fleetTypeWeightages2;

	// bi-directional many-to-one association to FleetTypeWeightageHistory
	@OneToMany(mappedBy = "userDetail")
	private List<FleetTypeWeightageHistory> fleetTypeWeightageHistories;

	// bi-directional many-to-one association to PriorityUpdation
	@OneToMany(mappedBy = "userDetail1")
	private List<PriorityUpdation> priorityUpdations1;

	// bi-directional many-to-one association to PriorityUpdation
	@OneToMany(mappedBy = "userDetail2")
	private List<PriorityUpdation> priorityUpdations2;

	// bi-directional many-to-one association to PriorityUpdationHistory
	@OneToMany(mappedBy = "userDetail")
	private List<PriorityUpdationHistory> priorityUpdationHistories;

	// bi-directional many-to-one association to ShippingConditionWeightage
	@OneToMany(mappedBy = "userDetail1")
	private List<ShippingConditionWeightage> shippingConditionWeightages1;

	// bi-directional many-to-one association to ShippingConditionWeightage
	@OneToMany(mappedBy = "userDetail2")
	private List<ShippingConditionWeightage> shippingConditionWeightages2;

	// bi-directional many-to-one association to
	// ShippingConditionWeightageHistory
	@OneToMany(mappedBy = "userDetail")
	private List<ShippingConditionWeightageHistory> shippingConditionWeightageHistories;

	// bi-directional many-to-one association to UserroleMaster
	@ManyToOne
	@JoinColumn(name = "userrole_master_id")
	private UserroleMaster userroleMaster;

	// bi-directional many-to-one association to UserLoginDetail
	@OneToMany(mappedBy = "userDetail")
	private List<UserLoginDetail> userLoginDetails;

	// bi-directional many-to-one association to UserfunctionMaster
	// @OneToMany(mappedBy="userDetail")
	// private List<UserfunctionMaster> userfunctionMasters;

	public UserDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddedBy() {
		return this.addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getMultiLogin() {
		return this.multiLogin;
	}

	public void setMultiLogin(String multiLogin) {
		this.multiLogin = multiLogin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUserFname() {
		return this.userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return this.userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<DeliveryTimeWeightage> getDeliveryTimeWeightages1() {
		return this.deliveryTimeWeightages1;
	}

	public void setDeliveryTimeWeightages1(List<DeliveryTimeWeightage> deliveryTimeWeightages1) {
		this.deliveryTimeWeightages1 = deliveryTimeWeightages1;
	}

	public DeliveryTimeWeightage addDeliveryTimeWeightages1(DeliveryTimeWeightage deliveryTimeWeightages1) {
		getDeliveryTimeWeightages1().add(deliveryTimeWeightages1);
		deliveryTimeWeightages1.setUserDetail1(this);

		return deliveryTimeWeightages1;
	}

	public DeliveryTimeWeightage removeDeliveryTimeWeightages1(DeliveryTimeWeightage deliveryTimeWeightages1) {
		getDeliveryTimeWeightages1().remove(deliveryTimeWeightages1);
		deliveryTimeWeightages1.setUserDetail1(null);

		return deliveryTimeWeightages1;
	}

	public List<DeliveryTimeWeightage> getDeliveryTimeWeightages2() {
		return this.deliveryTimeWeightages2;
	}

	public void setDeliveryTimeWeightages2(List<DeliveryTimeWeightage> deliveryTimeWeightages2) {
		this.deliveryTimeWeightages2 = deliveryTimeWeightages2;
	}

	public DeliveryTimeWeightage addDeliveryTimeWeightages2(DeliveryTimeWeightage deliveryTimeWeightages2) {
		getDeliveryTimeWeightages2().add(deliveryTimeWeightages2);
		deliveryTimeWeightages2.setUserDetail2(this);

		return deliveryTimeWeightages2;
	}

	public DeliveryTimeWeightage removeDeliveryTimeWeightages2(DeliveryTimeWeightage deliveryTimeWeightages2) {
		getDeliveryTimeWeightages2().remove(deliveryTimeWeightages2);
		deliveryTimeWeightages2.setUserDetail2(null);

		return deliveryTimeWeightages2;
	}

	public List<DeliveryTimeWeightageHistory> getDeliveryTimeWeightageHistories() {
		return this.deliveryTimeWeightageHistories;
	}

	public void setDeliveryTimeWeightageHistories(List<DeliveryTimeWeightageHistory> deliveryTimeWeightageHistories) {
		this.deliveryTimeWeightageHistories = deliveryTimeWeightageHistories;
	}

	public DeliveryTimeWeightageHistory addDeliveryTimeWeightageHistory(
			DeliveryTimeWeightageHistory deliveryTimeWeightageHistory) {
		getDeliveryTimeWeightageHistories().add(deliveryTimeWeightageHistory);
		deliveryTimeWeightageHistory.setUserDetail(this);

		return deliveryTimeWeightageHistory;
	}

	public DeliveryTimeWeightageHistory removeDeliveryTimeWeightageHistory(
			DeliveryTimeWeightageHistory deliveryTimeWeightageHistory) {
		getDeliveryTimeWeightageHistories().remove(deliveryTimeWeightageHistory);
		deliveryTimeWeightageHistory.setUserDetail(null);

		return deliveryTimeWeightageHistory;
	}

	public List<DistChnlWeightage> getDistChnlWeightages1() {
		return this.distChnlWeightages1;
	}

	public void setDistChnlWeightages1(List<DistChnlWeightage> distChnlWeightages1) {
		this.distChnlWeightages1 = distChnlWeightages1;
	}

	public DistChnlWeightage addDistChnlWeightages1(DistChnlWeightage distChnlWeightages1) {
		getDistChnlWeightages1().add(distChnlWeightages1);
		distChnlWeightages1.setUserDetail1(this);

		return distChnlWeightages1;
	}

	public DistChnlWeightage removeDistChnlWeightages1(DistChnlWeightage distChnlWeightages1) {
		getDistChnlWeightages1().remove(distChnlWeightages1);
		distChnlWeightages1.setUserDetail1(null);

		return distChnlWeightages1;
	}

	public List<DistChnlWeightage> getDistChnlWeightages2() {
		return this.distChnlWeightages2;
	}

	public void setDistChnlWeightages2(List<DistChnlWeightage> distChnlWeightages2) {
		this.distChnlWeightages2 = distChnlWeightages2;
	}

	public DistChnlWeightage addDistChnlWeightages2(DistChnlWeightage distChnlWeightages2) {
		getDistChnlWeightages2().add(distChnlWeightages2);
		distChnlWeightages2.setUserDetail2(this);

		return distChnlWeightages2;
	}

	public DistChnlWeightage removeDistChnlWeightages2(DistChnlWeightage distChnlWeightages2) {
		getDistChnlWeightages2().remove(distChnlWeightages2);
		distChnlWeightages2.setUserDetail2(null);

		return distChnlWeightages2;
	}

	public List<DistChnlWeightageHistory> getDistChnlWeightageHistories() {
		return this.distChnlWeightageHistories;
	}

	public void setDistChnlWeightageHistories(List<DistChnlWeightageHistory> distChnlWeightageHistories) {
		this.distChnlWeightageHistories = distChnlWeightageHistories;
	}

	public DistChnlWeightageHistory addDistChnlWeightageHistory(DistChnlWeightageHistory distChnlWeightageHistory) {
		getDistChnlWeightageHistories().add(distChnlWeightageHistory);
		distChnlWeightageHistory.setUserDetail(this);

		return distChnlWeightageHistory;
	}

	public DistChnlWeightageHistory removeDistChnlWeightageHistory(DistChnlWeightageHistory distChnlWeightageHistory) {
		getDistChnlWeightageHistories().remove(distChnlWeightageHistory);
		distChnlWeightageHistory.setUserDetail(null);

		return distChnlWeightageHistory;
	}

	public List<DistanceWeightage> getDistanceWeightages1() {
		return this.distanceWeightages1;
	}

	public void setDistanceWeightages1(List<DistanceWeightage> distanceWeightages1) {
		this.distanceWeightages1 = distanceWeightages1;
	}

	public DistanceWeightage addDistanceWeightages1(DistanceWeightage distanceWeightages1) {
		getDistanceWeightages1().add(distanceWeightages1);
		distanceWeightages1.setUserDetail1(this);

		return distanceWeightages1;
	}

	public DistanceWeightage removeDistanceWeightages1(DistanceWeightage distanceWeightages1) {
		getDistanceWeightages1().remove(distanceWeightages1);
		distanceWeightages1.setUserDetail1(null);

		return distanceWeightages1;
	}

	public List<DistanceWeightage> getDistanceWeightages2() {
		return this.distanceWeightages2;
	}

	public void setDistanceWeightages2(List<DistanceWeightage> distanceWeightages2) {
		this.distanceWeightages2 = distanceWeightages2;
	}

	public DistanceWeightage addDistanceWeightages2(DistanceWeightage distanceWeightages2) {
		getDistanceWeightages2().add(distanceWeightages2);
		distanceWeightages2.setUserDetail2(this);

		return distanceWeightages2;
	}

	public DistanceWeightage removeDistanceWeightages2(DistanceWeightage distanceWeightages2) {
		getDistanceWeightages2().remove(distanceWeightages2);
		distanceWeightages2.setUserDetail2(null);

		return distanceWeightages2;
	}

	public List<DistanceWeightageHistory> getDistanceWeightageHistories() {
		return this.distanceWeightageHistories;
	}

	public void setDistanceWeightageHistories(List<DistanceWeightageHistory> distanceWeightageHistories) {
		this.distanceWeightageHistories = distanceWeightageHistories;
	}

	public DistanceWeightageHistory addDistanceWeightageHistory(DistanceWeightageHistory distanceWeightageHistory) {
		getDistanceWeightageHistories().add(distanceWeightageHistory);
		distanceWeightageHistory.setUserDetail(this);

		return distanceWeightageHistory;
	}

	public DistanceWeightageHistory removeDistanceWeightageHistory(DistanceWeightageHistory distanceWeightageHistory) {
		getDistanceWeightageHistories().remove(distanceWeightageHistory);
		distanceWeightageHistory.setUserDetail(null);

		return distanceWeightageHistory;
	}

	public List<FleetTypeWeightage> getFleetTypeWeightages1() {
		return this.fleetTypeWeightages1;
	}

	public void setFleetTypeWeightages1(List<FleetTypeWeightage> fleetTypeWeightages1) {
		this.fleetTypeWeightages1 = fleetTypeWeightages1;
	}

	public FleetTypeWeightage addFleetTypeWeightages1(FleetTypeWeightage fleetTypeWeightages1) {
		getFleetTypeWeightages1().add(fleetTypeWeightages1);
		fleetTypeWeightages1.setUserDetail1(this);

		return fleetTypeWeightages1;
	}

	public FleetTypeWeightage removeFleetTypeWeightages1(FleetTypeWeightage fleetTypeWeightages1) {
		getFleetTypeWeightages1().remove(fleetTypeWeightages1);
		fleetTypeWeightages1.setUserDetail1(null);

		return fleetTypeWeightages1;
	}

	public List<FleetTypeWeightage> getFleetTypeWeightages2() {
		return this.fleetTypeWeightages2;
	}

	public void setFleetTypeWeightages2(List<FleetTypeWeightage> fleetTypeWeightages2) {
		this.fleetTypeWeightages2 = fleetTypeWeightages2;
	}

	public FleetTypeWeightage addFleetTypeWeightages2(FleetTypeWeightage fleetTypeWeightages2) {
		getFleetTypeWeightages2().add(fleetTypeWeightages2);
		fleetTypeWeightages2.setUserDetail2(this);

		return fleetTypeWeightages2;
	}

	public FleetTypeWeightage removeFleetTypeWeightages2(FleetTypeWeightage fleetTypeWeightages2) {
		getFleetTypeWeightages2().remove(fleetTypeWeightages2);
		fleetTypeWeightages2.setUserDetail2(null);

		return fleetTypeWeightages2;
	}

	public List<FleetTypeWeightageHistory> getFleetTypeWeightageHistories() {
		return this.fleetTypeWeightageHistories;
	}

	public void setFleetTypeWeightageHistories(List<FleetTypeWeightageHistory> fleetTypeWeightageHistories) {
		this.fleetTypeWeightageHistories = fleetTypeWeightageHistories;
	}

	public FleetTypeWeightageHistory addFleetTypeWeightageHistory(FleetTypeWeightageHistory fleetTypeWeightageHistory) {
		getFleetTypeWeightageHistories().add(fleetTypeWeightageHistory);
		fleetTypeWeightageHistory.setUserDetail(this);

		return fleetTypeWeightageHistory;
	}

	public FleetTypeWeightageHistory removeFleetTypeWeightageHistory(
			FleetTypeWeightageHistory fleetTypeWeightageHistory) {
		getFleetTypeWeightageHistories().remove(fleetTypeWeightageHistory);
		fleetTypeWeightageHistory.setUserDetail(null);

		return fleetTypeWeightageHistory;
	}

	public List<PriorityUpdation> getPriorityUpdations1() {
		return this.priorityUpdations1;
	}

	public void setPriorityUpdations1(List<PriorityUpdation> priorityUpdations1) {
		this.priorityUpdations1 = priorityUpdations1;
	}

	public PriorityUpdation addPriorityUpdations1(PriorityUpdation priorityUpdations1) {
		getPriorityUpdations1().add(priorityUpdations1);
		priorityUpdations1.setUserDetail1(this);

		return priorityUpdations1;
	}

	public PriorityUpdation removePriorityUpdations1(PriorityUpdation priorityUpdations1) {
		getPriorityUpdations1().remove(priorityUpdations1);
		priorityUpdations1.setUserDetail1(null);

		return priorityUpdations1;
	}

	public List<PriorityUpdation> getPriorityUpdations2() {
		return this.priorityUpdations2;
	}

	public void setPriorityUpdations2(List<PriorityUpdation> priorityUpdations2) {
		this.priorityUpdations2 = priorityUpdations2;
	}

	public PriorityUpdation addPriorityUpdations2(PriorityUpdation priorityUpdations2) {
		getPriorityUpdations2().add(priorityUpdations2);
		priorityUpdations2.setUserDetail2(this);

		return priorityUpdations2;
	}

	public PriorityUpdation removePriorityUpdations2(PriorityUpdation priorityUpdations2) {
		getPriorityUpdations2().remove(priorityUpdations2);
		priorityUpdations2.setUserDetail2(null);

		return priorityUpdations2;
	}

	public List<PriorityUpdationHistory> getPriorityUpdationHistories() {
		return this.priorityUpdationHistories;
	}

	public void setPriorityUpdationHistories(List<PriorityUpdationHistory> priorityUpdationHistories) {
		this.priorityUpdationHistories = priorityUpdationHistories;
	}

	public PriorityUpdationHistory addPriorityUpdationHistory(PriorityUpdationHistory priorityUpdationHistory) {
		getPriorityUpdationHistories().add(priorityUpdationHistory);
		priorityUpdationHistory.setUserDetail(this);

		return priorityUpdationHistory;
	}

	public PriorityUpdationHistory removePriorityUpdationHistory(PriorityUpdationHistory priorityUpdationHistory) {
		getPriorityUpdationHistories().remove(priorityUpdationHistory);
		priorityUpdationHistory.setUserDetail(null);

		return priorityUpdationHistory;
	}

	public List<ShippingConditionWeightage> getShippingConditionWeightages1() {
		return this.shippingConditionWeightages1;
	}

	public void setShippingConditionWeightages1(List<ShippingConditionWeightage> shippingConditionWeightages1) {
		this.shippingConditionWeightages1 = shippingConditionWeightages1;
	}

	public ShippingConditionWeightage addShippingConditionWeightages1(
			ShippingConditionWeightage shippingConditionWeightages1) {
		getShippingConditionWeightages1().add(shippingConditionWeightages1);
		shippingConditionWeightages1.setUserDetail1(this);

		return shippingConditionWeightages1;
	}

	public ShippingConditionWeightage removeShippingConditionWeightages1(
			ShippingConditionWeightage shippingConditionWeightages1) {
		getShippingConditionWeightages1().remove(shippingConditionWeightages1);
		shippingConditionWeightages1.setUserDetail1(null);

		return shippingConditionWeightages1;
	}

	public List<ShippingConditionWeightage> getShippingConditionWeightages2() {
		return this.shippingConditionWeightages2;
	}

	public void setShippingConditionWeightages2(List<ShippingConditionWeightage> shippingConditionWeightages2) {
		this.shippingConditionWeightages2 = shippingConditionWeightages2;
	}

	public ShippingConditionWeightage addShippingConditionWeightages2(
			ShippingConditionWeightage shippingConditionWeightages2) {
		getShippingConditionWeightages2().add(shippingConditionWeightages2);
		shippingConditionWeightages2.setUserDetail2(this);

		return shippingConditionWeightages2;
	}

	public ShippingConditionWeightage removeShippingConditionWeightages2(
			ShippingConditionWeightage shippingConditionWeightages2) {
		getShippingConditionWeightages2().remove(shippingConditionWeightages2);
		shippingConditionWeightages2.setUserDetail2(null);

		return shippingConditionWeightages2;
	}

	public List<ShippingConditionWeightageHistory> getShippingConditionWeightageHistories() {
		return this.shippingConditionWeightageHistories;
	}

	public void setShippingConditionWeightageHistories(
			List<ShippingConditionWeightageHistory> shippingConditionWeightageHistories) {
		this.shippingConditionWeightageHistories = shippingConditionWeightageHistories;
	}

	public ShippingConditionWeightageHistory addShippingConditionWeightageHistory(
			ShippingConditionWeightageHistory shippingConditionWeightageHistory) {
		getShippingConditionWeightageHistories().add(shippingConditionWeightageHistory);
		shippingConditionWeightageHistory.setUserDetail(this);

		return shippingConditionWeightageHistory;
	}

	public ShippingConditionWeightageHistory removeShippingConditionWeightageHistory(
			ShippingConditionWeightageHistory shippingConditionWeightageHistory) {
		getShippingConditionWeightageHistories().remove(shippingConditionWeightageHistory);
		shippingConditionWeightageHistory.setUserDetail(null);

		return shippingConditionWeightageHistory;
	}

	public UserroleMaster getUserroleMaster() {
		return this.userroleMaster;
	}

	public void setUserroleMaster(UserroleMaster userroleMaster) {
		this.userroleMaster = userroleMaster;
	}

	public List<UserLoginDetail> getUserLoginDetails() {
		return this.userLoginDetails;
	}

	public void setUserLoginDetails(List<UserLoginDetail> userLoginDetails) {
		this.userLoginDetails = userLoginDetails;
	}

	public UserLoginDetail addUserLoginDetail(UserLoginDetail userLoginDetail) {
		getUserLoginDetails().add(userLoginDetail);
		userLoginDetail.setUserDetail(this);

		return userLoginDetail;
	}

	public UserLoginDetail removeUserLoginDetail(UserLoginDetail userLoginDetail) {
		getUserLoginDetails().remove(userLoginDetail);
		userLoginDetail.setUserDetail(null);

		return userLoginDetail;
	}

	// public List<UserfunctionMaster> getUserfunctionMasters() {
	// return this.userfunctionMasters;
	// }
	//
	// public void setUserfunctionMasters(List<UserfunctionMaster>
	// userfunctionMasters) {
	// this.userfunctionMasters = userfunctionMasters;
	// }
	//
	// public UserfunctionMaster addUserfunctionMaster(UserfunctionMaster
	// userfunctionMaster) {
	// getUserfunctionMasters().add(userfunctionMaster);
	// userfunctionMaster.setUserDetail(this);
	//
	// return userfunctionMaster;
	// }
	//
	// public UserfunctionMaster removeUserfunctionMaster(UserfunctionMaster
	// userfunctionMaster) {
	// getUserfunctionMasters().remove(userfunctionMaster);
	// userfunctionMaster.setUserDetail(null);
	//
	// return userfunctionMaster;
	// }

}