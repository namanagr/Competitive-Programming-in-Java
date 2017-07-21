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
public class l412_fizz_buzz {
    
    static void fizzbuzz(int n) {
        for (int i=1; i<=n; i++) {
            String str = "";
            if (i%3 == 0)
                str += "Fizz";
            if (i%5 == 0)
                str += "Buzz";
            if (str.equals(""))
                str = Integer.toString(i);
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        int n = 15;
        fizzbuzz(n);
    }
}
