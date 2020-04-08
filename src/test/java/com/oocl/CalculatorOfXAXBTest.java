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
        String result = calculatorOfXAXB.checkDigitCorrect(userInput);
        Assert.assertEquals("4A", result);
    }
}
