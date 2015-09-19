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
        String output = "";
        String input;
        while (!(input = bufferedReader.readLine()).equals("")) {
            output += input + "\n";
        }
        return output.substring(0, output.length() - 1);
    }
}
