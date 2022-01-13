package com.sbrf.reboot.service;

import com.sbrf.reboot.Account;
import com.sbrf.reboot.repository.AccountRepository;

public class AccountService implements Service {

    private AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public boolean isAccountExist(long id, Account account) {
        return accountRepository.getAllAccountsByClientId(id).contains(account);
    }

}
