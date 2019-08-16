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
 * Vasya - Clerk
 * 
 * The new "Avengers" movie has just been released! There are a lot of people 
 * at the cinema box office standing in a huge line. Each of them has a single 
 * 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars. Vasya is 
 * currently working as a clerk. He wants to sell a ticket to every single 
 * person in this line. Can Vasya sell a ticket to each person and give the 
 * change if he initially has no money and sells the tickets strictly in the 
 * order people follow in the line? Return YES, if Vasya can sell a ticket to 
 * each person and give the change with the bills he has at hand at that moment.
 * Otherwise return NO.
 * 
 * Examples:
 * Line.Tickets(new int[] {25, 25, 50}) // => YES 
 * 
 * Line.Tickets(new int[]{25, 100}) // => NO. 
 * Vasya will not have enough money to give change to 100 dollars
 * 
 * Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. 
 * Vasya will not have the right bills to give 75 dollars of change 
 * (you can't make two bills of 25 from one of 50)
 * 
 */
public class Line {
    public static void main(String[] args) {
        System.out.println(Tickets(new int[] {25, 25, 50}));
        System.out.println(Tickets(new int []{25, 100}));
    }
    public static String Tickets(int[] peopleInLine) {
        int bank = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i]==25) {
                bank += 25;
            }else if(peopleInLine[i]==50 && bank<25){
                return "NO";
            }else if(peopleInLine[i]==100 && bank<75){
                return "NO";
            }else if(peopleInLine[i]==100){
                bank -= 75;
            }else if(bank<0){
                return "NO";
            }
        }
        return "YES";
        
    }
}
