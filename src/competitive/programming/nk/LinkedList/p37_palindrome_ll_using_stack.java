/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program checks if a LinkedList is a palindrome or not. 
// Using stack.

/**
 *
 * @author Naman Agrawal
 */
// http://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/

public class p37_palindrome_ll_using_stack {
    static boolean isPalindrome(Node head){
        if (head == null)
            return false;
        
        // Now, traverse to the middle node of the LinkedList
        Node slow = head;
        Node fast = head;
        Node prev = null;
        Node temp;
        Stack stk1 = new Stack();
        
        while (fast.next != null && fast.next.next != null){
            //System.out.println(slow.data);
            stk1.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        stk1.push(slow.data);
        if (fast.next == null)
            stk1.pop();
        slow = slow.next;
        //stk1.printstack();
        while (slow != null){
            if (slow.data != stk1.pop().data)
                return false;
            slow = slow.next;
        }
        return true;     
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(3));
        list.append(new Node(2));
        list.append(new Node(1));
        System.out.println(isPalindrome(list.head));
        
    }
    
}
