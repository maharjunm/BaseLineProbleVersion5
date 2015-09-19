package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InputValidatorTest {

    @Test
    public void shouldReturnFalseWhenUserEntersEmptyString() throws IOException {

        UserInput userInput = mock(UserInput.class);
        InputValidator inputValidator = new InputValidator(userInput);

        when(userInput.getInput()).thenReturn("");

        assertFalse(inputValidator.validate(userInput.getInput()));
    }

    @Test
    public void shouldReturnTrueWhenUserEntersOnlyLives() throws IOException {

        UserInput userInput = mock(UserInput.class);
        InputValidator inputValidator = new InputValidator(userInput);

        when(userInput.getInput()).thenReturn("XXX");

        assertTrue(inputValidator.validate(userInput.getInput()));
    }

    @Test
    public void shouldReturnTrueWhenUserEntersOnlyDies() throws IOException {

        UserInput userInput = mock(UserInput.class);
        InputValidator inputValidator = new InputValidator(userInput);

        when(userInput.getInput()).thenReturn("---");

        assertTrue(inputValidator.validate(userInput.getInput()));
    }

    @Test
    public void shouldReturnTrueWhenUserEntersWithDiesAndLives() throws IOException {

        UserInput userInput = mock(UserInput.class);
        InputValidator inputValidator = new InputValidator(userInput);

        when(userInput.getInput()).thenReturn("-X-");

        assertTrue(inputValidator.validate(userInput.getInput()));
    }

    @Test
    public void shouldReturnFalseWhenUserEntersInvalisInput() throws IOException {

        UserInput userInput = mock(UserInput.class);
        InputValidator inputValidator = new InputValidator(userInput);

        when(userInput.getInput()).thenReturn("-sad-");

        assertFalse(inputValidator.validate(userInput.getInput()));
    }

}
