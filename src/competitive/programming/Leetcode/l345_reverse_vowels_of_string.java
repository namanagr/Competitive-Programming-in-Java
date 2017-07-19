/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.HashSet;

/**
 *
 * @author naman.agrawal
 */
public class l345_reverse_vowels_of_string {
    
    public static String reverseVowels (String s){
        String vowels = "aeiouAEIOU";
        char[] list = s.toCharArray();
        int i = 0;
        int j = list.length - 1;
        while (i < j){
            while (i<j && vowels.indexOf(list[i]) == -1)
                i++;
            while (i<j && vowels.indexOf(list[j]) == -1)
                j--;
            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }
    
    public static String reverseVowels_hashmap (String s){
        HashSet<Character> set = new HashSet();
        set.add('a');set.add('A');
        set.add('e');set.add('E');
        set.add('i');set.add('I');
        set.add('o');set.add('O');
        set.add('u');set.add('U');
        char[] list = s.toCharArray();
        int i = 0;
        int j = list.length - 1;
        while (i < j){
            while (i<j && !set.contains(list[i])) i++;
            while (i<j && !set.contains(list[j])) j--;
            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(list);
        
    }
    
    public static void main (String[] args){
        String s = "leetcode";
        System.out.println(reverseVowels_hashmap(s));
    }
}
