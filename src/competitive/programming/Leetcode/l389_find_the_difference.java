// Given two strings 's' and 't'.
// String 't' has shuffled letters of 's' and then one letter was added to it.
// We need to find that letter.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.HashMap;
/**
 *
 * @author naman.agrawal
 */


public class l389_find_the_difference {
    
    static findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();
        for(char x : s.toCharArray()) {
            
        }
        
    }
    
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
