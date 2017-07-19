/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program modifies a given LinkedList such that the even nodes are in the beginning and then the odd nodes.

/**
 *
 * @author Naman Agrawal
 */
public class p43_first_even_then_odd_ll {
    static class LL extends LinkedList {
        
        void print_list(){
            if (head == null)
                System.out.println("Empty list. Nothing to print");
            else {
                Node temp = head;
                while (temp != null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }
        }
        
        void tweak(){
            if (head == null || head.next == null)
                return;
            Node even = new Node(0);
            Node start = even;
            Node temp = head;
            while (temp != null && temp.next != null){
                    even.next = temp.next;
                    even = even.next;
                    //System.out.println(temp.next.data);
                    temp.next = temp.next.next;
                    temp = temp.next;
            }
            even.next = head;
            head = start.next;
        }
    }
    
    public static void main(String[] args){
        LL list = new LL();
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
        list.tweak();
        list.print_list();
        
    }
    
}
