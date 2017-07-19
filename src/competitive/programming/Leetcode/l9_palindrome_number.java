// This program checks whether a given number is a palindrome or not. 

/* Hints

Reverse the no and compare with original
*/

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
public class l9_palindrome_number {
    static boolean isPalindrome(int x) {
        if (x < 0 || (x>0 && x%10 == 0))
            return false;
        int rev = 0, y=x;
        while (x != 0) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        return rev == y;
    }
    
    static boolean isPalindrome_opt(int x) {
        if (x < 0 || (x>0 && x%10 == 0))
            return false;
        int rev = 0;
        while (rev < x) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        return rev == x || rev/10 == x;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome_opt(12321));
    }
}
