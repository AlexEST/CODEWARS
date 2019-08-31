/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.math.BigInteger;

/**
 *
 * @author Alexander Chelpanov
 * Date: 31.08.2019
 * 
 * Definition (Primorial Of a Number)
 * Is similar to factorial of a number, In primorial, not all the natural 
 * numbers get multiplied, only prime numbers are multiplied to calculate 
 * the primorial of a number. It's denoted with P#.
 * 
 * Task
 * Given a number N , calculate its primorial. !alt  !alt
 * Notes
 * Only positive numbers will be passed (N > 0) .
 * 
 * Input >> Output Examples:
 * 1- numPrimorial (3) ==> return (30)
 * Explanation:
 * Since the passed number is (3) ,Then the primorial should obtained by 
 * multiplying 2 * 3 * 5 = 30 .
 * Mathematically written as , P3# = 30 .
 * 2- numPrimorial (5) ==> return (2310)
 * 
 * 
 */
public class Primorial {
    public static void main(String[] args) {
        System.out.println(Primorial.numPrimorial(3));
        System.out.println(Primorial.numPrimorial(4));
        System.out.println(Primorial.numPrimorial(5));
        System.out.println(Primorial.numPrimorial(8));
        System.out.println(Primorial.numPrimorial(9));
        System.out.println(Primorial.numPrimorial(100));
    }
    public static String numPrimorial(int n) {
        int divCounter = 0;
        int counter = 0;
        BigInteger num = new BigInteger ("1");
        for (int i = 1;; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    divCounter++;
                }
            }
            if (divCounter==1) {
                counter++;
                BigInteger num2 = BigInteger.valueOf(i);
                num = num.multiply(num2);
                if (counter==n) {
                    return ""+num;
                }
            }
            divCounter=0;
        }
    }
}
