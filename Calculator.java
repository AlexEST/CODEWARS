/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEWARS;

import java.util.ArrayList;

/**
 *
 * @author Alexander Chelpanov
 * Date: 28.08.2019
 * 
 * Calculator
 * 
 * Create a simple calculator that given a string of operators (+ - * and /) 
 * and numbers separated by spaces returns the value of that expression
 * Example:
 * Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
 * Remember about the order of operations! Multiplications and divisions have 
 * a higher priority and should be performed left-to-right. Additions and 
 * subtractions have a lower priority and should also be performed left-to-right.
 * 
 * P.S. Passed only sample tests!!!
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(evaluate("2 + 3"));
        System.out.println(evaluate("2 - 3 - 4"));
        System.out.println(evaluate("7.7 - 3.3 - 4.4"));
        System.out.println(evaluate("2 / 2 + 3 * 4"));
        System.out.println(evaluate("10 * 5 / 5"));
        System.out.println(evaluate("2.555 + 2.445 + 100"));
        System.out.println(evaluate("2.555 + 2.445 + 100/10 - 5 * 2"));
    }

    public static Double evaluate(String expression) {
        expression = expression.replaceAll("\\s+", "");
        char[] arr = expression.toCharArray();
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Character> signs = new ArrayList<>();
        double exp;
        String str = "";
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && Character.isDigit(arr[i]) && (arr[i + 1] == '.'
                    || Character.isDigit(arr[i + 1]))) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == '/' || arr[j] == '*' || arr[j] == '+' || arr[j] == '-') {
                        break;
                    }
                    str += arr[j];
                    counter++;
                }
                list.add(Double.valueOf(str));
                i += counter - 1;
                counter = 0;
                str = "";
            } else if (Character.isDigit(arr[i])) {
                str += arr[i];
                list.add(Double.valueOf(str));
                str = "";
            } else {
                signs.add(arr[i]);
            }
        }
        exp = list.get(0);
        counter = 1;
        int skip = 0;
        for (int i = 0; i < signs.size(); i++) {
            if (signs.get(i) == '/' || signs.get(i) == '*') {
                if (signs.get(i) == '/') {
                    exp = exp / list.get(counter);
                    counter++;
                }
                if (signs.get(i) == '*') {
                    exp = exp * list.get(counter);
                    counter++;
                }
            }
            if (signs.get(i) == '-' || signs.get(i) == '+') {
                if (i+1<signs.size() && signs.get(i) == '-' && (signs.get(i + 1) != '*'
                        && signs.get(i + 1) != '/')) {
                    exp = exp - list.get(counter);
                    counter++;
                } else if (i+1<signs.size() && signs.get(i) == '+' && (signs.get(i + 1) != '*'
                        && signs.get(i + 1) != '/')) {
                    exp = exp + list.get(counter);
                    counter++;
                } else if (i+1<signs.size() && signs.get(i) == '+' && (signs.get(i + 1) == '*'
                        || signs.get(i + 1) == '/')) {
                    if (signs.get(i+1) == '*') {
                        exp = exp + (list.get(counter) * list.get(counter + 1));
                        counter += 2;
                        i++; skip++;
                    } else {
                        exp = exp + (list.get(counter) / list.get(counter + 1));
                        counter += 2;
                        i++; skip++;
                    }
                } else if (i+1<signs.size() && signs.get(i) == '-' && (signs.get(i + 1) == '*'
                        || signs.get(i + 1) == '/') && skip==0) {
                    if (signs.get(i+1) == '*') {
                        exp = exp - (list.get(counter) * list.get(counter + 1));
                        counter += 2;
                        i++; skip++;
                    } else {
                        exp = exp - (list.get(counter) / list.get(counter + 1));
                        counter += 2;
                        i++; skip++;
                    }
                } else if (signs.get(i) == '-' && skip == 0) {
                    exp = exp - list.get(counter);
                    counter++;
                } else if (signs.get(i) == '+' && skip == 0) {
                    exp = exp + list.get(counter);
                    counter++;
                }
            }
            skip = 0;
        }
        return exp;
    } 
}