package com.sbrf.reboot.repository;

import com.sbrf.reboot.dto.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountRepository {

    private Set<Account> accounts;

    public AccountRepository(Set<Account> accounts)
    {
        this.accounts = accounts;
    }

    public Set<Account>  getAllAccountsByClientId(Long id) {
        Set<Account>  accountsByClientId= new HashSet<>();
        for (Account account: accounts) {
            if(account.getId().equals(id)){
                accountsByClientId.add(account);
            }
        }
        return accountsByClientId;
    }
}
