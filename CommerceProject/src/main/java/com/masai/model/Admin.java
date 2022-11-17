package com.masai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	
	@Size(min = 3,max = 15)
	private String name;
	
	@Email
	private String email;
	
	@Size(min = 10,max = 10)
	@Pattern(regexp = "[6-9]{1}[0-9]{9}")
	private String phone;
	
	@Size(min = 8,max = 20)
	private String password;
	
	@JsonIgnore
	private List<Products> products;
	
	
	
}
