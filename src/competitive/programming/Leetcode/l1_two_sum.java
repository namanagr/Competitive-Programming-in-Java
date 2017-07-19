/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.HashMap;
import java.util.Arrays;
/**
 *
 * @author naman.agrawal
 */
public class l1_two_sum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> tracker = new HashMap();
        for (int i=0; i < nums.length; i++) {
            if (!tracker.containsKey(nums[i]))
                tracker.put(target - nums[i], i);
            else
                return new int[] {tracker.get(nums[i]),i};
        }
        return null;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
