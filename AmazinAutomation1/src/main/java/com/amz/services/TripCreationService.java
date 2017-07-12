package com.amz.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.dao.TripCreationDao;
import com.amz.entity.TripCreation;
import com.amz.entity.TripMaster;


@Service("tripCreationService")

public class TripCreationService

{
	@Autowired
	TripCreationDao  tripDao;
	@Transactional
	public  TripCreation tripCreation (TripCreation tripdetial) 
	{
		return tripDao.tripCreation(tripdetial);
	}
	

	@Transactional
	public TripCreation tripReCreations (TripCreation tripdetial) 
	{
		return tripDao.tripReCreations(tripdetial);
	}
	@Transactional
	public ArrayList<TripMaster> getAllTripInformation () 
	{
		return tripDao.getAllTripInformation();
	}
	

}
