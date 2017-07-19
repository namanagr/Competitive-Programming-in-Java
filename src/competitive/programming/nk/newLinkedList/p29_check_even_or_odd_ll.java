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
public class p29_check_even_or_odd_ll {
    public static class LL extends LinkedList {
        boolean isEven() {
            if (head == null)
                return true;
            Node temp = head;
            while (temp != null){
                temp = temp.next;
                if (temp == null)
                    return false;
                temp = temp.next;
            }
            return true;
        }
    }
    
    public static void main (String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        //list.append(new Node(5));
        System.out.println(list.isEven());
    }
}
