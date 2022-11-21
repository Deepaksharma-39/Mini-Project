package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Admin;
import com.masai.model.AdminDTO;
import com.masai.model.Products;
import com.masai.repository.ProductRepo;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private ProductRepo productRepo; 
	
	
	@Override
	public Products addProduct(Products product) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Admin login(AdminDTO admin) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Admin Register(Admin newUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
