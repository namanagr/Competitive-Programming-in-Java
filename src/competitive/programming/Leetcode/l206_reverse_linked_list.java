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
public class l206_reverse_linked_list {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    
    static ListNode reverseList(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode prev = null, temp_next = null;
        while (head != null){
            temp_next = head.next;
            head.next = prev;
            prev = head;
            head = temp_next;
        }
        return prev;
    }
    
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        System.out.println("List elements..");
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        ListNode rev = reverseList(head);
        temp = rev;
        System.out.println("After list reversal..");
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
