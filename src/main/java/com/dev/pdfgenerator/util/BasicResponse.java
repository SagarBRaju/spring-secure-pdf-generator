package com.dev.pdfgenerator.util;

import java.util.HashMap;
import java.util.Map;

public class BasicResponse {

    public Map<String, Object> genericResponse(String message,Object data){
        Map<String,Object> response = new HashMap<>();
        response.put("status",message);
        response.put("data",data);
        return response;
    }
}
