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
public class l292_nim_game {
    public static boolean canWinNim (int n){
        return n%4 != 0;
    }
    
    public static void main (String[] args){
        int n = 10;
        System.out.println(canWinNim(n));
    }
}
