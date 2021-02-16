package com.weisser.sarah.wineapp.util;

import com.weisser.sarah.wineapp.util.customException.DuplicateEmailException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class ControllerConfiguration extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid data")
    public void notValid() {
        //
    }

    private String INCORRECT_REQUEST = "INCORRECT_REQUEST";
    private String BAD_REQUEST = "BAD_REQUEST";
    private String DUPLICATE_REQUEST = "DUPLICATE_REQUEST";

    @ExceptionHandler(DuplicateEmailException.class)
    public final ResponseEntity<ErrorMessage> duplicateEmail
            (DuplicateEmailException ex)
    {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorMessage error = new ErrorMessage(DUPLICATE_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
    }
}
