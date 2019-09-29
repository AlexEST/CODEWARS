/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 29.09.2019
 * 
 * Description
 * We need a function that can transform a string into a number. 
 * What ways of achieving this do you know?
 * Note: Don't worry, all inputs will be strings, and every string 
 * is a perfectly valid representation of an integral number.
 * Examples
 * stringToNumber("1234") == 1234
 * stringToNumber("605" ) == 605
 * stringToNumber("1405") == 1405
 * stringToNumber("-7"  ) == -7
 * 
 */
public class StringToNumber {
    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumber("605"));
        System.out.println(stringToNumber("-7"));
    }
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
  }
}
