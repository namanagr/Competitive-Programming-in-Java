package competitive.programming.nk.LinkedList;

// This program splits a circular LinkedList into two equal LinkedLists. 
// If the no of elements is odd, the first list after split should contain one more element. 

/**
 *
 * @author Naman Agrawal
 */
public class p35_split_clist_two_parts {
    
    static void print_list(Node list){
        if (list == null){
            System.out.println("Nothing to print.");
        }
        else {
            System.out.println("Printing the list elements..");
            while (list != null){
                System.out.println(list.data);
                list = list.next;
            }
            System.out.println("Done printing the elements..");
        }
    }
    
    static void clist_split(Node head){
        if (head == null){
        }
        Node slow = head;
        Node fast = head;
        Node list1 = head;
        
        while (fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node list2 = slow.next;
        slow.next = null; //Mark the end of list1
        
        //Traverse till the end of list2 and break the cycle
        Node temp = list2;
        while (temp.next != head)
            temp = temp.next;
        temp.next = null; //breaking the cycle
 
        //Printing the elements of split list1 and list2
        print_list(list1);
        print_list(list2);
    }
    
    public static void main(String[] args){
        CLinkedList clist = new CLinkedList();
        clist.append(new Node(1));
        clist.append(new Node(2));
        clist.append(new Node(3));
        clist.append(new Node(4));
        //clist.append(new Node(5));
        clist_split(clist.head);
        
    }
}
