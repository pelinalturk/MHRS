package com.cpas.core.ExceptionHandler;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(String message){
        super(message);
    }
}
