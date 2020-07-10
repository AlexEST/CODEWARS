package Codewars;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author Alexander Chelpanov
 * @date 10.07.2020
 *
 * The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
 * The result array should be sorted in ascending order of values.
 * Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.
 * 
 * Examples
 * [1, 2, 3, 4]  should return [[1, 3], [2, 4]]
 * [4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
 * [1, 23, 3, 4, 7] should return [[1, 3]]
 * [4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
 *
 */

public class KYU6_DifferenceOf2 {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(twosDifference(new int[]{1, 2, 3, 4})));
		System.out.println(Arrays.deepToString(twosDifference(new int[]{1, 23, 3, 4, 7})));
		System.out.println(Arrays.deepToString(twosDifference(new int[]{4, 3, 1, 5, 6})));
	}
	
	public static int[][] twosDifference(int[] array) {
		Arrays.sort(array);
		ArrayList<int []> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (Math.abs(array[i] - array[j]) == 2) {
					list.add(new int []{array[i],array[j]});
				}
			}
		}
	    return list.toArray(new int [list.size()][]) ;
	}
}
