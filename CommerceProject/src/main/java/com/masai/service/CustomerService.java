package com.masai.service;

import java.util.List;

import com.masai.customEnums.ProductType;
import com.masai.exceptions.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.model.Products;

public interface CustomerService {
	
	public Customer login(CustomerDTO customer) throws CustomerException;

	public List<Products> searchProductByName(String name);
	
	public List<Products> searchProductByCategory(ProductType type);
	
	public List<Products> addProductToCart();
	
}
