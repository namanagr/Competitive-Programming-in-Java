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
public class l520_detect_capital {
    static boolean detectCapitalUse(String word){
        int cnt = 0;
        for (char c : word.toCharArray()){
            if (Character.isUpperCase(c))
                cnt++;
        }
        if (cnt == word.length())
            return true;
        else if (cnt == 0)
            return true;
        else return cnt == 1 && Character.isUpperCase(word.charAt(0));
    }
    
    public static void main(String[] args){
        System.out.println(detectCapitalUse("USA"));
    }
    
}
