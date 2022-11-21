package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.controller.UserSession;



@Repository
public interface SessionRepositry extends JpaRepository<UserSession, Integer> {

	public UserSession findByUuid(String uuid);
}
