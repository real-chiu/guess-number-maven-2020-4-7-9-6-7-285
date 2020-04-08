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

    public String printWrongInput() {
        return "Wrong Input，Input again";
    }
    public String printHeader() {
        return "Input     Output\n";
    }

    public String printUserInputOutputAndStatus (ArrayList<Integer> userInput, String output) {
        String input = "";
        for(Object inputDigit: userInput.toArray()) {
            input += ((Integer) inputDigit) + " ";
        }
        return String.format("%s       %s\n", input, output);
    }

}
