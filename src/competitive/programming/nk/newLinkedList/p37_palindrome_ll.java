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
public class p37_palindrome_ll {

    public static class LL extends LinkedList {
        boolean isPalindrome(){
            if (head == null || head.next == null)
                return true;
            else {
                Stack stk1 = new Stack();
                Node slow = head;
                Node fast = head;
                while (fast.next != null && fast.next.next != null){
                    stk1.push(slow);
                    slow = slow.next;
                    fast = fast.next.next;
                }
                // if fast.next == null => odd no of elements. => palindrome contains a middle value. 
                if (fast.next == null){ // odd elements
                    
                }
                    
            }
        }
    }
    
}
