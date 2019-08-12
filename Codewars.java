/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 12.08.2019
 * 
 * Given an array of numbers (a list in groovy), determine whether 
 * the sum of all of the numbers is odd or even. Give your answer in string 
 * format as 'odd' or 'even'. If the input array is empty consider 
 * it as: [0] (array with a zero).
 * 
 * 
 */
public class Codewars {
    public static void main(String[] args) {
        System.out.println(Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
    }
    public static String oddOrEven(int[] array) {
        String odd = "odd";
        String even = "even";
        int sum = 0;
        if (array== null) {
            return "zero";
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum%2==0) {
            return even;
        } else {
            return odd;
        }
    }    
}
