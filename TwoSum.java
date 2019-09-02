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
 * Date: 02.09.2019
 * 
 * Two Sum
 * 
 * Write a function that takes an array of numbers (integers for the tests) 
 * and a target number. It should find two different items in the array that, 
 * when added together, give the target value. The indices of these items 
 * should then be returned in a tuple like so: (index1, index2).
 * For the purposes of this kata, some tests may have multiple answers; 
 * any valid solutions will be accepted.
 * The input will always be valid (numbers will be an array of length 2 or 
 * greater, and all of the items will be numbers; target will always be the 
 * sum of two different items from that array).
 * 
 * Based on: http://oj.leetcode.com/problems/two-sum/
 * twoSum [1, 2, 3] 4 === (0, 2)
 * 
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{1234,5678,9012}, 14690)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,2,3}, 4)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] arr = new int [2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target && i!=j) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;        
    }
}
