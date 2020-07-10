package Codewars;

/**
 * 
 * @author Alexander Chelpanov
 * @date 09.07.2020
 *
 * 
 * The vowel substrings in the word codewarriors are o,e,a,io. T
 * he longest of these has a length of 2. Given a lowercase string 
 * that has alphabetic characters only (both vowels and consonants) 
 * and no spaces, return the length of the longest vowel substring. 
 * Vowels are any of aeiou.
 *
 */

public class KYU7_LongestVowelChain {
	public static void main(String[] args) {
		System.out.println(solve("ultrarevolutionariees"));
		System.out.println(solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
	}
	
	public static int solve(String s) {
		int counter = 0;
		int max = 0;
		String [] array = s.split("");
		String vowels = "aeiou";
		for (int i = 0; i < array.length; i++) {
			if (vowels.contains(array[i])) {
				counter++;
			} else {
				counter = 0;
			}
			if (counter > max) {
				max = counter;
			}
		}
		return max;
	}
}
