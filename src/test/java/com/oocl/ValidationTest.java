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

    @Test
    public void should_reject_input_when_input_digit_repeats() {
        String inputWithRepeatedDigit = "1123";
        ArrayList<Integer> mockParsedUserInputWithRepeatedDigit = processAndStatus.parseUserInputString(inputWithRepeatedDigit);

        Assert.assertEquals(false, validation.checkIfInputDigitIsDistinct(mockParsedUserInputWithRepeatedDigit));
    }

    @Test
    public void should_lose_game_when_round_count_exceed_six() {
        for (int roundCount = 0; roundCount < 7; roundCount += 1) {
            ProcessAndStatus.incrementRoundCount();
        }
        boolean loseGame = validation.checkIfRoundCountExceedSix();
        Assert.assertEquals(true, loseGame);
        Assert.assertEquals("You are lose!", processAndStatus.getLoseGameMessage());
    }

    @Test
    public void should_win_game_when_user_get_correct_answer() {
        String correctAnswer = "4A0B";
        boolean winGame = validation.checkIfUserGetCorrectAnswer("4A0B");
        Assert.assertEquals(true, winGame);
        Assert.assertEquals("You win!", processAndStatus.getWinGameMessage());
    }
}
