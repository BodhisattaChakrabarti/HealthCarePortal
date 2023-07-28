package com.projects.ehealthcaresystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projects.ehealthcaresystem.entities.Admin;
import com.projects.ehealthcaresystem.services.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	/* Admin Create Methods */
	
	@RequestMapping("adminRegistrationPage")
	public String showRegistrationPage()
	{
		return "adminUserReg";
	}
	
	@RequestMapping(value="registerAdmin", method=RequestMethod.POST)
	public String registerAdminUser(@ModelAttribute("admin") Admin admin, ModelMap model)
	{
		int result=adminService.save(admin);
		model.addAttribute("result", "Admin user created with Id: " + result);
		return "adminUserReg";
	}
	
	/* Admin Read Methods */
	
	@RequestMapping("adminDisplayPage")
	public String showAdminDetailsPage()
	{
		return "searchAdmin";
	}
	
	@RequestMapping(value="getAdmin", method=RequestMethod.GET)
	public String getAdmin(Integer id, ModelMap model)
	{
		Admin admin = adminService.getAdmin(id);
		model.addAttribute("admin", admin);
		return "displayAdmin"; 
	}
	
	/* Admin Update Methods */
	
	@RequestMapping("adminUpdatePage")
	public String updateAdminDetailsPage()
	{
		return "findAdmin";
	}
	
	@RequestMapping(value="updateAdmin", method=RequestMethod.GET)
	public String updateAdmin(Integer id, Integer id2, String name, int mobile, ModelMap model)
	{
		Admin admin = adminService.getAdmin(id);
		admin.setId(id2);
		admin.setName(name);
		admin.setMobile(mobile);
		Admin updatedAdmin = adminService.updateAdmin(id, name, mobile);
		model.addAttribute("updatedAdmin", updatedAdmin);
		return "displayAdmin"; 
	}
	
}
