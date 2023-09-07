package com.example.springrestdemo1.exceptions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> myHandler(EmployeeNotFoundException te)
	{
		ResponseEntity<String> re=new ResponseEntity<String>(te.getMessage(), HttpStatus.NOT_FOUND);
		return re;
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> myHandler(MethodArgumentNotValidException me)
	{
		List<FieldError> fe= me.getFieldErrors();
		Map<String,String> errorMsgs=new LinkedHashMap<>();
		for(FieldError temp:fe)
		{
			errorMsgs.put(temp.getField(),temp.getDefaultMessage());
		}
		ResponseEntity<Map<String,String>> re=new ResponseEntity<Map<String,String>>(errorMsgs, HttpStatus.BAD_REQUEST);
		return re;
	}
}