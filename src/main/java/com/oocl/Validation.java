package com.oocl;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Validation {
    private static final int VALID_USER_INPUT_LENGTH = 4;
    private static final String CORRECT_ANSWER_CHECK_STRING = "4A0B";

    public boolean checkIfInputLengthIsValid(ArrayList<Integer> parsedUserInput) {
        return parsedUserInput.size() == VALID_USER_INPUT_LENGTH;
    }

    public boolean checkIfInputDigitIsDistinct(ArrayList<Integer> parsedUserInput) {
        return parsedUserInput.stream().distinct().collect(Collectors.toList()).size() == VALID_USER_INPUT_LENGTH;
    }

    public boolean checkIfRoundCountExceedSix() {
        return ProcessAndStatus.getRoundCount() > 6;
    }

    public boolean checkIfUserGetCorrectAnswer(String output) {
        if (output.equals(CORRECT_ANSWER_CHECK_STRING)) {
            return true;
        }
        return false;
    }
}
