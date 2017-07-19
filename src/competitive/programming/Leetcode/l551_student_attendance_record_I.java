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
public class l551_student_attendance_record_I {
    
    public static boolean checkRecord (String s){ // using regex. Less optimized
        return !s.matches(".*LLL.*|.*A.*A.*");
    }
    
    public static boolean checkRecord_opt (String s){
        int a_cnt = 0;
        int l_cnt = 0;
        for (char c : s.toCharArray()){
            if (c == 'A'){
                a_cnt++;
                l_cnt = 0;
            }
            else if (c == 'L')
                l_cnt++;
            else
                l_cnt = 0;
            if (a_cnt > 1 || l_cnt == 3)
                return false;
        }
        return true;
    }
    
    public static void main (String[] args){
        String s = "PPALLP";
        String s1 = "PPALLL";
        System.out.println(checkRecord_opt(s));
    }
}
