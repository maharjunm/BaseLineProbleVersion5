package com.twu.baselineproblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameOfLife {

    private final UserInput userInput;
    private final InputValidator inputValidator;
    private final Delegator delegator;

    public GameOfLife(UserInput userInput, InputValidator inputValidator, Delegator delegator) {
        this.userInput = userInput;
        this.inputValidator = inputValidator;
        this.delegator = delegator;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput(new BufferedReader(new InputStreamReader(System.in)));
        InputValidator inputValidator = new InputValidator(userInput);
        Delegator delegator = new Delegator();

        GameOfLife gameOfLife = new GameOfLife(userInput, inputValidator, delegator);

        gameOfLife.start();
    }

    public void start() {
        System.out.println("Invalid Input");
    }
}
