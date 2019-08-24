/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;

/**
 *
 * @author Alex
 * 
 * 
 * 
 * Sudoku Background
 * Sudoku is a game played on a 9x9 grid. The goal of the game is to fill all 
 * cells of the grid with digits from 1 to 9, so that each column, each row, 
 * and each of the nine 3x3 sub-grids (also known as blocks) contain all of 
 * the digits from 1 to 9. 
 * (More info at: http://en.wikipedia.org/wiki/Sudoku)
 * 
 * Sudoku Solution Validator
 * Write a function validSolution/ValidateSolution/valid_solution() that 
 * accepts a 2D array representing a Sudoku board, and returns true if it is a 
 * valid solution, or false otherwise. The cells of the sudoku board may also 
 * contain 0's, which will represent empty cells. Boards containing one or more
 * zeroes are considered to be invalid solutions.
 * 
 * The board is always 9 cells by 9 cells, and every cell only contains 
 * integers from 0 to 9.
 */
public class SudokuValidator {
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        int[][] sudoku2 = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 0, 3, 4, 8},
            {1, 0, 0, 3, 4, 2, 5, 6, 0},
            {8, 5, 9, 7, 6, 1, 0, 2, 0},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 0, 1, 5, 3, 7, 2, 1, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 0, 0, 4, 8, 1, 1, 7, 9}};
        int [][] s = new int [0][0];
        System.out.println(check(sudoku));       
        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;
        System.out.println(check(sudoku));
        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;
        sudoku[4][4] = 0;
        System.out.println(check(sudoku));
        System.out.println(check(sudoku2));
        System.out.println(check(s));
    }

    public static boolean check(int[][] sudoku) {
        if (sudoku.length==0) {
            return false;
        }
        int colCounter = 0;
        int rowCounter = 0;
        int counter = 0;
        int index = 0;
        int[] arr = new int[sudoku.length];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
                arr[j] = sudoku[i][j];
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == sudoku[i][j] && k != j) {
                        return false;
                    }
                }
            }
            Arrays.fill(arr, 0);
        }
        while (true) {
            for (int i = rowCounter; i < rowCounter+3; i++) {
                for (int j = colCounter; j < colCounter+3; j++) {
                    arr[index] = sudoku[i][j];
                    counter++;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == sudoku[i][j] && k!=index) {
                            return false;
                        }
                    }
                    index++;
                }
            }
            if (rowCounter==sudoku.length-1) {
                counter++;
            }
            Arrays.fill(arr, 0);
            if (counter==81) {
                break;
            }
            index=0;
            if (colCounter>4) {
                rowCounter += 3;
                colCounter = 0;
            }else{
                rowCounter=0;
                colCounter += 3;
            }     
        }       
        return true;
    }
}
