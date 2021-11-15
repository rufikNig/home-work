package com.sbrf.reboot.atm;

import java.util.ArrayList;

public class Cassette <T>{

    private ArrayList<T> banknote;

    public Cassette(ArrayList<T> banknote) {
        this.banknote = banknote;
    }

    public int getCountBanknotes() {
        return banknote.size();
    }
}
