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
public class l290_word_pattern {
    
    public static boolean wordPattern(String pattern, String str){
        String[] sentence = str.split(" ");
        if (pattern.length() != sentence.length)
            return false;
        HashMap<Character,String> map_p = new HashMap();
        HashMap<String,Character> map_w = new HashMap();
        for (int i=0; i < pattern.length(); i++){
            if (!map_p.containsKey(pattern.charAt(i)) && !map_w.containsKey(sentence[i])){
                map_p.put(pattern.charAt(i), sentence[i]);
                map_w.put(sentence[i], pattern.charAt(i));
            }
            else if (!map_p.containsKey(pattern.charAt(i)) || !map_w.containsKey(sentence[i]))
                return false;
            else if (!map_p.get(pattern.charAt(i)).equals(sentence[i]) || !map_w.get(sentence[i]).equals(pattern.charAt(i)))
                return false;           
        }
        return true;
    }
    
    public static void main (String[] args){
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));    
    }
}
