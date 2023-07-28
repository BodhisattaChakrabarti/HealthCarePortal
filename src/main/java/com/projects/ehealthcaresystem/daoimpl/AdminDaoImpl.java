package com.projects.ehealthcaresystem.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.projects.ehealthcaresystem.dao.AdminDao;
import com.projects.ehealthcaresystem.entities.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private HibernateTemplate adminHibernateTemplate;

	public HibernateTemplate getAdminHibernateTemplate() {
		return adminHibernateTemplate;
	}

	public void setAdminHibernateTemplate(HibernateTemplate adminHibernateTemplate) {
		this.adminHibernateTemplate = adminHibernateTemplate;
	}
	
	@Transactional
	@Override
	public int create(Admin admin)
	{
		Integer result=(Integer) adminHibernateTemplate.save(admin);
		return result;
	}

	@Transactional
	@Override
	public Admin findAdmin(int id) {
		Admin admin = adminHibernateTemplate.get(Admin.class, id);
		return admin;
	}

	@Override
	public Admin updateAdmin(int id, String name, int mobile) {
		Admin admin = adminHibernateTemplate.get(Admin.class, id);
		admin.setName(name);
		admin.setMobile(mobile);
		adminHibernateTemplate.update(Admin.class);
		return admin;
	}
	
}
