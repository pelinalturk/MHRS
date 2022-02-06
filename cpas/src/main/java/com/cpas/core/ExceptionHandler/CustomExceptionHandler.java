package com.cpas.core.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> customValidationErrorHandling(MethodArgumentNotValidException exception){
		ErrorResponse validationError = new ErrorResponse(false, "Doğrulama Hatası", exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(validationError, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> customValidationErrorHandling(UserNotFoundException exception){
		ErrorResponse errorResponse = new ErrorResponse(false, "Customer Not Found");
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
