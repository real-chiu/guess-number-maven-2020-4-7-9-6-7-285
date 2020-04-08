package com.oocl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CalculatorOfXAXBTest {
    private CalculatorOfXAXB calculatorOfXAXB;
    private ArrayList<Integer> userInput;

    @Before
    public void setUp() throws Exception {
        calculatorOfXAXB = new CalculatorOfXAXB();
        userInput = new ArrayList<Integer>();
        userInput.add(1);
        userInput.add(2);
        userInput.add(3);
        userInput.add(4);
    }

    @Test
    public void should_return_4A_when_digit_are_all_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        String result = calculatorOfXAXB.checkDigitCorrect(userInput, answer);
        Assert.assertEquals("4A", result);
    }

    @Test
    public void should_return_0A_when_digit_are_all_not_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(5);
        answer.add(6);
        answer.add(7);
        answer.add(8);
        String result = calculatorOfXAXB.checkDigitCorrect(userInput, answer);
        Assert.assertEquals("0A", result);
    }

    @Test
    public void should_return_XA_when_digit_are_partially_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(4);
        answer.add(6);
        answer.add(7);
        answer.add(8);
        String result = calculatorOfXAXB.checkDigitCorrect(userInput, answer);
        Assert.assertEquals("1A", result);
    }

    @Test
    public void should_return_0B_when_digit_position_are_all_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        String result = calculatorOfXAXB.checkDigitPositionIncorrect(userInput, answer);
        Assert.assertEquals("0B", result);
    }

    @Test
    public void should_return_4B_when_digit_position_are_all_not_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(4);
        answer.add(3);
        answer.add(2);
        answer.add(1);
        String result = calculatorOfXAXB.checkDigitPositionIncorrect(userInput, answer);
        Assert.assertEquals("4B", result);
    }

    @Test
    public void should_return_XB_when_digit_position_are_paritially_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(4);
        answer.add(2);
        answer.add(3);
        String result = calculatorOfXAXB.checkDigitPositionIncorrect(userInput, answer);
        Assert.assertEquals("3B", result);
    }

    @Test
    public void should_return_0B_when_all_digit_are_not_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(5);
        answer.add(6);
        answer.add(7);
        answer.add(8);
        String result = calculatorOfXAXB.checkDigitPositionIncorrect(userInput, answer);
        Assert.assertEquals("0B", result);
    }
}
