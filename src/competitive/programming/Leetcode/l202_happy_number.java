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
public class l202_happy_number {
    static boolean isHappyNumber(int num){
        while (true){
            int sum = 0;
            int n = num;
            while (n != 0){
                int remainder = n%10;
                n = n/10;
                sum += remainder*remainder;
            }
            num = sum;
            if (num <= 6)
                break;
        }
        if (num == 1)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args){
        int no = 19;
        System.out.println(isHappyNumber(no));
    }
}
