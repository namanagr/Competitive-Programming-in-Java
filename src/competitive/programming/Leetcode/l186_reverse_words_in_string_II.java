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
public class l186_reverse_words_in_string_II {
    
    public static String reverseWords (String sentence){
        if (sentence.length() == 0)
            return null;
        int i = 0;
        char[] sent = sentence.toCharArray();
        for (int j=0; j < sent.length; j++){
            if (sent[j] == ' '){
                sent = rev(sent,i,j-1);
                i = j + 1;                       
            }              
        }
        sent = rev(sent,i,sent.length - 1);
        sent = rev(sent,0,sent.length - 1);
        return String.copyValueOf(sent);
    }
    
    public static char[] rev (char[] sent, int i, int j){
        while (i < j) {
            char temp = sent[i];
            sent[i] = sent[j];
            sent[j] = temp;
            i++;
            j--;
        }
        return sent;
    }
    
    public static void main (String[] args){
        String sentence = "the sky is blue";
        System.out.println(reverseWords(sentence));
    }
}
