package competitive.programming.nk.LinkedList;

// This program reverses the linked list elements pairwise
//1->2->3->4
//2->1->4->3

/**
 *
 * @author Naman Agrawal
 */

public class p32_reverse_ll_pairwise {
    public static class LL extends LinkedList {
        void pairwise_reverse(){
            if (head == null || head.next == null) {
            }
            Node temp = head;
            while (temp != null && temp.next != null){
                // Swap the elements of the pair
                int tmp = temp.data;
                temp.data = temp.next.data;
                temp.next.data = tmp;
                temp = temp.next.next;
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
        list.pairwise_reverse();
        list.printll();
    }
    
}
