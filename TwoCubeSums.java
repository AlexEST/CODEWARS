/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;


/**
 *
 * @author Alexander Chelpanov
 * Date: 14.08.2019
 * 
 * Two cube sums
 * 
 * Create a function boolean hasTwoCubeSums(int n) which checks if a given 
 * number n can be written as the sum of two cubes in two different ways:
 * n = a³+b³ = c³+d³. All the numbers a, b, c and d should be different 
 * and greater than 0.
 * 
 * E.g. 1729 = 9³+10³ = 1³+12³.
 * 
 */
public class TwoCubeSums {
    public static void main(String[] args) {
        System.out.println(TwoCubeSums.hasTwoCubeSums(1));
        System.out.println(TwoCubeSums.hasTwoCubeSums(1729));
        System.out.println(TwoCubeSums.hasTwoCubeSums(42));
        System.out.println(TwoCubeSums.hasTwoCubeSums(4104));
        System.out.println(TwoCubeSums.hasTwoCubeSums(4105));
    }
    public static boolean hasTwoCubeSums(int n) {
        boolean answer = false;
        double  cube;
        double  cube2;
        int count = 0;
        for (int i = 1; i < Math.cbrt(n); i++) {
            cube = Math.pow(i, 3);
            for (int j = 1; j < Math.cbrt(n); j++) {
                cube2 = Math.pow(j, 3);
                if (n==cube+cube2 && j>i) {
                    count++;
                    if (count>1) {
                        answer=true;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
