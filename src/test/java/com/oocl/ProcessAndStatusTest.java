package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProcessAndStatusTest {
    private ProcessAndStatus processAndStatus = new ProcessAndStatus();

    @Test
    public void should_able_to_get_user_input() {
        ArrayList<Integer> mockUserInput = new ArrayList<>();
        for (int digit = 0; digit < 4; digit += 1) {
            mockUserInput.add(digit);
        }   
        Assert.assertEquals(mockUserInput, processAndStatus.getUserInput());
    }
}
