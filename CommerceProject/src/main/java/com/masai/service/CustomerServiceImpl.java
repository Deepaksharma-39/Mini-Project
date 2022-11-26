package com.masai.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.controller.UserSession;
import com.masai.customEnums.ProductType;
import com.masai.exceptions.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.model.Products;
import com.masai.repository.CustomerRepo;
import com.masai.repository.SessionRepositry;

import net.bytebuddy.utility.RandomString;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private SessionRepositry userSession;
	
	@Autowired
	private CustomerRepo custRepo;

	@Override
	public List<Products> searchProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> searchProductByCategory(ProductType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> addProductToCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer login(CustomerDTO customer) throws CustomerException {
		
		
//		Checking if email is registered or not
		Customer cust=custRepo.findByEmail(customer.getEmail());
		if(cust==null) {
			throw new CustomerException("Customer email not registered");
		}
		
//		checking is customer is already logged in
		
		Optional<UserSession> opt1=userSession.findById(cust.getCustomerId());
		if(opt1.isPresent()) {
			throw new CustomerException("Session is already active");
		}
//		validating password
		if(cust.getPassword().equals(customer.getPassword())) {
			String key= RandomString.make(6);
			
			UserSession currentSession=new UserSession(cust.getCustomerId(), key, LocalDateTime.now());
			userSession.save(currentSession);
			return cust;
		}else {
			throw new CustomerException("Enter correct password");
		}
		
	}

}
