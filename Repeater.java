/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 16.08.2019
 * 
 * Thinkful - String Drills: Repeater
 * 
 * Write a function named repeater() that takes two arguments (a string and a 
 * number), and returns a new string where the input string is repeated that 
 * many times.
 * 
 * Example:
 * Repeater.repeat("a", 5)
 * should return
 * "aaaaa"
 * 
 */
public class Repeater {
    public static void main(String[] args) {
        System.out.println(Repeater.repeat("a",5));
        System.out.println(Repeater.repeat("Na", 16));
        System.out.println(Repeater.repeat("Wub ", 6));
    }
    public static String repeat(String string,long n){
        String str = string;
        for (int i = 0; i < n-1; i++) {
            string = string+str;
        }
        return string;
  }
}
