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
public class l125_valid_palindrome {
    static boolean isValidPalindrome(String sentence){
        int i = 0;
        int j = sentence.length() - 1;
        
        while (i<j){
            while (i<j && !Character.isLetterOrDigit(sentence.charAt(i))) i++;
            while (i<j && !Character.isLetterOrDigit(sentence.charAt(j))) j--;
            if (Character.toLowerCase(sentence.charAt(i)) != Character.toLowerCase(sentence.charAt(j))) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args){
        String sentence = "A man, a plan, a canal: Panama";
        String sentence1 = ".,";
        System.out.println(isValidPalindrome(sentence));
    }
    
}
