package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        CalculatorOfXAXB calculatorOfXAXB = new CalculatorOfXAXB();
        ProcessAndStatus processAndStatus = new ProcessAndStatus();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Validation validation = new Validation();

        ArrayList<Integer> answer = randomNumberGenerator.generateNonRepetitiveFourDigitRandomNumber();
        String output;

        while(true) {
            ProcessAndStatus.incrementRoundCount();
            if (validation.checkIfRoundCountExceedSix()) {
                System.out.println(processAndStatus.getLoseGameMessage());
                System.out.println("Answer: " + Arrays.toString(answer.toArray()));
                break;
            }

            System.out.println("Please input: ");
            String userInputString = processAndStatus.getUserInput();
            ArrayList<Integer> parsedUserInput = processAndStatus.parseUserInputString(userInputString);
            while (!validation.checkIfInputLengthIsValid(parsedUserInput) || !validation.checkIfInputDigitIsDistinct(parsedUserInput) || !validation.checkIfInputDigitIsDistinct(parsedUserInput)) {
                output = processAndStatus.printWrongInput();
                System.out.println(processAndStatus.printUserInputOutputAndStatus(parsedUserInput, output));
                userInputString = processAndStatus.getUserInput();
                parsedUserInput = processAndStatus.parseUserInputString(userInputString);
            }

            output = calculatorOfXAXB.calulateXAXB(parsedUserInput, answer);
            System.out.println(processAndStatus.printUserInputOutputAndStatus(parsedUserInput, output));
            if (validation.checkIfUserGetCorrectAnswer(output)) {
                System.out.println(processAndStatus.getWinGameMessage());
                System.out.println("Answer: " + Arrays.toString(answer.toArray()));
                break;
            }
        }
    }
}
