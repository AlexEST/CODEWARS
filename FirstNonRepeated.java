/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 10.10.2019
 * 
 * You need to write a function, that returns the first non-repeated character 
 * in the given string.
 * For example for string "test" function should return 'e'.
 * For string "teeter" function should return 'r'.
 * If a string contains all unique characters, then return just the 
 * first character of the string.
 * Example: for input "trend" function should return 't'
 * You can assume, that the input string has always non-zero length.
 * 
 */
public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "test";
        System.out.println(firstNonRepeated(input));
    }

    public static Character firstNonRepeated(String source) {
        char[] arr = source.toCharArray();
        int rep = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i]==arr[j]) {
                   rep = 1; 
                   break;
                }
            }
            if (rep==0) {
                return arr[i];
            }
            rep=0;
        }
        return null;
    }
}
