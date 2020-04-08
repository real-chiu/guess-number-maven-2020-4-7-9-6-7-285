package com.oocl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RandomNumberGeneratorTest {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private ArrayList<Integer> randomNumber;
    private static final int RANDOM_NUMBER_SIZE = 4;

    @Before
    public void setUp() throws Exception {
        randomNumber = randomNumberGenerator.generateNonRepetitiveFourDigitRandomNumber();
    }

    @Test
    public void should_generate_non_repetitive_four_digit_random_number() {
        boolean isAllDigitsUnique = randomNumber.stream().distinct().collect(Collectors.toList()).size() == RANDOM_NUMBER_SIZE;
        Assert.assertEquals(true, isAllDigitsUnique);
    }
}
