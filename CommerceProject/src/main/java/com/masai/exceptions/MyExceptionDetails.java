package com.masai.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyExceptionDetails {

	private LocalDateTime timestamp;
	private String message;
	private String description;
	public MyExceptionDetails(LocalDateTime timestamp, String message, String description) {
		
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	
	
}
