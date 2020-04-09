package com.oocl;

import java.util.ArrayList;

public class CalculatorOfXAXB {
    public static final String ANSWER_RESULT_PATTERN = "%sA%sB";

    public String calulateXAXB(ArrayList<Integer> userInput, ArrayList<Integer> answer) {
        int finalCorrectDigitCount = 0;
        int finalIncorrectDigitPositionCount = 0;
        for (int index = 0; index < userInput.size(); index += 1) {
            if (answer.contains(userInput.get(index))) {
                if (userInput.get(index) == answer.get(index)) {
                    finalCorrectDigitCount++;
                } else {
                    finalIncorrectDigitPositionCount++;
                }
            }
        }
        return String.format(ANSWER_RESULT_PATTERN, Integer.toString(finalCorrectDigitCount), Integer.toString(finalIncorrectDigitPositionCount));
    }
}
