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
 * Date: 20.08.2019
 * 
 * Beginner - Lost Without a Map
 * 
 * Given an array of integers, return a new array with each value doubled.
 * For example:
 * 
 * [1, 2, 3] --> [2, 4, 6]
 * 
 * For the beginner, try to use the map method - it comes in very handy 
 * quite a lot so is a good one to know.
 * 
 */
public class Maps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(map(new int[] {4, 1, 1, 1, 4})));
        System.out.println(Arrays.toString(map(new int[] {1, 1, 1, 1, 1, 1})));
    }
   public static int[] map(int[] arr) {
       int [] array = new int [arr.length];
       for (int i = 0; i < arr.length; i++) {
           array[i] = arr[i]*2;
       }
       return array;
  } 
}
