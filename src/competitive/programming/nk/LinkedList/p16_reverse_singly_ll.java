/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

/**
 *
 * @author Lenovo
 */
public class p16_reverse_singly_ll {
    public static class LL extends LinkedList {
        // Reverses a linked list
        void reverse(){
            if (head == null)
                return;
            else {
                Node current = head;
                Node prev = null;
                Node nextNode;
                while (current != null){
                    nextNode = current.next;
                    current.next = prev;
                    prev = current;
                    current = nextNode;
                }
                head = prev;
            }
        }
    }
     public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        list.reverse();
        list.printll();
    }
    
    
}
