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
    public static final String DELIMITER = "";
    public static final int MAX_ROUND_COUNT = 6;

    private Scanner userInput = new Scanner(System.in);
    private static int roundCount = 0;

    public static int getRoundCount() {
        return roundCount;
    }

    public static void incrementRoundCount() {
        roundCount += 1;
    }

    public String printWrongInput() {
        return WRONG_INPUT_STRING;
    }
    public String printHeader() {
        return HEADER;
    }
    
    public String getUserInput() {
        String userInputString = userInput.nextLine();
        return userInputString;
    }

    public ArrayList<Integer> parseUserInputString(String userInputString) {
        ArrayList<Integer> userInputDigit = (ArrayList<Integer>) Arrays.asList(userInputString.split(DELIMITER))
                .stream()
                .map(character -> Integer.parseInt(character))
                .collect(Collectors.toList());
        return userInputDigit;
    }

    public String getLoseGameMessage() {
        if (roundCount > MAX_ROUND_COUNT) {
            return LOSE_MESSAGE;
        }
        return "";
    }

    public String getWinGameMessage() {
        return WIN_MESSAGE;
    }

    public String printUserInputOutputAndStatus (ArrayList<Integer> userInput, String output) {
        String formattedUserInput = "";
        for(Object inputDigit: userInput.toArray()) {
            formattedUserInput += ((Integer) inputDigit) + " ";
        }
        return String.format("%s       %s\n", formattedUserInput, output);
    }

}
