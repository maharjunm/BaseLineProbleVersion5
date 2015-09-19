//It will Take the Input From the User
package com.twu.baselineproblem;

import java.io.BufferedReader;
import java.io.IOException;

public class UserInput {

    private BufferedReader bufferedReader;

    public UserInput(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String getInput() throws IOException {
        String input = bufferedReader.readLine();
        return input;
    }
}
