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
public class p16_reverse_singly_ll {
    
    public static class LL extends LinkedList {
        
        void reverse(){
            if (head == null || head.next == null) {}
            else {
                Node temp = head;
                Node prev = null;
                Node temp2;
                while (temp != null){
                    temp2 = temp.next;
                    temp.next = prev;
                    prev = temp;
                    temp = temp2;
                }
                head = prev;
            }
        }
    }
    
    public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        list.reverse();
        list.printll();
    }
}
