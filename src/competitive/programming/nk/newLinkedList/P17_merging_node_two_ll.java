/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.newLinkedList;

/**
 *
 * @author naman.agrawal
 */

// Finds anf returns the merging node of two linked lists

public class P17_merging_node_two_ll {
    
    static Node mergingNode(Node l1, Node l2){
        if (l1 == null || l2 == null)
            return null;
        Node temp1 = l1;
        Node temp2 = l2;
        int len1 = 0;
        int len2 = 0;
        
        // Calculate the length of list1
        while (temp1 != null){
            len1++;
            temp1 = temp1.next;
        }
        
        // Calculate the length of list2
        while (temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        
        int diff = Math.abs(len1-len2);
        
        if (len1 > len2){
            temp1 = l1;
            temp2 = l2;
        }
        else {
            temp1 = l2;
            temp2 = l1;
        }
        
        for (int i=0; i<diff; i++){
            temp1 = temp1.next;
        }
        
        while (temp1 != null){
            if (temp1 == temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    
    public static void main(String[] args){
        Node headA = new Node(0);
        Node headB = new Node(10);
        headA.next = new Node(1);
        headB.next = new Node(11);
        headB.next.next = headA.next;
        Node common = mergingNode(headA, headB);
        if ( common != null)
            System.out.println("The interesction node has value " + common.val);
        else
            System.out.println("The lists do not meet");
    }
}
