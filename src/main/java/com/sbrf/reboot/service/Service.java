package com.sbrf.reboot.service;

import com.sbrf.reboot.Account;

public interface Service {
    boolean isAccountExist(long id, Account account);
}
