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
public class p28_display_ll_fron_end {
    public static class LL extends LinkedList {
        void reverseDisplay(Node head) {
            if (head == null)
                return;
            reverseDisplay(head.next);
            System.out.println(head.val);
        }
    }
    
    public static void main (String[] args) {
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        list.reverseDisplay(list.head);
    }
}
