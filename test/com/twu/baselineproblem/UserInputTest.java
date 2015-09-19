package com.twu.baselineproblem;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserInputTest {

    @Test
    public void shouldTakeTheInputFromTheUser() throws IOException {

        BufferedReader bufferedReader = mock(BufferedReader.class);
        UserInput userInput = new UserInput(bufferedReader);

        when(bufferedReader.readLine()).thenReturn("Maharjun");

        assertEquals("Maharjun", userInput.getInput());
    }
}
