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

// Find if the characters of a given word can be shuffled to form a valid palindrome

public class l266_palindrome_permutation {
   public static boolean isPalindromePerm(String s){
       if (s.length() == 0)
           return true;
       HashMap<Character,Integer> map = new HashMap();
       for (char alpha : s.toCharArray()){
           if (map.containsKey(alpha))
               map.put(alpha, map.get(alpha) + 1);
           else
               map.put(alpha, 1);
       }
       int odd = 0;
       for (char key : map.keySet()){
           if (map.get(key) % 2 != 0)
               odd++;
       }
       return odd <= 1;
   }
   
   public static void main (String[] args){
       String s = "naman";
       System.out.println(isPalindromePerm(s));
   }
}
