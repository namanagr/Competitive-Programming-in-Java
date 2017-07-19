/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program adds two numbers(each no is represented by a LL where head is the LeaseSignificant digit).
// The sum should be stored in a third LinkedList

/**
 *
 * @author Naman Agrawal
 */
public class p52_ll_add_two_nos_head_lsd {
    public static class LL extends LinkedList {
        void sum(LinkedList list1, LinkedList list2){
            Node temp1 = list1.head;
            Node temp2 = list2.head;
            int carry = 0;
            int remainder = 0;
            int sum = 0;
            while (temp1 != null || temp2 != null){
                sum = temp1.data + temp2.data + carry;
                remainder = sum%10; 
                append(new Node(remainder));
                carry = (sum - remainder)/10;
                if (temp1 != null)
                    temp1 = temp1.next;
                if (temp2 != null)
                    temp2 = temp2.next;
            }
            if (carry != 0)
                append(new Node(carry));
        }
    }
    
    public static void main(String [] args){
        LL list1 = new LL();
        LL list2 = new LL();
        LL list3 = new LL();
        
        list1.append(new Node(1));
        list1.append(new Node(2));
        list1.append(new Node(3));
        
        list2.append(new Node(7));
        list2.append(new Node(8));
        list2.append(new Node(9));
        
        list3.sum(list1, list2);
        list3.printll();
    }
}
