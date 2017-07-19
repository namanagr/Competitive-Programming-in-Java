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
public class l2_add_two_numbers {
    
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l3 = new ListNode(0);
        ListNode root = l3;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int total = 0;
            if (l1 != null){
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                total += l2.val;
                l2 = l2.next;
            }
            total += carry;
            l3.next= new ListNode(total%10);
            carry = total/10;
            l3 = l3.next;
        }
        return root.next;
    }
    
    public static void main(String[] args){
        // Defining the first number
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        // Defining the second number
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l3 = addTwoNumbers(l1,l2);
        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }
}


