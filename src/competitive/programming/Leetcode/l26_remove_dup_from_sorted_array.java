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
public class l26_remove_dup_from_sorted_array {
    public static int removeDuplicates (int[] nums){
        if (nums.length == 0)
            return 0;
        int index = 0;
        for (int i=1; i < nums.length; i++){
            if (nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
            }                
        }
        return index + 1;
    }
    
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
