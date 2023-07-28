package com.projects.ehealthcaresystem.services;

import com.projects.ehealthcaresystem.entities.Admin;

public interface AdminService {

	public int save(Admin admin);
	
	Admin getAdmin(int id);
	
	Admin updateAdmin(int id, String name, int mobile);
	
}
