/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

/**
 *
 * @author Alexander Chelpanov
 * Date: 16.08.2019
 * 
 * There is an array with some numbers. All numbers are equal except for one. 
 * Try to find it!
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * 
 * It’s guaranteed that array contains more than 3 numbers.
 * The tests contain some very huge arrays, so think about performance.
 * 
 */
public class FindUniq {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
    public static double findUniq(double arr[]) {
        double uniq = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
                if (count>1) {
                    break;
                }
            }
            if (count==1) {
               uniq=arr[i];
               return uniq;
            }
            count=0;
        }
        return uniq;        
    }
}
