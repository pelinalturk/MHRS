package com.cpas.core.ExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
	
	private boolean success;
	private String message;
	private String details;
	
	public ErrorResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
}
