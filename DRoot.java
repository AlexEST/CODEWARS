/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 02.09.2019
 * 
 * Sum of Digits / Digital Root
 * 
 * In this kata, you must create a digital root function. A digital root is 
 * the recursive sum of all the digits in a number. Given n, take the sum of 
 * the digits of n. If that value has more than one digit, continue reducing 
 * in this way until a single-digit number is produced. This is only applicable 
 * to the natural numbers.
 * 
 * Here's how it works:
 * digital_root(16)
 * => 1 + 6
 * => 7
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * 
 * 
 */
public class DRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(456));
    }

    public static int digital_root(int n) {
        String str = "" + n;
        int sum = 0;
        while (str.length() > 1) {
            sum = 0;
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(Character.toString(arr[i]));
            }
            str = "" + sum;
        }
        return sum;
    }
}
