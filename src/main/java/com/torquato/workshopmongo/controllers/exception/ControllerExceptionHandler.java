package com.torquato.workshopmongo.controllers.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.torquato.workshopmongo.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError er = new StandardError(System.currentTimeMillis(),status.value() , "Não encontrado", e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(er);
	}

	
}
