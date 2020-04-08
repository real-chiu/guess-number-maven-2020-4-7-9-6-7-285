package com.oocl;

import java.util.ArrayList;

public class CalculatorOfXAXB {

    public String checkDigitCorrect(ArrayList<Integer> userInput, ArrayList<Integer> answer) {
        int finalCorrectDigitCount = userInput.stream().reduce(0, (intermediateCorrectDigitCount, currentDigit) -> {
            if (answer.contains(currentDigit)) {
                return ++intermediateCorrectDigitCount;
            }
            return intermediateCorrectDigitCount;
        });
        return Integer.toString(finalCorrectDigitCount) + "A";
    }

    public String checkDigitPositionIncorrect(ArrayList<Integer> userInput, ArrayList<Integer> answer) {
        int finalIncorrectDigitPositionCount = 0;
        for (int index = 0; index < userInput.size(); index += 1) {
            if (answer.contains(userInput.get(index)) && userInput.get(index) != answer.get(index)) {
                finalIncorrectDigitPositionCount++;
            }
        }
        return Integer.toString(finalIncorrectDigitPositionCount) + "B";
    }
}
