package com.hexaware.automobileInsurance.config;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hexaware.automobileInsurance.exception.InvalidUserNameException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(InvalidUserNameException.class)
	public ErrorResponse InvalidUserNameExceptionHandler(InvalidUserNameException e)
	{
		return ErrorResponse.create(e, HttpStatusCode.valueOf(400), e.getMessage());
	}
}
