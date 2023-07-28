package com.projects.ehealthcaresystem.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.projects.ehealthcaresystem.dao.DoctorDao;

@Repository
public class DoctorDaoImpl implements DoctorDao {

	@Autowired
	private HibernateTemplate doctorHibernateTemplate;

	public HibernateTemplate getDoctorHibernateTemplate() {
		return doctorHibernateTemplate;
	}

	public void setDoctorHibernateTemplate(HibernateTemplate doctorHibernateTemplate) {
		this.doctorHibernateTemplate = doctorHibernateTemplate;
	}
	
}
