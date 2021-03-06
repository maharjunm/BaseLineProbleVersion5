package com.twu.baselineproblem;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.validateMockitoUsage;
import static org.mockito.Mockito.when;

public class GameOfLifeTest {

    @Test
    public void shouldGiveTakeTheInputAndGiveTheOutput() throws IOException {

        Delegator delegator = mock(Delegator.class);
        InputValidator inputValidator = mock(InputValidator.class);
        UserInput userInput = mock(UserInput.class);
        GameOfLife gameOfLife = new GameOfLife(userInput, inputValidator, delegator);

        when(userInput.getInput()).thenReturn("Maharjun");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        gameOfLife.start();

        assertEquals(outputStream.toString(), "Invalid Input\n");
    }

    @Test
    public void shouldGiveTakeTheInputAndprintTheOutput() throws IOException {

        Delegator delegator = mock(Delegator.class);
        InputValidator inputValidator = mock(InputValidator.class);
        UserInput userInput = mock(UserInput.class);
        GameOfLife gameOfLife = new GameOfLife(userInput, inputValidator, delegator);
        when(userInput.getInput()).thenReturn("----\n-XXX\nXXX-\n----");
        when(inputValidator.validate("----\n-XXX\nXXX-\n----")).thenReturn(true);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        gameOfLife.start();



        assertEquals(outputStream.toString(), "--X-\nX--X\nX--X\n-X--\n");
    }
}
