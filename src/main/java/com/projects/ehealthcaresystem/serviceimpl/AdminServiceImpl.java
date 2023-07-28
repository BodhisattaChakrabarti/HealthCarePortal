package com.projects.ehealthcaresystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projects.ehealthcaresystem.dao.AdminDao;
import com.projects.ehealthcaresystem.entities.Admin;
import com.projects.ehealthcaresystem.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	@Transactional
	public int save(Admin admin) {
		int result=adminDao.create(admin);
		return result;
	}

	@Override
	@Transactional
	public Admin getAdmin(int id) {
		Admin admin = adminDao.findAdmin(id);
		return admin;
	}

	@Override
	public Admin updateAdmin(int id, String name, int mobile) {
		Admin admin = adminDao.updateAdmin(id, name, mobile);
		return admin;
	}
	
}
