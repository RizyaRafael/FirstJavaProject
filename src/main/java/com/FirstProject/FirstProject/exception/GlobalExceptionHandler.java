package com.FirstProject.FirstProject.exception;

import com.FirstProject.FirstProject.response.ErrorRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<ErrorRes> handleItemNotFound(ItemNotFoundException e) {
        ErrorRes errorRes = new ErrorRes(e.getMessage(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errorRes, HttpStatus.NOT_FOUND);

    }
}
