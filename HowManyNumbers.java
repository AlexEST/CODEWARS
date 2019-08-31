/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Chelpanov
 * Date: 31.08.2019
 * 
 * How many numbers III?
 * 
 * We want to generate all the numbers of three digits that:
 * the value of adding their corresponding ones(digits) is equal to 10. 
 * their digits are in increasing order (the numbers may have two or more 
 * equal contiguous digits)
 * The numbers that fulfill the two above constraints are: 118, 127, 
 * 136, 145, 226, 235, 244, 334
 * 
 * Make a function that receives two arguments:
 * the sum of digits value
 * the amount of desired digits for the numbers
 * The function should output an array with three values: [1,2,3]
 * 
 * 1 - the total amount of all these possible numbers
 * 2 - the minimum number
 * 3 - the maximum numberwith
 * 
 * The example given above should be:
 * HowManyNumbers.findAll(10, 3) == [8, 118, 334] 
 * If we have only one possible number as a solution, it should output a 
 * result like the one below:
 * 
 * HowManyNumbers.findAll(27, 3) == [1, 999, 999]
 * If there are no possible numbers, the function should output the empty array.
 * 
 * HowManyNumbers.findAll(84, 4) == []
 * The number of solutions climbs up when the number of digits increases.
 * 
 * HowManyNumbers.findAll(35, 6) == [123, 116999, 566666]
 * 
 * P.S. Passed only sample tests. LOW PERFORMANCE!!!
 * 
 */
public class HowManyNumbers {
    public static void main(String[] args) {
        System.out.println(findAll(10, 3));
        System.out.println(findAll(27, 3));
        System.out.println(findAll(84, 4));
        System.out.println(findAll(35, 6));
        
    }
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        long limit = (long) Math.pow(10, numDigits);
        long start = (long) Math.pow(10, numDigits - 1);
        List<Long> list = new ArrayList<>(3);
        int call = 0;
        long num = 0;
        long min = 0;
        long max = 0;
        boolean check = true;
        char[] arr;
        long counter = 0;
        for (long i = start; i < limit; i++) {
            arr = Long.toString(i).toCharArray();
            for (int l = 0; l < arr.length; l++) {
                if (l+1<arr.length && Character.getNumericValue(arr[l]) > 
                        Character.getNumericValue(arr[l+1])) {
                        check = false;
                        break;
                    }
            }
            if (check == true) {
                for (int j = 0; j < arr.length; j++) {
                    num = num + Long.parseLong(Character.toString(arr[j]));
                }
                if (num == sumDigits) {
                    counter++;
                    if (call == 0) {
                        min = i;
                        max = i;
                        call = 1;
                    }
                    if (i < min) {
                        min = i;
                    }
                    if (i > max) {
                        max = i;
                    }
                }
                num = 0;
            }
            check = true;
        }
        list.add(counter);
        if (counter==0) {
           return new ArrayList<>(); 
        }
        list.add(min);
        list.add(max);        
        return list;
    }
}
