// Ignore the overflow cases and proceed.

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

public class l7_reverse_integer {
    
    static int reverse(int num) {
        if (num == 0 || num%10 == 0)
            return num;
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE)
            return 0;
        int rev = 0;
        while (num != 0) {
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;
        return rev;
    }
    
    public static void main(String[] args) {
        int num = -12345;
        System.out.print(reverse(num));
    }
}
