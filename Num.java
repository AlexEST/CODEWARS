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
 * Return the Nth Even Number
 * 
 * nthEven(1) //=> 0, the first even number is 0
 * nthEven(3) //=> 4, the 3rd even number is 4 (0, 2, 4)
 * 
 * nthEven(100) //=> 198
 * nthEven(1298734) //=> 2597466
 * The input will not be 0.
 * 
 */
public class Num {
    public static void main(String[] args) {
        System.out.println(nthEven(1));
        System.out.println(nthEven(2));
        System.out.println(nthEven(3));
        System.out.println(nthEven(100));
        System.out.println(nthEven(1298734));
    }

    public static int nthEven(int n) {
        return n*2-2;
    }
}
