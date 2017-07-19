/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nk.LinkedList;

/**
 *
 * @author naman.agrawal
 */
public class p56_ll_insertion_sort {
    
    public static class LL extends LinkedList {
        void insertion_sort(){
            if (head == null || head.next == null) {}
            else {
                Node dummy = new Node(0);
                dummy.next = head;
                Node current  = head.next;
                while (current != null && current.next != null){
                    Node temp = dummy;
                    Node cur = current.next;
                    System.out.println(cur.data);
                    while (temp.next != current){
                        if (temp.next.data > current.data ){
                            current.next = temp.next;
                            temp.next = current; 
                            break;
                        }
                        temp = temp.next;
                    }
                    current = cur;
                }                                
            }                
        }
    }
    
    public static void main (String[] args){
        LL list = new LL();
        list.append(new Node(10));
        list.append(new Node(5));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(7));
        list.append(new Node(6));
        System.out.println("List before sorting..");
        list.printll();
        System.out.println("List after sorting..");
        list.insertion_sort();
        list.printll();
    }
    
}
