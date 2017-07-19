/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.*;
/**
 *
 * @author naman.agrawal
 */
public class l13_roman_to_integer {
    static int romanToInt(String roman){
        HashMap<Character,Integer> map = new HashMap();
        int sum = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i=0; i < roman.length()-1; i++){
            if (map.get(roman.charAt(i)) < map.get(roman.charAt(i+1)))
                sum -= map.get(roman.charAt(i));
            else
                sum += map.get(roman.charAt(i));
        }
        sum += map.get(roman.charAt(roman.length()-1));
        return sum;
    }
    
    static int romanToInt_using_switch(String roman){ // less optimized - time exceeded
        int sum = 0;
        for (int i=0; i < roman.length()-1; i++){
            if (romanCharToInt(roman.charAt(i)) < romanCharToInt(roman.charAt(i+1)))
                sum -= romanCharToInt(roman.charAt(i));
            else
                sum += romanCharToInt(roman.charAt(i));                    
        }
        sum += romanCharToInt(roman.charAt(roman.length()-1));
        return sum;
    }
    
    static int romanCharToInt(char c){
        int val = 0;
        switch (c){
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;
            default:
                val = 0;
        }
        return val;
    }
    
    public static void main(String[] args){
        String roman = "XVII";
        System.out.println(romanToInt_using_switch(roman));
    }
}
