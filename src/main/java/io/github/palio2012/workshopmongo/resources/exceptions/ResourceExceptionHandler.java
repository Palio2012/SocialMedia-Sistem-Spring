package io.github.palio2012.workshopmongo.resources.exceptions;

import io.github.palio2012.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler ({ObjectNotFoundException.class})
    public ResponseEntity <StandartError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandartError err = new StandartError(System.currentTimeMillis(), status.value(), "Not found", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
