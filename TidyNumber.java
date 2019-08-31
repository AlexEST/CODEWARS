/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 31.08.2019
 * 
 * Definition
 * 
 * A Tidy number is a number whose digits are in non-decreasing order.
 * Task
 * Given a number, Find if it is Tidy or not .
 * Notes
 * Number passed is always Positive .
 * Return the result as a Boolean
 * 
 * Input >> Output Examples
 * tidyNumber (12) ==> return (true)
 * Explanation:
 * The number's digits { 1 , 2 } are in non-Decreasing Order (i.e) 1 <= 2 .
 * 
 * tidyNumber (2335) ==> return (true)
 * Explanation:
 * The number's digits {2 , 3, 3, 5} are in non-Decreasing Order , Note 3 <= 3
 * 
 * 
 */
public class TidyNumber {
    public static void main(String[] args) {
        System.out.println(tidyNumber(12));
        System.out.println(tidyNumber(32));
        System.out.println(tidyNumber(39));
        System.out.println(tidyNumber(1024));
        System.out.println(tidyNumber(12576));
        System.out.println(tidyNumber(13579));
        System.out.println(tidyNumber(2335));
    }
    public static boolean tidyNumber(int number) {
        char [] arr = Integer.toString(number).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (Character.getNumericValue(arr[i])>Character.getNumericValue(arr[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
