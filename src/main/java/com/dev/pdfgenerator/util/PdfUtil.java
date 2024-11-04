package com.dev.pdfgenerator.util;

import com.dev.pdfgenerator.exception.PdfGenerationException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfUtil {

    public static String  createPasswordProtectedPdf(String password) throws PdfGenerationException {
        String fileName = "protected" + System.currentTimeMillis() + ".pdf";
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(fileName));
            writer.setEncryption(
                    password.getBytes(),
                    null,
                    PdfWriter.ALLOW_PRINTING,
                    PdfWriter.ENCRYPTION_AES_128
            );
            document.open();
            document.add(new Paragraph("This is a password-protected PDF document."));
            document.close();
            return fileName;
        } catch (Exception e) {
            throw new PdfGenerationException("Error while generating pdf");
        }
    }
}
