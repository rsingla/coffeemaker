package io.apicode.coffee.coffeemaker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import io.apicode.coffee.coffeemaker.model.AppError;
import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class ExceptionHandlerController {
	@ExceptionHandler(EntityNotFoundException.class)
	public AppError handleException(Exception ex) {
		// handle generic exceptions
		AppError error = new AppError();
		
		
		error.setErrorId("Err-101");
		error.setErrorMessage("An error occurred: " + ex.getMessage() + " " + HttpStatus.NO_CONTENT);
		
		return error;
	}
}
