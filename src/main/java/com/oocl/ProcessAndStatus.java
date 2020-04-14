package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProcessAndStatus {
    public static final String WRONG_INPUT_STRING = "Wrong Input，Input again";
    public static final String HEADER = "Input     Output\n";
    public static final String LOSE_MESSAGE = "You are lose!";
    public static final String WIN_MESSAGE = "You win!";
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
            return LOSE_MESSAGE;
        }
        return "";
    }

    public String winGame() {
        return WIN_MESSAGE;
    }

    public String printWrongInput() {
        return WRONG_INPUT_STRING;
    }
    public String printHeader() {
        return HEADER;
    }

    public String printUserInputOutputAndStatus (ArrayList<Integer> userInput, String output) {
        String input = "";
        for(Object inputDigit: userInput.toArray()) {
            input += ((Integer) inputDigit) + " ";
        }
        return String.format("%s       %s\n", input, output);
    }

}
