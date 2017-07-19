/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Returns the nth node from the end.

package competitive.programming.nk.newLinkedList;

/**
 *
 * @author naman.agrawal
 */
public class p5_nthnode_from_end {
    static Node nthNodeFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (count<n){
            count++;
            if (fast.next != null)
                fast = fast.next;
            else {
                System.out.println("Invalid n");
                return null;
            }
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    
    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        list.append(new Node(6));
        list.append(new Node(7));
        list.append(new Node(8));
        list.append(new Node(9));
        list.append(new Node(10));
        System.out.println(nthNodeFromEnd(list.head,3).val);
        
    }
}
