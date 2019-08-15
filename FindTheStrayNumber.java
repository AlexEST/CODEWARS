/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 15.08.2019
 * 
 * 
 * You are given an odd-length array of integers, in which all of them 
 * are the same, except for one single number. Complete the method which 
 * accepts such an array, and returns that single different number. 
 * The input array will always be valid! (odd-length >= 3)
 * 
 * Examples
 * [1, 1, 2] ==> 2
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 * 
 * 
 */
public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]) {
                    count++;
                }
                if (count>1 && numbers[i]!=numbers[j]) {
                    return numbers[j];
                }
            }
            if (count==1) {
                return numbers[i];
            }
            count=0;
        }
        return 0;
    }
}
