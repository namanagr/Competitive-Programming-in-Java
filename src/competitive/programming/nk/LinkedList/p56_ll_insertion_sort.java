/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// Sort the nodes of a linked list using insertion sort

/**
 *
 * @author Naman Agrawal
 */
public class p56_ll_insertion_sort {
    static class LL extends LinkedList {
        void insertion_sort(){
            if (head == null || head.next == null){                
            }
            Node dummy = new Node(0);
            dummy.next = head;
            Node compare = dummy;
            Node current = head;
            while (current != null && current.next != null){
                if (current.next.data > current.next.next.data){
                    while (compare != current.next){
                        if (compare.next.data >= current.next.data){
                            Node next = current.next.next;
                            current.next.next = compare.next;
                            compare.next = current.next;
                            current.next = next;
                        }
                        else
                            compare = compare.next;
                                                  
                    }
                }
                else
                    current = current.next;
            }
           
        }
    }
    
    public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(4));
        list.append(new Node(3));
        list.append(new Node(7));
        list.append(new Node(8));
        list.append(new Node(2));
        list.append(new Node(1));
        list.insertion_sort();
        list.printll();
    }
}
