package com.sbrf.reboot;

import lombok.Data;

@Data
public class Account {

    private String accountID;
    private Long clientID;

    public Account(String accountID) {
        this.accountID = accountID;
    }
}
