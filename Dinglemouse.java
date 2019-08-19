/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 19.08.2019
 * 
 * Story
 * Due to lack of maintenance the minute-hand has fallen off Town Hall clock face.
 * And because the local council has lost most of our tax money to a Nigerian 
 * email scam there are no funds to fix the clock properly. Instead, they 
 * are asking for volunteer programmers to write some code that tell the 
 * time by only looking at the remaining hour-hand!
 * 
 * What a bunch of cheapskates!
 * 
 * Can you do it?
 * 
 * Kata
 * Given the angle (in degrees) of the hour-hand, return the time in HH:MM format. 
 * Round down to the nearest minute.
 * 
 * Examples
 * 
 * 12:00 = 0 degrees
 * 03:00 = 90 degrees
 * 06:00 = 180 degrees
 * 09:00 = 270 degrees
 * 12:00 = 360 degrees
 * 
 * Notes
 * 0 <= angle <= 360
 * 
 */
public class Dinglemouse {
    public static void main(String[] args) {
        System.out.println(whatTimeIsIt(90));
        System.out.println(whatTimeIsIt(180));
        System.out.println(whatTimeIsIt(270));
        System.out.println(whatTimeIsIt(360));
        System.out.println(whatTimeIsIt(13));
    }
    public static String whatTimeIsIt(final double angle) {
        double minutes = angle*2;
        int hours = 0;
        String str;
        if (minutes>=60) {
            hours = (int)minutes/60;
            minutes = minutes - hours*60;
        }
        if (hours<10 && hours !=0) {
            if (minutes<10) {
                str = "0"+hours+":"+0+(int)minutes;
                return str;
            }
            if (minutes>=10) {
                str = "0"+hours+":"+(int)minutes;
                return str;
            }
        }else if (hours>=10){
            if (minutes<10) {
                str = hours+":"+0+(int)minutes;
                return str;
            }
            if (minutes>=10) {
                str = hours+":"+(int)minutes;
                return str;
            }
        }else if(hours==0){
            if (minutes<10) {
                str = "12:"+0+(int)minutes;
                return str;
            }
            if (minutes>=10) {
                str = "12:"+(int)minutes;
                return str;
            }
        }
        return "12:00";
    }
}
