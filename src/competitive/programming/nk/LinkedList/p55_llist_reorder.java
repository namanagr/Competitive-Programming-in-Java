/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

//Given a list, List1 = {A1, A2, ..., An}.
//Reorder the linked list to {A1, An, A2, An-1, ....} without using any extra space.

// Trick - First reverse the second list. Then merge the two list based on the re-ordering rule.

/**
 *
 * @author Naman Agrawal
 */
public class p55_llist_reorder {
    
    static class LL extends LinkedList{
        void custom_merge(LL list2){
             if (head == null)
                 head = list2.head;
             else if (list2.head == null){
             }
             else {
                 Node temp1 = head;
                 Node temp2 = list2.head;
                 Node t1,t2;
                 while (temp2 != null){
                     t1 = temp1.next;
                     temp1.next = temp2;
                     t2 = temp2.next;
                     temp2.next = t1;
                     temp1 = t1;
                     temp2 = t2;
                 }
             }
                 
        }
        
        void reverse(){
            if (head == null){
            }
            Node current = head;
            Node prev = null;
            Node temp;
            while (current != null){
                temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            head = prev;
        }
    }
    
    public static void main(String[] args){
        LL list1 = new LL();
        LL list2 = new LL();
        
        list1.append(new Node(1));
        list1.append(new Node(2));
        list1.append(new Node(3));
        list1.append(new Node(4));
        list1.append(new Node(5));
        
        list2.append(new Node(10));
        list2.append(new Node(20));
        list2.append(new Node(30));
        list2.append(new Node(40));
        list2.append(new Node(50));
        list2.reverse();
        list1.custom_merge(list2);
        list1.printll();
    }
}