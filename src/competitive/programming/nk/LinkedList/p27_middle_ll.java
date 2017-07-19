// This program finds the middle element of the linked list using two pointers.

package competitive.programming.nk.LinkedList;

/**
 *
 * @author Naman Agrawal
 */
public class p27_middle_ll {
    static Node middle_node(LinkedList list){
        if (list.head == null)
            return null;
        Node slow = list.head;
        Node fast = list.head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null)
                return slow;
            else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        Node middle = middle_node(list);
        System.out.println("Middle element is " + middle.data);
    }

}
