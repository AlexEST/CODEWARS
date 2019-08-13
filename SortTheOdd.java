/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

import java.util.Arrays;

/**
 *
 * @author Alexander Chelpanov
 * Date: 13.08.2019
 * 
 * Sort the odd
 * You have an array of numbers. Your task is to sort ascending odd numbers 
 * but even numbers must be on their places. Zero isn't an odd number and 
 * you don't need to move it. If you have an empty array, you need to return it.
 * Example:
 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 * 
 * 
 */
public class SortTheOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
        System.out.println(Arrays.toString(SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 })));
        System.out.println(Arrays.toString(SortTheOdd.sortArray(new int[]{})));
    }
    public static int[] sortArray(int[] array) {        
        if (array==null) {
            return array;
        }
        int temp;
        for (int i = array.length-1; i > -1; i--) {
            if ((array[i] % 2 != 0 && array[i] != 0) || array[i]==1) {
                for (int j = i; j > -1; j--) {
                    if ((array[j]%2 != 0 && array[j] != 0 && array[j]>array[i]) 
                            || (array[j]==1 && array[j]>array[i])) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }       
        return array;
    }
}
