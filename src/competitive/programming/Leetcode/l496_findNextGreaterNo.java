/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import com.sun.java.accessibility.util.EventID;
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
    
    static int [] naman_code(int[] findNums, int[] nums) {
        //List<Integer> output = new ArrayList();
        int[] output = new int[findNums.length];
        HashMap<Integer,Integer> map = new HashMap();
        
        // Creating a mapping for next greatest element
        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[j] > nums[i]) {
                    map.put(nums[i], nums[j]);
                    break;
                }
            }
        }
        
        //for (int key : map.keySet())
        //    System.out.println(key + " " + map.get(key));
        
        // Parsing findNums and building the output array
        int i=0;
        for (int num : findNums) {
           output[i++] = map.getOrDefault(num, -1);
        }
        
        return output;
        
    }
    
    public static void main(String[] args){
        int[] findNums = {4,1,2};
        int[] nums = {1,3,4,2};
        //System.out.println(Arrays.toString(findNextGreater(findNums, nums)));
        System.out.println(Arrays.toString(naman_code(findNums, nums)));
    }
    
}
