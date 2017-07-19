/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author naman.agrawal
 */
public class l500_kb_layout_opt {
    
    static String[] kb_line(String[] words){
        String[] kb_layout = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList<String> collection = new ArrayList();
        HashMap<Character,Integer> map = new HashMap();
        for (int i=0; i<kb_layout.length; i++){
            for (char alphabet : kb_layout[i].toCharArray()){
                map.put(alphabet,i);
            }
        }
        for (String word : words){
            if (word.equals("")) continue;
            int index = map.get(word.toLowerCase().charAt(0));
            for (int i=1; i<word.length(); i++){
                if (index != map.get(word.toLowerCase().charAt(i))){
                    index = -1;
                    break;
                }
            }
            if (index != -1)
                collection.add(word);
        }
        return collection.toArray(new String[collection.size()]);            
    }
    
    
    
    static String[] kb_line_opt(String[] words){
        String[] kb_layout = {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        ArrayList<String> collection = new ArrayList();
        for (String word : words){
            if (word.equals("")) continue;
            for (String row : kb_layout){
                boolean failed = false;
                for (char alphabet : word.toCharArray()){
                    if (row.indexOf(alphabet) == -1){
                        failed = true;
                        //System.out.println(word + " " + alphabet + " " + row + " mismatch.");
                        break; 
                    }        
                }
                if (failed == false){
                    collection.add(word);
                    //System.out.println(word + " is a correct match");
                    break;
                }
            }
            
        }
        return collection.toArray(new String[collection.size()]);
    }
    
    public static void main(String[] args){
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] c = kb_line_opt(words);
        for (String word : c){
            System.out.println(word);
        }
    }
}
