package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessAndStatusTest {
    private ProcessAndStatus processAndStatus = new ProcessAndStatus();

    @Test
    public void should_able_to_parse_user_input() {
        String data = "1234\n";
        InputStream stdin = System.in;
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
}
