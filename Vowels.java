/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 12.08.2019
 * 
 * Vowel count
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, and u as vowels for this Kata.
 * The input string will only consist of lower case letters and/or spaces.
 * 
 * 
 */
public class Vowels {
    public static void main(String[] args) {
        System.out.println(Vowels.getCount("abracadabra"));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        String Vowels = "aeiou";
        char [] vowels = Vowels.toCharArray();
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i]==vowels[j]) {
                    vowelsCount++;
                }
            }                        
        }
        return vowelsCount;
    }
}
