package com.sbrf.reboot.repository;

import com.sbrf.reboot.Account;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

@Data
public class AccountRepositoryImpl implements AccountRepository {

    private Set<Account> accounts;
    private String file;

    public AccountRepositoryImpl(String file) {
        this.file = file;
    }

    public Set<Account> getAccountsFromFile() throws IOException {

        String clientID;
        String accountID;
        String line;
        Set<Account> accounts = new HashSet<>();
        try(
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis))
        ) {
            while ((line = br.readLine()) != null) {
                Account account = new Account();
                if (line.contains("clientId")) {
                    if (line.length() > 17) {
                        clientID = line.substring(16, line.length() - 1);
                        account.setClientID(Long.valueOf(clientID));
                        line = br.readLine();
                    }
                    if (line.length() > 16) {
                        accountID = line.substring(15, line.length() - 1);
                        account.setAccountID(accountID);
                    }
                    accounts.add(account);
                }
            }
        }
        return accounts;
    }

    @SneakyThrows
    public Set<Account> getAllAccountsByClientId(Long clientId) {
        Set<Account> accountsByClientId = new HashSet<>();
        accounts = getAccountsFromFile();
        for (Account account : accounts) {
            if (account.getClientID().equals(clientId)) {
                accountsByClientId.add(account);
            }
        }
        return accountsByClientId;
    }

}



