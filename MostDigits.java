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
 * Most Digits
 * 
 * Find the number with the most digits. If two numbers in the argument array 
 * have the same number of digits, return the first one in the array.
 * 
 * 
 */
public class MostDigits {
    public static void main(String[] args) {
        System.out.println(MostDigits.findLongest(new int[] {1, 10, 100}));
        System.out.println(MostDigits.findLongest(new int[] {9000, 8, 800}));
        System.out.println(MostDigits.findLongest(new int[]  {8, 900, 500}));
        System.out.println(MostDigits.findLongest(new int[] {3, 40000, 100}));
        System.out.println(MostDigits.findLongest(new int[] {1, 200, 100000}));
        System.out.println(MostDigits.findLongest(new int[] {-10, 1, 0, 1, 10}));
    }
    public static int findLongest(int[] numbers) {  
        int len = String.valueOf(numbers[0]).length();
        if (numbers[0]<0) {
            len = len - 1;
        }
        int max = numbers[0];
        int len2;
        for (int i = 0; i < numbers.length; i++) {
            len2 = String.valueOf(numbers[i]).length();
            if (numbers[i]<0) {
                len2 = len2-1;
            }
            if (len < len2) {
                max = numbers[i];
                len = len2;
            }
        }
        return max;
    }
}
