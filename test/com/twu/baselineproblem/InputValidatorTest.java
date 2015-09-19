package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InputValidatorTest {

    @Test
    public void shouldReturnInvalidInputMessageWhenUserEntersEmptyString() throws IOException {

        UserInput userInput = mock(UserInput.class);
        InputValidator inputValidator = new InputValidator(userInput);

        when(userInput.getInput()).thenReturn("");

        assertFalse(inputValidator.validate(userInput.getInput()));
    }


}
