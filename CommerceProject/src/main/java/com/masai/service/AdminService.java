package com.masai.service;

import com.masai.model.Admin;
import com.masai.model.AdminDTO;
import com.masai.model.Products;

public interface AdminService {

	public Admin Register(Admin newUser);
	
	public Admin login(AdminDTO admin);
	
	public Products addProduct(Products product);
}
