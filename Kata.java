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
 * You are going to be given an array of integers. Your job is to take that 
 * array and find an index N where the sum of the integers to the left of N is 
 * equal to the sum of the integers to the right of N. If there is no index 
 * that would make this happen, return -1.
 * 
 * 
 */
public class Kata {
    public static void main(String[] args) {
        System.out.println(Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        System.out.println(Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        System.out.println(Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
        System.out.println(Kata.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        System.out.println(Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        System.out.println(Kata.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        System.out.println(Kata.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
    public static int findEvenIndex(int[] arr) {
        int index = -1;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                index = i;
                return index;
            }
            rightSum = 0;
        }
        return index;
    }
}
