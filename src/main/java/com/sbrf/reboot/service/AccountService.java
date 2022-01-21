package com.sbrf.reboot.service;

import com.sbrf.reboot.dto.Account;
import com.sbrf.reboot.repository.AccountRepository;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class AccountService implements Service {

    private AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public boolean isAccountExist(long id, Account account) {
        return accountRepository.getAllAccountsByClientId(id).contains(account);
    }

    public Account getMaxAccountBalance(long l) {
        return accountRepository.getAllAccountsByClientId(l)
                .stream().max(Comparator.comparing(Account::getBalance))
                .orElseThrow(NoSuchElementException::new);
    }

    public Set<Account> getAllAccountsByDateMoreThen(long id, LocalDate date) {
        return accountRepository.getAllAccountsByClientId(id)
                .stream().filter(p -> p.getCreateDate().isAfter(date))
                .collect(Collectors.toSet());
    }
}
