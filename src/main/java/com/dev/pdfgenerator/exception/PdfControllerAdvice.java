package com.dev.pdfgenerator.exception;

import com.dev.pdfgenerator.util.BasicResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.dev.pdfgenerator.util.KeyConstants.FAILED_CONST;

@ControllerAdvice
public class PdfControllerAdvice {

    @ExceptionHandler(PdfGenerationException.class)
    public ResponseEntity<Object> errorResponse(PdfGenerationException exception) {
        return ResponseEntity.ok(new BasicResponse().genericResponse(FAILED_CONST, exception.getMessage()));
    }
}
