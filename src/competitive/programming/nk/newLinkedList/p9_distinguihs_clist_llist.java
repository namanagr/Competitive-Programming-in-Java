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
public class p9_distinguihs_clist_llist {
    
    static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return true;
    }  
    
    static Node StatingNodeOfLoop(Node head) {
        if (head == null)
            return null;
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag = true;
                break;
            }
        }
        if (flag == true){
            slow = head;
            while (fast != slow){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    } 
    
    static int lengthOfLoop(Node head){
        if (head == null)
            return 0;
        Node slow = head;
        Node fast = head;
        int length = 0;
        boolean flag = false;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag = true;
                break;
            }        
        }
        if (flag == true){
            length = 1;
            while (fast.next != slow){
                fast = fast.next;
                length++;
            }
        }
        return length;
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
        System.out.println(hasLoop(clist.head)); // prints false
        System.out.println(StatingNodeOfLoop(list.head).val); // prints true
        System.out.println(lengthOfLoop(list.head));
        // 10- 4- 15- 20- 50
    }
    
}
