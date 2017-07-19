/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program checks whether a given LinkedList is a palindrome or not
// Uses half linkedlist reversal

/**
 *
 * @author Naman Agrawal
 */
public class p37_palindrome_ll_using_list_reversal {
    static class LL extends LinkedList {
        boolean isPalindrome(){
            if (head == null || head.next == null)
                return true;
            Node temp;
            Node prev = null;
            Node slow = head;
            Node fast = head;
            Node mid_right;
            Node mid_left;
            while (true){
                if (fast.next != null)
                    if (fast.next.next != null){
                        temp = slow.next;
                        slow.next = prev;
                        prev = slow;
                        slow = temp;
                        fast = fast.next.next;
                    }
                    else
                        return false;
                }
            
                 
            if (fast.next == null)
                mid_left = prev; // Odd no of nodes
            else
                mid_left = slow; // Even no of nodes
            mid_right = slow.next;
            while (mid_left != null){
                if (mid_left.data != mid_right.data){
                    return false;
                }
                mid_left = mid_left.next;
                mid_right = mid_right.next;
            }
            return true;
        }
    }
    
    public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        //list.append(new Node(3));
        list.append(new Node(2));
        list.append(new Node(1));
        System.out.println(list.isPalindrome());
    }
}