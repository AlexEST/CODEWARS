/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 02.11.2019
 * 
 * Given two integers a and b, which can be positive or negative, find the 
 * sum of all the numbers between including them too and return it. 
 * If the two numbers are equal return a or b.
 * 
 * Note: a and b are not ordered!
 * 
 * Examples
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 * 
 * 
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(GetSum(-1,2));
        System.out.println(GetSum(0,-1));
        System.out.println(GetSum(0,1));
        System.out.println(GetSum(-17,-17));
    }

    public static int GetSum(int a, int b) {
        int ans=0;
        if (a != b) {
            if (a>b) {
                for (int i = b; i <= a; i++) {
                    ans += i;
                }   
                return ans;
            }
            if (a<b) {
                for (int i = a; i <= b; i++) {
                    ans += i;
                }  
                return ans;
            }
        }
        return a;
    }
}
