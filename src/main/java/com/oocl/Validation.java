package com.oocl;

import java.util.ArrayList;

public class Validation {
    private static final int VALID_USER_INPUT_LENGTH = 4;
    public boolean checkIfInputLengthIsValid(ArrayList<Integer> parsedUserInput) {
        return parsedUserInput.size() == VALID_USER_INPUT_LENGTH;
    }
}
