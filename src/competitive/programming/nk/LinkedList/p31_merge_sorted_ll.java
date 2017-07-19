package competitive.programming.nk.LinkedList;

// This program merges two sorted linked lists into a third list.

/**
 *
 * @author Naman Agrawal
 */
public class p31_merge_sorted_ll {
    
    public static LinkedList merge(LinkedList l1, LinkedList l2){
        if (l1.head == null)
            return l2;
        if (l2.head == null)
            return l1;
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        LinkedList l3 = new LinkedList();
        while (temp1 != null || temp2 != null){
            if (temp1 != null && temp2 != null){
                if (temp1.data > temp2.data){
                    l3.append(new Node(temp2.data));
                    temp2 = temp2.next;
                }
                else {
                    l3.append(new Node(temp1.data));
                    temp1 = temp1.next;
                }
            }
            else if (temp1 == null){
                l3.append(new Node(temp2.data));
                temp2 = temp2.next;
            }
            else {
                l3.append(new Node(temp1.data));
                temp1 = temp1.next;
            }
        }
        return l3;
    }
    
    public static void main(String[] args){
        
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        
        l2.append(new Node(10));
        l2.append(new Node(20));
        l2.append(new Node(30));
        l2.append(new Node(40));
        
        l1.append(new Node(5));
        l1.append(new Node(15));
        l1.append(new Node(25));
        l1.append(new Node(35));
        
        LinkedList l4;
        l4 = merge(l1, l2);
        l4.printll();
    }
    
}
