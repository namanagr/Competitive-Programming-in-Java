// This program checks whether the Linked List has even / odd number of elements.

package competitive.programming.nk.LinkedList;

/**
 *
 * @author Naman Agrawal
 */
public class p29_ll_even_odd {
    
    static boolean hasOdd(Node start){
        if (start == null)
            return false;
        while (start != null && start.next != null){
            start = start.next.next;
            if (start == null)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        //list.append(new Node(4));
        System.out.println(hasOdd(list.head));
    }

}


