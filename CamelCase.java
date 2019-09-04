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
 * Convert string to camel case
 * 
 * Complete the method/function so that it converts dash/underscore delimited 
 * words into camel casing. The first word within the output should be 
 * capitalized only if the original word was capitalized 
 * (known as Upper Camel Case, also often referred to as Pascal case).
 * 
 * Examples
 * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
 * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 * 
 */
public class CamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
        System.out.println(toCamelCase("the-Stealth-Warrior"));
    }

    static String toCamelCase(String s) {
        char [] arr = s.toCharArray();
        String str = "";
        boolean Up = false;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                if (Up==true) {
                    str += Character.toUpperCase(arr[i]);
                    Up = false;
                }else{
                    str += arr[i];
                }
            }else{
                Up = true;
            }
        }
        return str;
    }
}
