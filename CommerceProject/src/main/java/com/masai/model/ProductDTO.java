package com.masai.model;



import com.masai.customEnums.ProductType;

import lombok.Data;

@Data
public class ProductDTO {

	private String name;
	
	private ProductType type;
	
	
	private Integer quantity;
	
	
	private Integer price;
}
