package com.sbrf.reboot.atm.cassettes;

import com.sbrf.reboot.atm.Banknote;
import com.sbrf.reboot.atm.Cassette;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CassetteTest {

    class OneHundred extends Banknote {
        private final Integer oneHundred;

        public  OneHundred() {
            this.oneHundred = 100;
        }

    }

    class OneThousand extends Banknote {
        private final Integer oneThousand;

        public OneThousand(Integer oneThousand) {
            this.oneThousand = 1000;
        }
    }

    @Test
    void getCountBanknotes() {
        OneHundred oneHundred = new OneHundred();

        Cassette<OneHundred> cassette = new Cassette<>(new ArrayList<OneHundred>() {{
            add(oneHundred);
//            add(new OneThousand()); //it will not compile
//            add(new Banknote()); //it will not compile
        }});

        Assertions.assertEquals(1, cassette.getCountBanknotes());
    }
}