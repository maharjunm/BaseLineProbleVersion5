//It Validates the Input and it will return true or false
package com.twu.baselineproblem;

public class InputValidator {

    private UserInput userInput;

    public InputValidator(UserInput userInput) {
        this.userInput = userInput;
    }

    public boolean validate(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                count++;
            }
        }
        if (count == input.length())
            return true;
        return false;
    }
}
