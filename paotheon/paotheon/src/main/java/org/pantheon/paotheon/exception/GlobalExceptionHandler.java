package org.pantheon.paotheon.exception;

import java.time.Instant;

import org.apache.coyote.Response;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
    private static final Logger log=LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<Map<String,Object>> handleBadCredentials(BadCredentialsException ex){
        log.warn("BadCredentialsException: {}", ex.getMessage(), ex);
        return buildResponse(HttpStatus.UNAUTHORIZED,ex.getMessage());
    }
    
    @ExceptionHandler(AccountDeactivatedException.class)
    public ResponseEntity<Map<String,Object>> handleAccountDeactivated(AccountDeactivatedException ex){
        log.warn("AccountDeactivatedException: {}", ex.getMessage(), ex);
        return buildResponse(HttpStatus.FORBIDDEN,ex.getMessage());
    }
    
    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<Map<String,Object>> handleEmailAlreadyExist(EmailAlreadyExistsException ex){
        log.warn("EmailAlreadyExistsException: {}", ex.getMessage(), ex);
        return buildResponse(HttpStatus.FORBIDDEN,ex.getMessage());
    }

    @ExceptionHandler(EmailNotVerifiedException.class)
    public ResponseEntity<Map<String,Object>> handleEmailNotVerified(EmailNotVerifiedException ex){
        log.warn("EmailNotVerifiedException: {}", ex.getMessage(), ex);
        return buildResponse(HttpStatus.FORBIDDEN,ex.getMessage());
    }

    private ResponseEntity<Map<String,Object>> buildResponse(HttpStatus status, String message){
        Map<String,Object> body = Map.of("timestamp", Instant.now());
        return ResponseEntity.status(status).body(body);
    }
}
