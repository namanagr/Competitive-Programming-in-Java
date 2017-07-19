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
public class l205_isomorphic_strings {
    static boolean isIsomorphic (String s, String t){
        if (s.length() != t.length())
            return false;
        HashMap<Character,Character> maps = new HashMap();
        HashMap<Character,Character> mapt = new HashMap();
        for (int i=0; i < s.length(); i++){
            if (!maps.containsKey(s.charAt(i)) && !mapt.containsKey(t.charAt(i))){
                maps.put(s.charAt(i),t.charAt(i));
                mapt.put(t.charAt(i),s.charAt(i));
            }
            if (!maps.containsKey(s.charAt(i)) || !mapt.containsKey(t.charAt(i)))
                return false;
            if (maps.get(s.charAt(i)) != t.charAt(i) || mapt.get(t.charAt(i)) != s.charAt(i))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        String s = "addba";
        String t = "daacd";
        System.out.println(isIsomorphic(s,t));
    }
}
