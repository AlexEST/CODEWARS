/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;

/**
 *
 * @author Alexander Chelpanov
 * Date: 31.08.2019
 * 
 * Task
 * 
 * Given an array/list [] of integers , Construct a product array Of same 
 * size Such That prod[i] is equal to The Product of all the elements of 
 * Arr[] except Arr[i].
 * 
 * Notes
 * 
 * Array/list size is at least 2 .
 * Array/list's numbers Will be only Positives
 * Repetition of numbers in the array/list could occur.
 * 
 * Input >> Output Examples
 * 
 * productArray ({12,20}) ==>  return {20,12}
 * Explanation:
 * The first element in prod [] array 12 is the product of all array's elements 
 * except the first element. The second element 20 is the product of all array's 
 * elements except the second element .
 * 
 * productArray ({1,5,2}) ==> return {10,2,5}
 * Explanation:
 * The first element 10 is the product of all array's elements except the first 
 * element *1***. The second element 2 is the product of all array's elements 
 * except the second element 5. The Third element 5 is the product of all 
 * array's elements except the Third element 2.
 * 
 * 
 */
public class ProductArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int[]{12,20})));
        System.out.println(Arrays.toString(productArray(new int[]{1,5,2})));
        System.out.println(Arrays.toString(productArray(new int[]{3,27,4,2})));
        System.out.println(Arrays.toString(productArray(new int[]{13,10,5,2,9})));
        System.out.println(Arrays.toString(productArray(new int[]{16,17,4,3,5,2})));
        System.out.println(Arrays.toString(productArray(new int[]{10,11,12,13,14,15,16,17,18,19,20})));
    }
    public static long[] productArray(int[] numbers) {
        long [] arr = new long [numbers.length];
        long num = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i!=j) {
                   num *= numbers[j]; 
                }               
            }
            arr[i]=num;
            num=1;
        }
        return arr; 
    }
}
