package com.dev.pdfgenerator.controller;

import com.dev.pdfgenerator.exception.PdfGenerationException;
import com.dev.pdfgenerator.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.dev.pdfgenerator.util.KeyConstants.*;

@RestController
@RequestMapping(URI_MAIN)
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @GetMapping(GENERATE_SECURE_PDF)
    public ResponseEntity<Object> generatePdf(@RequestParam String password) throws PdfGenerationException {
        return pdfService.generateProtectedPdf(password);
    }
}
