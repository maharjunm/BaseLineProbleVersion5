package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DelegatorTest {

    @Test
    public void shouldReturnTheEmptyTwoDimensionalArray() {
        Delegator delegator = new Delegator();
        char[][] array = {};

        assertArrayEquals(array, delegator.split(""));
    }

    @Test
    public void shouldReturnTheTwoDimensionalArray() {
        Delegator delegator = new Delegator();
        char[][] array = {{'X', 'X', 'X'}};

        assertArrayEquals(array, delegator.split("XXX"));
    }
}
