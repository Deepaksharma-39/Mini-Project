package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {

	
}
