/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alexander Chelpanov
 * Date: 02.09.2019
 * 
 * Flatten and sort an array
 * 
 * Challenge:
 * Given a two-dimensional array of integers, return the flattened version 
 * of the array with all the integers in the sorted (ascending) order.
 * 
 * Example:
 * Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should 
 * return [1, 2, 3, 4, 5, 6, 7, 8, 9].
 * 
 * Addendum:
 * Please, keep in mind, that JavaScript is by default sorting objects 
 * alphabetically. For more information, please consult:
 * http://stackoverflow.com/questions/6093874/why-doesnt-the-sort-function-of-javascript-work-well
 * 
 */
public class sortArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, 
            {7, 9, 8}, {6, 4, 5}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{1, 3, 5},
            {100}, {2, 4, 6}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][] {{111, 999},
            {222}, {333}, {444}, {888}, {777}, {666}, {555}})));
    }
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                list.add(array1[j]);
            }            
        }
        Collections.sort(list);
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
