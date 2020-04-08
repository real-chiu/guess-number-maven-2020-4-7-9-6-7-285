package com.oocl;

import java.util.ArrayList;

public class CalculatorOfXAXB {

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
        return Integer.toString(finalCorrectDigitCount) + "A" + Integer.toString(finalIncorrectDigitPositionCount) + "B";
    }
}
