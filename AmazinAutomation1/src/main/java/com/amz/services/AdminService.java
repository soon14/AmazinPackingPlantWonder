package com.amz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.dao.AdminDao;
import com.amz.entity.BustedDetail;
import com.amz.entity.FlyashMaster;
import com.amz.entity.PackerMaster;
import com.amz.entity.VerifiedBustedBags;
import com.amz.entity.userRoleMaster;
import com.amz.factory.entity.UserDetail;


@Service("adminService")

public class AdminService

{
	@Autowired
	AdminDao adminDao;
	@Transactional
	public List<UserDetail>login (UserDetail userdetails) 
	{
		return adminDao.login(userdetails);
	}
	

	@Transactional
	public void logout(UserDetail userdetails) 
	{
		adminDao.logout(userdetails);
	}
	@Transactional
	public void changePassword(UserDetail userdetails) 
	{
		adminDao.changePassword(userdetails);
	}
	@Transactional
	public String  createUser(UserDetail userdetails) 
	{
		return adminDao.createUser(userdetails);
	}

	@Transactional
	public List<PackerMaster> createPacker(PackerMaster packerMaster) 
	{
		return adminDao.createPacker(packerMaster);
	}
	@Transactional
	public List<PackerMaster> getPacker() 
	{
		return adminDao.getPacker();
	}

	@Transactional
	public void updatePacker(PackerMaster packerMaster) 
	{
			adminDao.updatePacker(packerMaster);
	}

	
	

	@Transactional
	public List<userRoleMaster> getUserRoles() 
	{
			return adminDao.getUserRoles();
	}
	
	

	@Transactional
	public void submitBags(BustedDetail bustedDetail)
	{
			 adminDao.submitBags(bustedDetail);
	}
	@Transactional
	public void getBagsVarified(BustedDetail bustedDetail)
	{
			 adminDao.getBagsVarified(bustedDetail);
	}

	@Transactional
	public List<BustedDetail>  getsubmitActiveBags()
	{
			 return adminDao.getsubmitActiveBags();
	}


	@Transactional
	public List<FlyashMaster>  submitFlyash(FlyashMaster flyashMaster)
	{
			 return adminDao.submitFlyash(flyashMaster);
	}
	
	
	
	@Transactional
	public List<FlyashMaster>  getFlyash()
	{
			 return adminDao.getFlyash();
	}
	
	
	
	@Transactional
	public void varifybags( VerifiedBustedBags verifiedbags) 
	{
			adminDao.varifybags(verifiedbags);
	}
	
	
	
}
