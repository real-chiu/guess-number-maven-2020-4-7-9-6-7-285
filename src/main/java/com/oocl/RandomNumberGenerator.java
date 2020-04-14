package com.oocl;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumberGenerator {

    public ArrayList<Integer> generateNonRepetitiveFourDigitRandomNumber() {
        ArrayList<Integer> allDigits = new ArrayList<>();
        for (int digit = 0; digit < 10; digit += 1) {
            allDigits.add(digit);
        }

        Collections.shuffle(allDigits);

        return new ArrayList<>(allDigits.subList(0, 4));
    }
}
