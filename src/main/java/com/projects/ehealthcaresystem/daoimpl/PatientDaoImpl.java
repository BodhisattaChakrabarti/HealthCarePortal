package com.projects.ehealthcaresystem.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.projects.ehealthcaresystem.dao.PatientDao;

@Repository
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private HibernateTemplate patientHibernateTemplate;

	public HibernateTemplate getPatientHibernateTemplate() {
		return patientHibernateTemplate;
	}

	public void setPatientHibernateTemplate(HibernateTemplate patientHibernateTemplate) {
		this.patientHibernateTemplate = patientHibernateTemplate;
	}
	
}
