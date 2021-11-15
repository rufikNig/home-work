package com.sbrf.reboot.service;

import com.sbrf.reboot.Account;
import com.sbrf.reboot.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public boolean isAccountExist(long clientID, Account account) {
        return accountRepository.getAllAccountsByClientId(clientID).contains(account);
    }

}
