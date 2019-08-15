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
 * Small enough?
 * 
 * You will be given an array and a limit value. You must check that all 
 * values in the array are below or equal to the limit value. If they are, 
 * return true. Else, return false. You can assume all values in the array 
 * are numbers.
 * 
 * 
 */
public class SmallEnough {
    public static void main(String[] args) {
        System.out.println(smallEnough(new int[] { 66, 101 },200));
        System.out.println(smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 },100));
        System.out.println(smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        System.out.println(smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
    public static boolean smallEnough(int[] a, int limit) {
        boolean answer = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>limit) {
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}
