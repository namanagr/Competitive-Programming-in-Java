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
public class l496_findNextGreaterNo {
    static int[] findNextGreater(int[] findNums, int[] nums){
        HashMap<Integer,Integer> map = new HashMap();
        Stack<Integer> st = new Stack();
        for (int item : nums){
            while ( !st.isEmpty() && st.peek() < item){
                map.put(st.pop(),item);
            }
            st.push(item);
        }
        
        for (int i=0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i],-1);
        return findNums;
    }
    
    public static void main(String[] args){
        int[] findNums = {4,1,2};
        int[] nums = {1,3,4,2};
        System.out.println(Arrays.toString(findNextGreater(findNums, nums)));
    }
    
}
