/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 11.08.2019
 * 
 * Summation
 * Write a program that finds the summation of every number from 1 to num. 
 * The number will always be a positive integer greater than 0.
 * 
 */
public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(1));
        System.out.println(GrassHopper.summation(8));
    }
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
