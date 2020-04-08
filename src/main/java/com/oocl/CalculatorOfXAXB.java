package com.oocl;

import java.util.ArrayList;

public class CalculatorOfXAXB {

    public String checkDigitCorrect(ArrayList<Integer> userInput, ArrayList<Integer> answer) {
//        int finalCorrectDigitCount = userInput.stream().reduce(0, (intermediateCorrectDigitCount, currentDigit) -> {
//            if (answer.contains(currentDigit)) {
//                return ++intermediateCorrectDigitCount;
//            }
//            return intermediateCorrectDigitCount;
//        });
        boolean allCorrect = userInput.stream().allMatch(digit -> answer.contains(digit));
        boolean allNotCorrect = userInput.stream().allMatch(digit -> !answer.contains(digit));
        if (allCorrect) {
            return "4A";
        }
        if (allNotCorrect) {
            return "0A";
        }
        return "";
    }
}
