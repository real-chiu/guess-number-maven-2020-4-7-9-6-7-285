package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProcessAndStatus {
    private Scanner userInput = new Scanner(System.in);
    private static int roundCount = 0;

    public static int getRoundCount() {
        return roundCount;
    }

    public static void incrementRoundCount() {
        roundCount += 1;
    }

    public String getUserInput() {
        String userInputString = userInput.nextLine();
        return userInputString;
    }

    public ArrayList<Integer> parseUserInputString(String userInputString) {
        ArrayList<Integer> userInputDigit = (ArrayList<Integer>) Arrays.asList(userInputString.split("")).stream().map(character -> Integer.parseInt(character)).collect(Collectors.toList());
        return userInputDigit;
    }

    public String loseGame() {
        if (roundCount > 6) {
            return "You are lose!";
        }
        return "";
    }

    public String winGame() {
        return "You win!";
    }

    public String printHeader() {
        return "Input     Output\n";
    }

    public String printUserInputOutputAndStatus (ArrayList<Integer> userInput, String output) {
        return String.format("1 1 1 1       TEST\n", userInput.get(0), userInput.get(1), userInput.get(2), userInput.get(3), output);
    }

}
