/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;

/**
 *
 * @author naman.agrawal
 */
public class l168_excel_sheet_column_title {
    
    static String convertToTitle(int n) {
        String res = "";
        char ch;
        while (n != 0) {
            ch = (char) ((n-1)%26 + 65);
            res = ch + res;
            n = (n-1)/26;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int num = 1000;
        System.out.println(convertToTitle(num));
    } 
    
}
