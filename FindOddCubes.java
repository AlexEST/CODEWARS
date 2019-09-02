/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 02.09.2019
 * 
 * Sum of Odd Cubed Numbers
 * 
 * Find the sum of the odd numbers within an array, after cubing the initial 
 * integers. The function should return undefined/None/nil/NULL if any of 
 * the values aren't numbers.
 * 
 */
public class FindOddCubes {
    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[] {-5, -5, 5, 5}));
        System.out.println(cubeOdd(new int[] {1, 2, 3, 4}));
        System.out.println(cubeOdd(new int[] {-3, -2, 2, 3}));
    }

    public static int cubeOdd(int arr[]) {
        int sumCubes = 0;    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0 || arr[i]==1) {
                sumCubes += (int)Math.pow(arr[i], 3);
            }
        }
        return sumCubes;
    }
}
