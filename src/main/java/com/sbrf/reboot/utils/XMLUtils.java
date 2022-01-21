package com.sbrf.reboot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sbrf.reboot.dto.Request;
import com.sbrf.reboot.dto.Response;

public class XMLUtils {
    private static XmlMapper mapper = new XmlMapper();

    public static String toXML(Request request) throws JsonProcessingException {
        String xml = mapper.writeValueAsString(request);
        return  xml;
    }

    public static String toXML(Response response) throws JsonProcessingException {
        String xml = mapper.writeValueAsString(response);
        return  xml;
    }

    public static Request XMLtoRequest(String xml) throws JsonProcessingException {
        Request request = mapper.readValue(xml, Request.class);
        return request;
    }

    public static Response XMLtoResponse(String xml) throws JsonProcessingException {
        Response response = mapper.readValue(xml, Response.class);
        return response;
    }
}
