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
public class l12_integer_to_roman {
    
    static String integer_to_roman(int num) {
        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strings = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder output = new StringBuilder();
        for (int i=0; i<vals.length; i++) {
            while (num > vals[i]) {
                num -= vals[i];
                output.append(strings[i]);
            }
        }
        return output.toString();
    }
    
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(integer_to_roman(num));
               
    }
}
