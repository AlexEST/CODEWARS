package Codewars;

/**
 * 
 * @author Alexander Chelpanov
 * @date 09.07.2020
 *
 * Given a string and an array of integers representing indices, capitalize all letters at the given indices.
 * 
 * For example:
 * capitalize("abcdef",[1,2,5]) = "aBCdeF"
 * capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
 * The input will be a lowercase string with no spaces and an array of digits.
 *
 */


public class KYU7_IndexedCapitalization {
	public static void main(String[] args) {
		System.out.println(capitalize("abcdef", new int[]{1,2,5}));
		System.out.println(capitalize("abcdef", new int[]{1,2,5,100}));
		
	}
	
	public static String capitalize(String s, int[] ind){
		String [] array = s.split("");
		for (int i = 0; i < ind.length; i++) {
			if (ind[i] < array.length) {
				array[ind[i]] = array[ind[i]].toUpperCase();
			}			
		}
        return String.join("", array);
    }
}
