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
public class l136_single_num {
    
    static int singleNum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int val : arr) {
            if (!map.containsKey(val))
                map.put(val, 1);
            else
                map.put(val, map.get(val)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) != 2)
                return key;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        System.out.println(singleNum(arr));
        
    }
}
