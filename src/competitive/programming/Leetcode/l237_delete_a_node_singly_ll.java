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
public class l237_delete_a_node_singly_ll {
    
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    
    public static void delNode (ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;        
    }
    
    public static void main (String[] args){
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        System.out.println("List elements");
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        delNode(head.next.next);
        temp = head;
        System.out.println("After deleting node..");
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
