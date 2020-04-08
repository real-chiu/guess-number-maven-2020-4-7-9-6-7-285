package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ValidationTest {
    private ProcessAndStatus processAndStatus = new ProcessAndStatus();
    private Validation validation = new Validation();
    @Test
    public void should_reject_input_when_input_length_is_not_four() {
        String inputWithExtraDigit = "12345";
        String inputWithNotEnoughDigit = "123";
        ArrayList<Integer> mockParsedUserInputWithExtraDigit = processAndStatus.parseUserInputString(inputWithExtraDigit);
        ArrayList<Integer> mockParsedUserInputWithNotEnoughDigit = processAndStatus.parseUserInputString(inputWithNotEnoughDigit);

        Assert.assertEquals(false, validation.checkIfInputLengthIsValid(mockParsedUserInputWithExtraDigit));
        Assert.assertEquals(false, validation.checkIfInputLengthIsValid(mockParsedUserInputWithNotEnoughDigit));
    }
}
