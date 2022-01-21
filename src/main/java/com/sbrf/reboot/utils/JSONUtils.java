package com.sbrf.reboot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbrf.reboot.dto.Request;
import com.sbrf.reboot.dto.Response;

public class JSONUtils {

    private static ObjectMapper mapper = new ObjectMapper();

    public static String toJSON(Request request) throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(request);
        return  jsonString;
    }

    public static String toJSON(Response response) throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(response);
        return jsonString;
    }


    public static Request JSONtoRequest(String jsonString) throws JsonProcessingException {
    Request request = mapper.readValue(jsonString, new TypeReference<Request>() {
    });
    return request;
    }

    public static Response JSONtoResponse(String jsonString) throws JsonProcessingException {
        Response response = mapper.readValue(jsonString, new TypeReference<Response>() {
        });
        return response;
    }
}
