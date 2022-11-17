package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.masai.customEnums.ProductType;

import lombok.Data;

@Entity
@Data
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Size(min = 3,max = 20)
	private String name;
	
	private ProductType type;
	
	@PositiveOrZero
	private Integer quantity;
	
	@Positive
	private Integer price;
	
	
}
