package com.masai.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Address {

	@Size(min = 5,max = 25)
	private String street;
	
	@Size(min = 5,max = 25)
	private String city;
	
	@Size(min = 5,max = 25)
	private String state;
	
	@Size(min = 5,max = 25)
	private String country;
	
	@Size(min = 6,max = 6)
	@Pattern(regexp = "[1-9]{1}[0-9] {5}")
	private String pinCode;
	
}
