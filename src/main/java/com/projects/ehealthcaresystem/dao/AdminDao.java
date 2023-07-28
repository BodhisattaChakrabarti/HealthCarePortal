package com.projects.ehealthcaresystem.dao;

import com.projects.ehealthcaresystem.entities.Admin;

public interface AdminDao {

	int create(Admin admin);
	
	Admin findAdmin(int id);

	Admin updateAdmin(int id, String name, int mobile);

}
