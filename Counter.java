/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;



/**
 *
 * @author Alexander Chelpanov
 * Date: 29.09.2019
 * 
 * Consider an array of sheep where some sheep may be missing from their place. 
 * We need a function that counts the number of sheep present 
 * in the array (true means present).
 * For example,
 * 
 * [true,  true,  true,  false,
 *  true,  true,  true,  true ,
 *  true,  false, true,  false,
 *  true,  false, false, true ,
 *  true,  true,  true,  true ,
 *  false, false, true,  true]
 * 
 * The correct answer would be 17.
 * Hint: Don't forget to check for bad values like null/undefined
 * 
 */
public class Counter {
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};
        System.out.println(countSheeps(array1));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null && arrayOfSheep == true) {
                counter++;
            }
        }
        return counter;
    }
}
