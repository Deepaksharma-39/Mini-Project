package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyExceptionDetails> customerExceptionHandler(CustomerException ce, WebRequest req){
		MyExceptionDetails details= new MyExceptionDetails(LocalDateTime.now(), ce.getLocalizedMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyExceptionDetails> adminExceptionHandler(AdminException ce, WebRequest req){
		MyExceptionDetails details= new MyExceptionDetails(LocalDateTime.now(), ce.getLocalizedMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyExceptionDetails> productExceptionHandler(ProductException ce, WebRequest req){
		MyExceptionDetails details= new MyExceptionDetails(LocalDateTime.now(), ce.getLocalizedMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyExceptionDetails> invalidArgumentExceptionHandler(MethodArgumentNotValidException ce){
		MyExceptionDetails details= new MyExceptionDetails(LocalDateTime.now(), ce.getLocalizedMessage(), ce.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyExceptionDetails> ExceptionHandler(Exception ce,WebRequest req){
		MyExceptionDetails details= new MyExceptionDetails(LocalDateTime.now(), ce.getLocalizedMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
	}
}
