/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 28.08.2019
 * 
 * Spacify
 * 
 * Modify the spacify function so that it returns the given string with 
 * spaces between each letter. In this exercise, you can assume that only 
 * strings will be passed to your function.
 * 
 * spacify('hello world') // h e l l o   w o r l d
 * 
 * 
 */
public class Spacify {
    public static void main(String[] args) {
        System.out.println(spacify("hello world"));
        System.out.println(spacify("12345"));
    }
    public static String spacify(String str){
        char [] chars = str.toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if (i==chars.length-1) {
                s += Character.toString(chars[i]);
            }else{
                s += Character.toString(chars[i])+" ";
            }   
        }
        return s;
    }
}
