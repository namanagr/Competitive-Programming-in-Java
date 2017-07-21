/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.HashSet;
import java.util.ArrayList;
/**
 *
 * @author naman.agrawal
 */
public class l448_find_nos_disappeared_in_array {
    
    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> collection = new HashSet();
        ArrayList<Integer> missing = new ArrayList();
        
        if (nums.length == 0)
            return missing;
        
        
        for (int num : nums) {
            if (!collection.contains(num))
                collection.add(num);
        }
        
        for (int i=1; i<=nums.length; i++) {
            if (!collection.contains(i))
               missing.add(i);
        }
        
        return missing;
    }
    
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums1 = {1,1};
        System.out.println(findDisappearedNumbers(nums1));
    }
} 
