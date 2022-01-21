package com.sbrf.reboot.service;

import com.sbrf.reboot.dto.Account;

public interface Service {
    boolean isAccountExist(long id, Account account);
}
