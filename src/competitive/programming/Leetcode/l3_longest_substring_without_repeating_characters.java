/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
# This program finds the longest substring without repeating characters.

'''
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
'''
*/
package competitive.programming.Leetcode;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author naman.agrawal
 */
public class l3_longest_substring_without_repeating_characters {
    static int longestSubstr(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        HashMap<Character,Integer> tracker = new HashMap();
        int start = 0;
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            if (tracker.containsKey(s.charAt(i)))
                start = Math.max(start, tracker.get(s.charAt(i))+1);
            tracker.put(s.charAt(i),i);
            max = Math.max(max, i-start+1);
        }
        return max;
    }
    
    static int longestSubset_hashset(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        int j=0;
        HashSet<Character> tracker = new HashSet();
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            if (!tracker.contains(s.charAt(i))) {
                tracker.add(s.charAt(i));
                max = Math.max(max, tracker.size());          
            }
            else {
                tracker.remove(s.charAt(j++));
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(longestSubset_hashset(s));
    }
}
