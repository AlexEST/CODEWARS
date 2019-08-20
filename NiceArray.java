/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 20.08.2019
 * 
 * Nice Array
 * 
 * A Nice array is defined to be an array where for every value n in the array,
 * there is also an element n-1 or n+1 in the array. 
 * example:
 * [2,10,9,3] is Nice array because
 * 2=3-1
 * 10=9+1
 * 3=2+1
 * 9=10-1
 * Write a function named isNice/IsNice that returns true if its array 
 * argument is a Nice array, else false. You should also return false if 
 * input array has no elements.
 * 
 */
public class NiceArray {
    public static void main(String[] args) {
        System.out.println(isNice(new Integer[]{1,2,3,4,5}));
        System.out.println(isNice(new Integer[]{5,4,3,2,1}));
        System.out.println(isNice(new Integer[]{1,3,5,2}));
        System.out.println(isNice(new Integer[]{10,10,2,2,3}));
        System.out.println(isNice(new Integer[]{}));
        System.out.println(isNice(new Integer[]{1}));
        
    }
    public static boolean isNice(Integer[] arr){
        int count = 0;
        if (arr.length==0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i]-1==arr[j] || arr[i]+1 == arr[j]) && i!=j) {
                    count++;
                    break;
                }
            }
        }
        return count==arr.length;       
    }
}
