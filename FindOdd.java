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
 * Find the odd int...
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * 
 * 
 */
public class FindOdd {
    public static void main(String[] args) {
        System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println(FindOdd.findIt(new int[]{10}));
        System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
    public static int findIt(int[] a) {
        int counter = a.length-1;
        int count = 0;
        int odd = 0;
        while (counter>=0) {
            int num = a[counter];
            for (int i = a.length-1; i > -1; i--) {
                if (num==a[i]) {
                    count++;
                }
            }
            if (count==1 || count%2 != 0) {
                odd = num;
                break;
            }
            count=0;
            counter--;
        }
        return odd;
    }
}
