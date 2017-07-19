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
public class p16b_reverse_singly_ll_recursion {
    
    public static class LL extends LinkedList {
        
        void printReverse(Node node){
            if (node == null)
                return;
            printReverse(node.next);
            System.out.println(node.val);
        }
        
        void reverse(Node node){
            if (node.next == null){
                head = node;
                return;
            }
            reverse(node.next);
            node.next.next = node;
            node.next = null;
        }
    }
    
    public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        System.out.println("Printing the list in reverse order.");
        list.printReverse(list.head);
        System.out.println("Printing the reversed list");
        list.reverse(list.head);
        list.printll();
    }
}
