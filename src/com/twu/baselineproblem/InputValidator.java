//It Validates the Input and it will return true or false
package com.twu.baselineproblem;

public class InputValidator {

    private UserInput userInput;

    public InputValidator(UserInput userInput) {
        this.userInput = userInput;
    }

    public boolean validate(String input) {
        String[] list = input.split("\n");
        String out = "";
        for (int i = 0; i < list.length; i++) {
            out += list[i];
        }
        int count = 0;
        for (int i = 0; i < out.length(); i++) {
            if (out.charAt(i) == 'X' || out.charAt(i) == '-') {
                count++;
            }
        }
        if (count == out.length())
            return true;
        return false;
    }
}
