package com.dev.pdfgenerator.service;

import com.dev.pdfgenerator.exception.PdfGenerationException;
import com.dev.pdfgenerator.util.BasicResponse;
import com.dev.pdfgenerator.util.PdfUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.dev.pdfgenerator.util.KeyConstants.*;


@Service
public class PdfService {

    public ResponseEntity<Object> generateProtectedPdf(String password) throws PdfGenerationException {
        return ResponseEntity.ok(new BasicResponse().genericResponse(SUCCESS_CONST, PdfUtil.createPasswordProtectedPdf(password)));
    }
}
