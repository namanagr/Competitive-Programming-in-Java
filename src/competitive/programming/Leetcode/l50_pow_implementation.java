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

public class l50_pow_implementation {
    static double pow(double x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        if (x == -1) {
            return n%2 == 0 ? 1 : -1;
        }
        if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
            return 0;
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
            return 0;
        if (n < 0) {
            n = -n;
            x = 1/x;
        }
        return n%2 == 0 ? pow(x*x, n/2) : x*pow(x*x, n/2);      
    }
    
   public static void main(String[] args) {
       System.out.println(pow(2,3));
       System.out.println(pow(2,-2147483648));
   } 
}
