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
    public void should_return_4A0B_when_digit_are_all_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        String result = calculatorOfXAXB.calulateXAXB(userInput, answer);
        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A0B_when_digit_are_all_not_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(5);
        answer.add(6);
        answer.add(7);
        answer.add(8);
        String result = calculatorOfXAXB.calulateXAXB(userInput, answer);
        Assert.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_XAXB_when_digit_are_partially_correct() {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(6);
        answer.add(7);
        answer.add(4);
        String result = calculatorOfXAXB.calulateXAXB(userInput, answer);
        Assert.assertEquals("2A0B", result);

        ArrayList<Integer> answer2 = new ArrayList<Integer>();
        answer2.add(1);
        answer2.add(4);
        answer2.add(2);
        answer2.add(3);
        String result2 = calculatorOfXAXB.calulateXAXB(userInput, answer2);
        Assert.assertEquals("1A3B", result2);
    }

}
