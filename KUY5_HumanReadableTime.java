/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Chelpanov
 * Date: 25.12.2019
 * 
 * Write a function, which takes a non-negative integer (seconds) as input 
 * and returns the time in a human-readable format (HH:MM:SS)
 * 
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 * 
 * You can find some examples in the test fixtures.
 * 
 */
public class KUY5_HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(0));
    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;//получаем количество часов
        int remMinInsec = seconds - (hours * 3600);//получаемя количество минут в секундах после вычета часов
        int min = remMinInsec / 60;//получае количество минут
        int sec = seconds-(hours*3600)-(min*60);//получаем секунды
        return String.format("%02d:%02d:%02d", hours, min, sec);
    }
}
