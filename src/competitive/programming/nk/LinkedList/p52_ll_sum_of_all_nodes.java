/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program computes the sum of all nodes
// using both resucive and iterative methoid;

/**
 *
 * @author Lenovo
 */
public class p52_ll_sum_of_all_nodes {
    public static class LL extends LinkedList{
        int sum(){
            int sum = 0;
            if (head == null)
                return 0;
            Node temp = head;
            while (temp != null){
                sum += temp.data;
                temp = temp.next;
            }
            return sum;
        }
        
        int rec_sum(Node head){
            if (head == null)
                return 0;
            return head.data + rec_sum(head.next);
        }
        
        int recursive_sum(){
            if (head == null)
                return 0;
            return rec_sum(head);
        }
    }
    public static void main(String[] args){
        LL list1 = new LL();
        list1.append(new Node(1));
        list1.append(new Node(2));
        list1.append(new Node(3));
        list1.append(new Node(4));
        list1.append(new Node(5));
        System.out.println(list1.sum());
        System.out.println(list1.recursive_sum());
    }
    
}
