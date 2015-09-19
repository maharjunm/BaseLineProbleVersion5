//It Gives us Two Dimensional array
package com.twu.baselineproblem;

import java.util.ArrayList;

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

    public int[] countOfDiesAndLives(char[] array) {
        int livesCount = 0;
        int diesCount = 0;
        for (int i = 0; i < array.length; i++) {
            if ('-' == array[i]) {
                diesCount++;
            }
            if ('X' == array[i]) {
                livesCount++;
            }
        }
        int result[] = {livesCount, diesCount};
        return result;
    }

    public char[] adjecentValues(int[] index, char[][] array) {
        int[][] list = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int firstIndex = index[0];
        int secondIndex = index[1];
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            int firstValue = firstIndex + list[i][0];
            int secondValue = secondIndex + list[i][1];
            if (firstValue >= 0 && secondValue >= 0 && firstValue < array.length && secondValue < array[array.length - 1].length) {
                result.add(array[firstValue][secondValue]);
            }
        }
        char[] charArray = new char[result.size()];
        for (int i = 0; i < result.size(); i++) {
            charArray[i] = result.get(i);
        }
        return charArray;

    }

    public char nextTransition(char cell, int[] countOfTypes) {
        if (countOfTypes[0] == 3)
            return 'X';
        if (countOfTypes[0] == 2)
            return cell;
        return '-';
    }

    public String output(String input) {
        String output = "";
        char[][] list = split(input);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                int[] index = {i, j};
                char[] charArray = adjecentValues(index, list);
                int[] countValue = countOfDiesAndLives(charArray);
                char nextTransition = nextTransition(list[i][j], countValue);
                output += nextTransition;
            }
            output += "\n";
        }

        return output.substring(0, output.length() - 1);
    }
}
