/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 04.09.2019
 * 
 * #Find the missing letter
 * 
 * Write a method that takes an array of consecutive (increasing) letters as 
 * input and that returns the missing letter in the array.
 * You will always get an valid array. And it will be always exactly one 
 * letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * 
 * Example:
 * ['a','b','c','d','f'] -> 'e'
 * ['O','Q','R','S'] -> 'P'
 * (Use the English alphabet with 26 letters!)
 * 
 */
public class MissingLetter {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
    public static char findMissingLetter(char[] array) {
        String str = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ";
        char [] arr = str.toCharArray();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (array[0]== arr[i]) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]!= arr[index+i]) {
                return arr[index+i];
            }
        }
        return ' ';
    }
}
