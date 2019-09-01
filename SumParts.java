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
 * Date: 01.09.2019
 * 
 * Sums of Parts
 * 
 * Let us consider this example (array written in general format):
 * 
 * ls = [0, 1, 3, 6, 10]
 * Its following parts:
 * 
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 * 
 * The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 * The function parts_sums (or its variants in other languages) will 
 * take as parameter a list ls and return a list of the sums of its parts 
 * as defined above.
 * 
 * P.S. Low Performance!!!!
 * 
 */
public class SumParts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[] {0, 1, 3, 6, 10})));
        System.out.println(Arrays.toString(sumParts(new int[] {1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(sumParts(new int[] {744125, 935, 
            407, 454, 430, 90, 144, 6710213, 889, 810, 2579358})));
    }

    public static int[] sumParts(int[] ls) {
        int [] arr = new int [ls.length+1];
        int sum = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = i; j < ls.length; j++) {
                sum += ls[j];
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
}
