package com.masai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Size(min = 3, max = 20)
	private String name;
	
	@Email
	@Column(unique = true)
	private String email;
	
	@Size(min = 10, max = 10)
	@Pattern(regexp = "[6-9]{1}[0-9]{9}")
	@Column(unique = true)
	private String phone;
	
	@Embedded
	@Valid
	private Address address;
	
	@OneToMany
	@JsonIgnore
	private List<ProductDTO> products;
}
