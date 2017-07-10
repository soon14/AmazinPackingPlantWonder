package com.amz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.dao.AdminDao;
import com.amz.dao.BustedBagDao;
import com.amz.entity.BustedDetail;
import com.amz.entity.DiMaster;
import com.amz.entity.FlyashMaster;
import com.amz.entity.LoaderMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.PlantMaster;
import com.amz.entity.ReusabelBagsMaster;
import com.amz.entity.UserDetails;
import com.amz.entity.userRoleMaster;
import com.amz.entity.VerifiedBustedBags;

import javassist.Loader;


@Service("bustedBagsService")

public class BustedBagsService

{
	@Autowired
	BustedBagDao bustedBagDao;

	@Transactional
	public List<VerifiedBustedBags> tobeVarified()
	{
			 return bustedBagDao.tobeVerified();
	}
	/*@Transactional
	public void getBagsVarified(BustedDetail bustedDetail)
	{
		bustedBagDao.getBagsVarified(bustedDetail);
	}

	@Transactional
	public List<BustedDetail>  getsubmitActiveBags()
	{
			 return bustedBagDao.getsubmitActiveBags();
	}

*/
	
	
	@Transactional
	public void verifybags( VerifiedBustedBags verifiedbags) 
	{
		bustedBagDao.varifybags(verifiedbags);
	}

	@Transactional
	public ReusabelBagsMaster  getreusableBags(ReusabelBagsMaster reusabelBagsMaster)
	{
		return bustedBagDao. getreusableBags(reusabelBagsMaster);
	}
	
	
}
