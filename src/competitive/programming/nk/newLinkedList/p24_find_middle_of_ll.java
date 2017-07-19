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
public class p24_find_middle_of_ll {
    public static class LL extends LinkedList {
        Node middle(){
            if (head == null)
                return null;
            if (head.next == null)
                return null;
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                //slow = slow.next;
                //fast = fast.next.next;
                slow = slow.next;
                fast = fast.next;
                if (fast.next == null)
                    return slow;
                fast = fast.next;
            }
            return slow;
        }
    }
    
    public static void main (String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        //list.append(new Node(6));
        System.out.println(list.middle().val);
    }
}
