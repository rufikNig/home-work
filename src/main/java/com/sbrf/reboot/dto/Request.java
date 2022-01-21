package com.sbrf.reboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@NoArgsConstructor
@Getter
public class Request {
    @JsonProperty(
            value="atmNumber",
            defaultValue="Empty",
            access= JsonProperty.Access.READ_WRITE)
    public String atmNumber;

    public Request(String atmNumber) {
        this.atmNumber = atmNumber;
    }
}
