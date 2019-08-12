/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 12.08.2019
 * 
 * You are given an array (which will have a length of at least 3, 
 * but could be very large) containing integers. The array is either entirely 
 * comprised of odd integers or entirely comprised of even integers except for 
 * a single integer N. Write a method that takes the array as an argument and 
 * returns this "outlier" N.
 * 
 * 
 */
public class FindOutlier {
    public static void main(String[] args) {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        System.out.println(FindOutlier.find(exampleTest1));
        System.out.println(FindOutlier.find(exampleTest2));
        System.out.println(FindOutlier.find(exampleTest3));
    }
    static int find(int[] integers) {
        int odd = 0;
        int even = 0;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0 && evenCount < 2) {
                evenCount++;
                even = integers[i];
            }
            if (integers[i] % 2 != 0 && oddCount < 2) {
                oddCount++;
                odd = integers[i];
            }
        }
        if (evenCount==1) {
            return even;
        } else {
            return odd;
        }
    }
}
