/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 * @author Alexander Chelpanov
 * Date: 28.12.2020
 * 
 * Write function alternateCase which switch every letter in string 
 * from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD
 * 
 */
public class KYU7_AlternateCase {
    static String alternateCase(final String string) {
        char[] arrStr = string.toCharArray();
        for (int i = 0; i < arrStr.length; i++) {
            if (Character.isLowerCase(arrStr[i])) {
                arrStr[i] = Character.toUpperCase(arrStr[i]);
            } else if (Character.isUpperCase(arrStr[i])) {
                arrStr[i] = Character.toLowerCase(arrStr[i]);
            }
        }
        String newString = String.valueOf(arrStr);
        return newString;
    }
   
    public static void main(String[] args) {
        String str = "Hello World";        
        System.out.println(alternateCase(str));
    }
}
