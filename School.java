/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Data: 24.08.2019
 * 
 * Get the mean of an array
 * 
 * It's the academic year's end, fateful moment of your school report. 
 * The averages must be calculated. All the students come to you and entreat 
 * you to calculate their average for them. Easy ! You just need to write a script.
 * Return the average of the given array rounded down to its nearest integer.
 * The array will never be empty.
 * 
 */
public class School {
    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {2,2,2,2}));
        System.out.println(getAverage(new int[] {1,2,3,4,5}));
        System.out.println(getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

    public static int getAverage(int[] marks) {
        int avg = 0;
        for (int i = 0; i < marks.length; i++) {
            avg += marks[i];
        }
        return avg/marks.length;
    }
}
