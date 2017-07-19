// This program displays the elements of the Linked List in reverse order. 

package competitive.programming.nk.LinkedList;

/**
 *
 * @author Naman Agrawal
 */
public class p28_display_ll_from_end {
    
    static void display_reverse_list(Node start){
        if (start == null)
            return;
        else {
            display_reverse_list(start.next);
            System.out.println(start.data);
        }
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        display_reverse_list(list.head);
    }
    
}
