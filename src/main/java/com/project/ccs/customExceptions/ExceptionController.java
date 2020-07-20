package com.project.ccs.customExceptions;

import com.project.ccs.customExceptions.exceptions.IncorrectCardTypeException;
import com.project.ccs.customExceptions.exceptions.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
@RestController
public class ExceptionController extends ResponseEntityExceptionHandler {

    private static final String CONSTRAINT_VIOLATION_ERROR = "%s is violated as value %s";
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException exception) {
        return new ResponseEntity<>(exception.toString(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IncorrectCardTypeException.class)
    public ResponseEntity<Object> handleIncorrectCardTypeException(IncorrectCardTypeException exception) {
        return new ResponseEntity<>(exception.toString(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        String message = String.format(CONSTRAINT_VIOLATION_ERROR,
                exception.getBindingResult().getAllErrors().get(0).getCodes()[0],
                exception.getBindingResult().getAllErrors().get(0).getDefaultMessage());


        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}
