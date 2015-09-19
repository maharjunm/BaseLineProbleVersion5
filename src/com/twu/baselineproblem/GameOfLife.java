package com.twu.baselineproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfLife {

    private UserInput userInput;
    private InputValidator inputValidator;
    private Delegator delegator;

    public GameOfLife(UserInput userInput, InputValidator inputValidator, Delegator delegator) {
        this.userInput = userInput;
        this.inputValidator = inputValidator;
        this.delegator = delegator;
    }

    public static void main(String[] args) throws IOException {
        UserInput userInput = new UserInput(new BufferedReader(new InputStreamReader(System.in)));
        InputValidator inputValidator = new InputValidator(userInput);
        Delegator delegator = new Delegator("");
        GameOfLife gameOfLife = new GameOfLife(userInput, inputValidator, delegator);
        gameOfLife.start();
    }

    public void start() throws IOException {
        String input = userInput.getInput();
        if(inputValidator.validate(input)){
            delegator = new Delegator(input);
            System.out.println(delegator.output());
        }else{
        System.out.println("Invalid Input");
        }
    }
}
