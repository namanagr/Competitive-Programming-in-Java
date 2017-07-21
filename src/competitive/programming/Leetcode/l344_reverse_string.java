/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;

import java.util.Arrays;

/**
 *
 * @author naman.agrawal
 */
public class l344_reverse_string {
    
    static String strReverse(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] s_arr = s.toCharArray();
        while (i<j) {
            char temp = s_arr[i];
            s_arr[i] = s_arr[j];
            s_arr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(s_arr);
    }
    
    public static void main(String[] args) {
        String s = "hello";
        System.out.print(strReverse(s));
    }
}
