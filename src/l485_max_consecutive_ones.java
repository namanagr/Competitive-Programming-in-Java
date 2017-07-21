/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naman.agrawal
 */
public class l485_max_consecutive_ones {
    
    static int max_consecutive_ones(int[] arr) {
        int count = 0;
        int max_count = 0;
        for (int val : arr) {
            if (val == 1)
                count++;
            else {
                max_count = Math.max(max_count, count);
                count = 0;
            }
        }
        return Math.max(max_count, count);
    }
    
    public static void main(String[] args) {
       int[] arr = {1,1,0,1,1,1};
       System.out.println(max_consecutive_ones(arr));
    }
}
