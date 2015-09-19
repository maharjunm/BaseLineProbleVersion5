package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelegatorTest {

    @Test
    public void shouldReturnTheEmptyTwoDimensionalArray() {
        Delegator delegator = new Delegator("");
        char[][] array = {{}};

        assertArrayEquals(array, delegator.split(""));
    }

    @Test
    public void shouldReturnTheTwoDimensionalArray() {
        Delegator delegator = new Delegator("");
        char[][] array = {{'X', 'X', 'X'}};

        assertArrayEquals(array, delegator.split("XXX"));
    }

    @Test
    public void shouldReturnTheArrayOfLivesAndDiesWhenWePassArray() {
        Delegator delegator = new Delegator("");
        char[] array = {'-', 'X', '-'};
        int[] result = {1, 2};

        assertArrayEquals(result, delegator.countOfDiesAndLives(array));
    }

    @Test
    public void shouldReturnTheArrayOfAdjecentLivesAndDiesWhenWePassArray() {
        Delegator delegator = new Delegator("");
        char[][] array = {{'X', 'X'}};
        int[] index = {0, 0};
        char[] result = {'X'};

        assertArrayEquals(result, delegator.adjecentValues(index, array));
    }

    @Test
    public void shouldReturnTheArrayOfAdjecentLivesAndDiesWhenWePassTwoDimensionalArray() {
        Delegator delegator = new Delegator("");
        char[][] array = {{'X', 'X', '-'}, {'-', 'X', '-'}};
        int[] index = {0, 0};
        char[] result = {'X', '-', 'X'};

        assertArrayEquals(result, delegator.adjecentValues(index, array));
    }

    @Test
    public void shouldReturnTheNextTransionAsDiesWhenLiveCellHasLeastNumberOfLiveCells() {
        Delegator delegator = new Delegator("");
        char cell = 'X';
        int[] countOfTypes = {1, 1};

        assertEquals('-', delegator.nextTransition(cell, countOfTypes));
    }

    @Test
    public void shouldReturnTheNextTransionAsDiesWhenLiveCellHAsMoreThan3LiveCells() {
        Delegator delegator = new Delegator("");
        char cell = 'X';
        int[] countOfTypes = {4, 1};

        assertEquals('-', delegator.nextTransition(cell, countOfTypes));
    }

    @Test
    public void shouldReturnTheNextTransionAsAsSameWhenLiveCellAs2() {
        Delegator delegator = new Delegator("");
        char cell = 'X';
        int[] countOfTypes = {2, 1};

        assertEquals('X', delegator.nextTransition(cell, countOfTypes));
    }

    @Test
    public void shouldReturnTheNextTransionAsAsSameWhenLiveCellAs3() {
        Delegator delegator = new Delegator("");
        char cell = 'X';
        int[] countOfTypes = {3, 1};

        assertEquals('X', delegator.nextTransition(cell, countOfTypes));
    }

    @Test
    public void shouldReturnTheNextTransionAsAsLiveCellWhenLiveCellCountIsExactly3() {
        Delegator delegator = new Delegator("");
        char cell = '-';
        int[] countOfTypes = {3, 1};

        assertEquals('X', delegator.nextTransition(cell, countOfTypes));
    }

    @Test
    public void shouldReturnTheOutput() {
        String input = "XX\nXX";
        Delegator delegator = new Delegator(input);

        assertEquals(input, delegator.output());
    }

    @Test
    public void shouldReturnTheOutputAsSameForBoatPattern() {
        String input = "XX-\nX-X\n-X-";
        Delegator delegator = new Delegator(input);

        assertEquals(input, delegator.output());
    }

    @Test
    public void shouldReturnTheOutputForBlinkerPattern() {
        String input = "-X-\n-X-\n-X-";
        Delegator delegator = new Delegator(input);
        String output = "---\nXXX\n---";

        assertEquals(output, delegator.output());
    }

    @Test
    public void shouldReturnTheOutputForToadPattern() {
        String input = "----\n-XXX\nXXX-\n----";
        Delegator delegator = new Delegator(input);
        String output = "--X-\nX--X\nX--X\n-X--";

        assertEquals(output, delegator.output());
    }
}
