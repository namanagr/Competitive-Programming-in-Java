/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

/**
 *
 * @author Lenovo
 */
public class p14_length_of_detected_loop {
    static boolean is_ll_or_cl(Node head){
        if (head == null)
            return true; // true denotes the list to be a linked list
        else {
            Node slow = head;
            Node fast = head;
            while (slow != null && fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    int n = 0;
                    while (true){
                        fast = fast.next;
                        if (fast == slow)
                            break;
                        n++;
                    }
                    System.out.println("Loop detected of length " + n);
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void main(String[] args){
        CLinkedList clist = new CLinkedList();
        LinkedList list = new LinkedList();
        list.append(new Node(10));
        list.append(new Node(4));
        list.append(new Node(15));
        list.append(new Node(20));
        list.append(new Node(50));
        list.head.next.next.next.next.next = list.head.next.next; //To create a loop in the linked list
        clist.append(new Node(1));
        System.out.println(is_ll_or_cl(clist.head)); // prints false
        System.out.println(is_ll_or_cl(list.head)); // prints true
    }
    
}
