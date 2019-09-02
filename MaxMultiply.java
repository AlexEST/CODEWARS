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
 * Maximum Multiple
 * 
 * Task
 * Given a Divisor and a Bound , Find the largest integer N , Such That ,
 * 
 * Conditions :
 * N is divisible by divisor
 * N is less than or equal to bound
 * N is greater than 0.
 * 
 * Notes
 * The parameters (divisor, bound) passed to the function are only positve values .
 * It's guaranteed that a divisor is Found .
 * Input >> Output Examples
 * maxMultiple (2,7) ==> return (6)
 * Explanation:
 * (6) is divisible by (2) , (6) is less than or equal to bound (7) , and (6) is > 0 .
 * maxMultiple (10,50)  ==> return (50)
 * 
 */
public class MaxMultiply {
    public static void main(String[] args) {
        System.out.println(maxMultiple(2, 7));
        System.out.println(maxMultiple(3, 10));
        System.out.println(maxMultiple(7, 17));
        System.out.println(maxMultiple(10, 50));
        System.out.println(maxMultiple(37, 200));
        System.out.println(maxMultiple(7, 100));
    }

    public static int maxMultiple(int divisor, int bound) {
        for (int i = bound; i > 0; i--) {
            if (i % divisor == 0) {
                return i;
            }
        }
        return 0;
    }
}
