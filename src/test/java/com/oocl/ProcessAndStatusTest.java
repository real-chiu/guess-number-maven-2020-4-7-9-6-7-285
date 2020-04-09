package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessAndStatusTest {
    private ProcessAndStatus processAndStatus = new ProcessAndStatus();
    private CalculatorOfXAXB calculatorOfXAXB = new CalculatorOfXAXB();
    @Test
    public void should_able_to_parse_user_input() {
        String data = "1234\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> parsedUserInput = processAndStatus.parseUserInputString(scanner.nextLine());
        ArrayList<Integer> expectedParsedUserInput = new ArrayList<>();
        expectedParsedUserInput.add(1);
        expectedParsedUserInput.add(2);
        expectedParsedUserInput.add(3);
        expectedParsedUserInput.add(4);
        Assert.assertEquals(expectedParsedUserInput, parsedUserInput);
    }

    @Test
    public void should_able_to_print_game_status() {
        String expectedGameStatus = "Input     Output\n"
                + "1 2 3 4        3A0B\n"
                + "1 2 3 5        4A0B\n"
                + "You win!";

        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(5);
        ArrayList<Integer> userInputOne = new ArrayList<>();
        userInputOne.add(1);
        userInputOne.add(2);
        userInputOne.add(3);
        userInputOne.add(4);
        ArrayList<Integer> userInputTwo = new ArrayList<>();
        userInputTwo.add(1);
        userInputTwo.add(2);
        userInputTwo.add(3);
        userInputTwo.add(5);
        String outputOne = calculatorOfXAXB.calulateXAXB(userInputOne, answer);
        String outputTwo = calculatorOfXAXB.calulateXAXB(userInputTwo, answer);
        String actualGameStatus = processAndStatus.printHeader();
        actualGameStatus += processAndStatus.printUserInputOutputAndStatus(userInputOne, outputOne);
        actualGameStatus += processAndStatus.printUserInputOutputAndStatus(userInputTwo, outputTwo);
        actualGameStatus += processAndStatus.winGame();
        Assert.assertEquals(expectedGameStatus, actualGameStatus);

    }
}
