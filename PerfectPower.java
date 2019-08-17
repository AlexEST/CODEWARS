/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

import java.util.Arrays;

/**
 *
 * @author Alexander Chelpanov
 * Date: 17.08.2019
 * 
 * What's a Perfect Power anyway?
 * 
 * A perfect power is a classification of positive integers:
 * In mathematics, a perfect power is a positive integer that can be expressed
 * as an integer power of another positive integer. More formally, n is a 
 * perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.
 * 
 * Your task is to check wheter a given integer is a perfect power. 
 * If it is a perfect power, return a pair m and k with mk = n as a proof. 
 * Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.
 * 
 * Note: For a perfect power, there might be several pairs. 
 * For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions. 
 * However, the tests take care of this, so if a number is a perfect power, 
 * return any pair that proves it.
 * 
 * Examples
 * isPerfectPower(4) => new int[]{2,2}
 * isPerfectPower(5) => null
 * isPerfectPower(8) => new int[]{2,3}
 * isPerfectPower(9) => new int[]{3,2}
 * 
 * 
 */
public class PerfectPower {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower(0)));
        System.out.println(Arrays.toString(isPerfectPower(1)));
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(3)));
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(4)));
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(5)));
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(8)));
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(9))); 
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(25)));
        System.out.println(Arrays.toString(PerfectPower.isPerfectPower(16900))); 
    }
    public static int[] isPerfectPower(int n) {
        int[] arr = new int[2];
        for (int i = 2; i < n; i++) {
            if (Math.pow(i, 2)> n ) {
                break;
            }
            for (int j = 2; j < Math.sqrt(n)+1; j++) {
                if (Math.pow(i, j) == n) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                if (Math.pow(i, j) > n) {
                    break;
                }
            }
        }
        return null;
    }
}
