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
public class l283_move_zeros {
    
    public static void moveZeros (int[] nums){
        int index = 0;
        for (int i=0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
    
    public static void moveZeros_opt (int[] nums){
        int index = 0;
        for (int i=0; i < nums.length; i++){
            if (nums[i] != 0) {
               nums[index] = nums[i];
               index++;                      
            }
        }
        for (int i=index; i < nums.length; i++)
            nums[i] = 0;
    }
    
    public static void main (String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
    }
}
