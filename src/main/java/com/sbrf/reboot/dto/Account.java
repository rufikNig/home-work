package com.sbrf.reboot.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Account {
    private Long id;
    private LocalDate createDate;
    private BigDecimal balance;
    private String accountID;

    public Account() {
    }

    public Account(String accountID) {
        this.accountID = accountID;
    }

    public Account(Long clientid, LocalDate createDate, BigDecimal balance) {
        this.id = clientid;
        this.createDate = createDate;
        this.balance = balance;
    }


    public static Builder builder() {
        return new Account().new Builder();
    }

    public class Builder {
        private Long id;
        private LocalDate createDate;
        private BigDecimal balance;

        public Builder id(Long clientID) {
            this.id = clientID;

            return this;
        }

        public Builder createDate(LocalDate createDate) {
            this.createDate = createDate;

            return this;
        }

        public Builder balance(BigDecimal balance) {
            this.balance = balance;

            return this;
        }

        public Account build() {
            return new Account(id, createDate, balance);
        }

    }
}
