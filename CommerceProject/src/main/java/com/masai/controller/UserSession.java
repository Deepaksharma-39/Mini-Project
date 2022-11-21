package com.masai.controller;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSession {

	@Id
	@Column(unique = true)
	private Integer userId;
	private String uuid;
	private LocalDateTime localDateTime;

}
