/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 05.09.2019
 * 
 * Task
 * 
 * Given an array of integers , Find the maximum product obtained from 
 * multiplying 2 adjacent numbers in the array.
 * 
 * Notes
 * Array/list size is at least 2.
 * Array/list numbers could be a mixture of positives, negatives also zeroes .
 * Input >> Output Examples
 * adjacentElementsProduct([1, 2, 3]); ==> return 6
 * Explanation:
 * The maximum product obtained from multiplying 2 * 3 = 6, and they're 
 * adjacent numbers in the array.
 * adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
 * 
 */
public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int [] {5,8}));
        System.out.println(adjacentElementsProduct(new int [] {1,2,3}));
        System.out.println(adjacentElementsProduct(new int [] {1,5,10,9}));
        System.out.println(adjacentElementsProduct(new int[] {4, 12, 3, 1, 5}));
    }
    public static int adjacentElementsProduct(int[] array) {
        int max = array[0]*array[1];
        for (int i = 1; i < array.length; i++) {
            if (i+1<array.length && array[i] * array[i + 1] > max) {
                max = array[i] * array[i + 1];
            }
        }
        return max;
    }
}
