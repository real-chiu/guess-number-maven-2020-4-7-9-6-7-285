package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProcessAndStatus {
    private Scanner userInput = new Scanner(System.in);
    private static int roundCount = 0;

    public String getUserInput() {
        String userInputString = userInput.nextLine();
        return userInputString;
    }

    public ArrayList<Integer> parseUserInputString(String userInputString) {
        ArrayList<Integer> userInputDigit = (ArrayList<Integer>) Arrays.asList(userInputString.split("")).stream().map(character -> Integer.parseInt(character)).collect(Collectors.toList());
        return userInputDigit;
    }

    public static int getRoundCount() {
        return roundCount;
    }

    public static void incrementRoundCount() {
        roundCount += 1;
    }

    public boolean loseGame(boolean loseGame) {
        return false;
    }
}
