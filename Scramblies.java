/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 23.08.2019
 * 
 * Complete the function scramble(str1, str2) that returns true if a portion 
 * of str1 characters can be rearranged to match str2, otherwise returns false.
 * 
 * Notes:
 * 
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered
 * Input strings s1 and s2 are null terminated.
 * Examples
 * scramble('rkqodlw', 'world') ==> True
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 * 
 * 
 */
public class Scramblies {
    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(scramble("katas","steak"));
        System.out.println(scramble("scriptjavx","javascript"));
        System.out.println(scramble("scriptingjava","javascript"));
        System.out.println(scramble("scriptsjava","javascripts"));
        System.out.println(scramble("javscripts","javascript"));
        System.out.println(scramble("aabbcamaomsccdd","commas"));
        System.out.println(scramble("commas","commas"));
        System.out.println(scramble("sammoc","commas"));
    }
    public static boolean scramble(String str1, String str2) {
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i]==arr1[j]) {
                    counter++;
                    arr1[j] = '0';
                    break;
                }
            }
        }
        return counter==arr2.length;
    }
}
