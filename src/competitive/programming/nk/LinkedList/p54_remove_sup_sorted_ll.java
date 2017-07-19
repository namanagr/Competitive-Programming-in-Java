/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program removed duplicate elements from a sorted Linked List. 
// Trick - Skip the repeated adjecent elements.

/**
 *
 * @author Naman Agrawal
 */
public class p54_remove_sup_sorted_ll {
    static class LL extends LinkedList {
        void remove_dup(){
            if (head == null){
            }
            Node temp = head;
            while (temp.next != null){
                if (temp.data == temp.next.data){
                    temp.next = temp.next.next;
                }
                else
                    temp = temp.next;
            }
        }
    }
    
    public static void main(String[] args){
        LL ll = new LL();
        ll.append(new Node(1));
        ll.append(new Node(2));
        ll.append(new Node(2));
        ll.append(new Node(3));
        ll.append(new Node(3));
        ll.append(new Node(3));
        ll.remove_dup();
        ll.printll();
    }
}
