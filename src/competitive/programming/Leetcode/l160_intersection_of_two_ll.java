/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.*;

/**
 *
 * @author naman.agrawal
 */
public class l160_intersection_of_two_ll {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode getIntersectionNode (ListNode headA, ListNode headB){ // Using HashMap. Less optimized
        if (headA == null || headB == null)
            return null;
        HashMap<ListNode,Boolean> map = new HashMap();
        while (headA != null){
            map.put(headA,true);
            headA = headA.next;
        }
        while (headB != null){
            if (map.containsKey(headB))
                return headB;
            else
                headB = headB.next;
        }
        return null;
    }
    
    public static ListNode getIntersectionNode_opt (ListNode headA, ListNode headB){
        if (headA == null || headB == null)
            return null;
        int len1 = 0;
        ListNode temp1 = headA;
        while (temp1 != null){ // Caluclate length of headA
            len1++;
            temp1 = temp1.next;
        }
        int len2 = 0;
        ListNode temp2 = headB;
        while (temp2 != null){ // Calculate length of headB
            len2++;
            temp2 = temp2.next;
        }
        int diff = Math.abs(len1-len2); // Calculate the difference in length
        if (len1 > len2){
            temp1 = headA;
            temp2 = headB;
        }
        else {
            temp1 = headB;
            temp2 = headA;
        }
        for (int i=0; i < diff; i++) // traverse the longer list by 'diff' nodes
            temp1 = temp1.next;
        while (temp1 != null){
            if (temp1 == temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    
    public static void main(String[] args){
        ListNode headA = new ListNode(0);
        ListNode headB = new ListNode(10);
        headA.next = new ListNode(1);
        headB.next = new ListNode(11);
        headB.next.next = headA.next;
        ListNode common = getIntersectionNode_opt(headA, headB);
        if ( common != null)
            System.out.println("The interesction node has value " + common.val);
        else
            System.out.println("The lists do not meet");
    }
}
