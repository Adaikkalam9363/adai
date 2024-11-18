package com.student.exceptionhandling;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.evenexception.EvenException;
import com.student.exception.NameException;
@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity <Object> noName(NameNotFoundException e) {
		return new ResponseEntity<>("No values found"+e,HttpStatus.NOT_FOUND);
	}
	
                           //	task1
	@ExceptionHandler(EvenException.class)
	public ResponseEntity <Object> noName(EvenException e) {
		return new ResponseEntity<>("No values found"+e,HttpStatus.NOT_FOUND);

}
}
