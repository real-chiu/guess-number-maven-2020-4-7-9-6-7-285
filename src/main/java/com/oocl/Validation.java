package com.oocl;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Validation {
    private static final int VALID_USER_INPUT_LENGTH = 4;

    public boolean checkIfInputLengthIsValid(ArrayList<Integer> parsedUserInput) {
        return parsedUserInput.size() == VALID_USER_INPUT_LENGTH;
    }

    public boolean checkIfInputDigitIsDistinct(ArrayList<Integer> parsedUserInput) {
        return parsedUserInput.stream().distinct().collect(Collectors.toList()).size() == VALID_USER_INPUT_LENGTH;
    }


    public boolean checkIfRoundCountExceedSix() {
        return false;
    }
}
