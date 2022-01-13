package com.sbrf.reboot.repository;


import com.sbrf.reboot.Account;

import java.util.Set;

public interface AccountRepository {
    Set<Account> getAllAccountsByClientId(Long clientId);
}