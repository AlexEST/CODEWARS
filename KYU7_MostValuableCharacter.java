package Codewars;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author Alexander Chelpanov
 * @date 08.07.2020
 *
 * In this Kata, you will be given a string and your task is to return the most valuable character. 
 * The value of a character is the difference between the index of its last occurrence and the index 
 * of its first occurrence. Return the character that has the highest value. If there is a tie, 
 * return the lexicographically lowest character.
 * 
 * All inputs will be lower case.
 * 
 * For example:
 * solve('a') = 'a'
 * solve('ab') = 'a'. Last occurrence is equal to first occurrence of each character. Return lexicographically lowest.
 * solve("axyzxyz") = 'x'
 *
 */

public class KYU7_MostValuableCharacter {
	public static void main(String[] args) {
		System.out.println(solve("axyzxyz"));
		System.out.println(solve("acefacefacef"));
		System.out.println(solve("efghijefghi"));
	}

	public static char solve(String s) {
		java.util.List<String> chars = Arrays.asList(s.split(""));
		Collections.sort(chars);
		char most = chars.get(0).charAt(0);
		int max = 0;
		for (int i = 0; i < chars.size(); i++) {
			int counter = 0;
			for (int j = i + 1; j < chars.size(); j++) {
				if (chars.get(i).equalsIgnoreCase(chars.get(j))) {
					counter++;
				}
			}
			if (counter > max) {
				most = chars.get(i).charAt(0);
				max = counter;
			}
		}
		return most;
	}
}
