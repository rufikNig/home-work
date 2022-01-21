package com.sbrf.reboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Getter
public class Response implements Serializable {

    @JsonProperty(
            value="statusCode",
            defaultValue="Empty",
            access= JsonProperty.Access.READ_WRITE)
    public String statusCode;


    public Response(String statusCode) {
        this.statusCode = statusCode;
    }
}
