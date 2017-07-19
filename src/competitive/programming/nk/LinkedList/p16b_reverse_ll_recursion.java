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
public class p16b_reverse_ll_recursion {
    public static class LL extends LinkedList {
        // Reverses a linked list
        void reverse(){
           if (head == null)
               return;
           else
               rev_process(head, null);
            }
        void rev_process(Node curr, Node prev){
            if (curr.next == null){
                head = curr;
                curr.next = prev;
                return;
            }
            Node next = curr.next;
            curr.next = prev;
            rev_process(next, curr);
        }
        
        void printReverse(Node node){
            if (node == null)
                return;
            printReverse(node.next);
            System.out.println(node.data);
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
        list.printReverse(list.head);
    }
    
}
