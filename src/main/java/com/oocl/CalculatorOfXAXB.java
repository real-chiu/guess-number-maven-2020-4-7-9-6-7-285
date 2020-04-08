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

    public String checkDigitPositionCorrect(ArrayList<Integer> userInput, ArrayList<Integer> answer) {
        if (userInput.get(0) == answer.get(0) && userInput.get(1) == answer.get(1) && userInput.get(2) == answer.get(2) && userInput.get(3) == answer.get(3)) {
            return "4B";
        }

        return "";
    }
}
