package Codewars;

import java.util.Arrays;

/**
 * 
 * @author Alexander Chelpanov
 * @date: 17.06.2020
 * 
 * You are provided with array of positive non-zero ints and int n representing n-th power (n >= 2).
 * For the given array, calculate the sum of each value to the n-th power. 
 * Then subtract the sum of the original array.
 * 
 * Example 1: 
 * Input: {1, 2, 3}, 3 --> (1 ^ 3 + 2 ^ 3 + 3 ^ 3 ) - (1 + 2 + 3) --> 36 - 6 --> Output: 30
 * 
 * Example 2: 
 * Input: {1, 2}, 5 --> (1 ^ 5 + 2 ^ 5) - (1 + 2) --> 33 - 3 --> Output: 30
 *
 */

public class KYU7_NthPowerRulesThemAll {
	public static void main(String[] args) {
		System.out.println(modifiedSum(new int[] {1,2,3}, 3));
	}
	
	public static int modifiedSum(int[] array, int power) {
		int mult = 0;
		int sumArray = Arrays.stream(array).sum();
		for (int i = 0; i < array.length; i++) {
			mult += Math.pow(array[i], power);			
		}
		return mult - sumArray;
	}
}
