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
 * Date: 12.08.2019
 * 
 * You take your son to the forest to see the monkeys. You know that there 
 * are a certain number there (n), but your son is too young to just appreciate 
 * the full number, he has to start counting them from 1.
 *
 * As a good parent, you will sit and count with him. Given the number (n), 
 * populate an array with all numbers up to and including that number, 
 * but excluding zero.
 * 
 */
public class MonkeyCounter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(5)));
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(3)));
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(9)));
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(10)));
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(20)));
    }
    public static int[] monkeyCount(final int n){
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
           arr[i] = i+1; 
        }
        return arr;
    }
}
