package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculatorOfXAXB calculatorOfXAXB = new CalculatorOfXAXB();
        ProcessAndStatus processAndStatus = new ProcessAndStatus();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Validation validation = new Validation();

        ArrayList<Integer> answer = randomNumberGenerator.generateNonRepetitiveFourDigitRandomNumber();
        System.out.println("Answer: " + Arrays.toString(answer.toArray()));
        String output;

        while(true) {
            ProcessAndStatus.incrementRoundCount();
            if (validation.checkIfRoundCountExceedSix()) {
                System.out.println(processAndStatus.loseGame());
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
                System.out.println(processAndStatus.winGame());
                break;
            }
        }
    }
}
