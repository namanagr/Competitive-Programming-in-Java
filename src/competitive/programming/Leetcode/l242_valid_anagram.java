/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.*;
/**
 *
 * @author naman.agrawal
 */
public class l242_valid_anagram {
    
    public static boolean isAnagram (String s, String t){
        if (s.length() != t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap();
        for (char alphabet : s.toCharArray()){ // Build a hashmap for all the characters in string 's'
            if (!map.containsKey(alphabet))
                map.put(alphabet,1);
            else
                map.put(alphabet, map.get(alphabet)+1);
        }
        for (char alphabet : t.toCharArray()){ // For each character, reducing corresponding count from the hashmap
            if (!map.containsKey(alphabet))
                return false;
            else
                map.put(alphabet, map.get(alphabet)-1);
        }
        for (char alphabet : map.keySet()){ // Valid anagram if cont of each key alphabet in the hasmap is 0
            if (map.get(alphabet) != 0)
                return false;
        }
        return true;
    }
    
    public static boolean isAnagram_using_sorting (String s, String t){
        if (s.length() != t.length())
            return false;
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        if (String.valueOf(s_arr).equals(String.valueOf(t_arr)))
            return true;
        else
            return false;                
    }
    
    public static void main (String[] args){
        String s = "aabbcc";
        String t = "abcabc";
        System.out.println(isAnagram_using_sorting(s,t));
    }
    
}
