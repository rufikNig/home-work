package com.sbrf.reboot.atm;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class Cassette <T>{

    private ArrayList<T> banknote;

    public int getCountBanknotes() {
        return banknote.size();
    }
}
