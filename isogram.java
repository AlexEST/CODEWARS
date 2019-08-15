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
 * Isograms
 * 
 * An isogram is a word that has no repeating letters, consecutive or 
 * non-consecutive. Implement a function that determines whether a string 
 * that contains only letters is an isogram. Assume the empty string is an 
 * isogram. Ignore letter case.
 * 
 * Examples:
 * isIsogram "Dermatoglyphics" == true
 * isIsogram "moose" == false
 * isIsogram "aba" == false
 * 
 */
public class isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isogram.isIsogram("aba"));
        System.out.println(isogram.isIsogram("moOse"));
        System.out.println(isogram.isIsogram("thumbscrewjapingly"));
        System.out.println(isogram.isIsogram(""));
    }
    public static boolean  isIsogram(String str) {
        boolean answer = true;
        String Str = str.toLowerCase();
        char [] arr = Str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr [j]) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    } 
}
