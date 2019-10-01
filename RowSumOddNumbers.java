/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 30.09.2019
 * 
 * Given the triangle of consecutive odd numbers:
 * 
 *             1
 *          3     5
 *       7     9    11
 *    13    15    17    19
 * 21    23    25    27    29
 * ...
 * Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 * 
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8 
 * 
 */
public class RowSumOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(4));
        System.out.println(rowSumOddNumbers(42));
    }
    public static int rowSumOddNumbers(int n) {
        int i = (int)Math.pow(n, 2)-(n-1);
        int sum = i;
        for (int j = i+2; n > 1; j+=2) {
           sum += j;
           n--;
        }
        return sum;
    }
}
