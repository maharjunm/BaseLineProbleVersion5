//It Gives us Two Dimensional array
package com.twu.baselineproblem;

public class Delegator {

    public char[][] split(String input) {
        String[] list = input.split("\n");
        char[][] result = new char[list.length][list[0].length()];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length(); j++) {
                result[i][j] = list[i].charAt(j);
            }
        }

        return result;
    }
}
