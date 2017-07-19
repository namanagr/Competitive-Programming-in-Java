/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

// Given two lists. {A1,A2,A3,...,An} and {B1,B2,....,Bm}.
// Merge them in the order {A1,B1,A2,B2....,...}

package competitive.programming.nk.LinkedList;

/**
 *
 * @author Naman Agrawal
 */
public class p49_merge_ll_reorder {
    
    static void print_list(Node head){
        if (head == null){
            System.out.println("Empty list. Nothing to print");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    
    static Node merge_reorder(LinkedList list1, LinkedList list2){
        if (list1.head == null && list2.head == null)
            return null;
        else if (list1.head == null)
            return list2.head;
        else if (list2.head == null)
            return list1.head;
        else {
            Node temp1 = list1.head;
            Node temp2 = list2.head;
            Node start = new Node(0);
            Node list3 = start; 
            while (temp1 != null || temp2 != null){
                if (temp1 != null){
                    list3.next = temp1;
                    temp1 = temp1.next;
                    list3 = list3.next;
                }
                else {
                    list3.next = temp2;
                    return start.next;
                }
                if (temp2 != null){
                    list3.next = temp2;
                    temp2 = temp2.next;
                    list3 = list3.next;
                }
                else {
                    list3.next = temp1;
                    return start.next;
                }
            }
            return start.next;
        }
    }
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.append(new Node(1));
        list1.append(new Node(2));
        list1.append(new Node(3));
        list1.append(new Node(4));
        list2.append(new Node(10));
        list2.append(new Node(20));
        //LinkedList l3;
        Node l3 = merge_reorder(list1, list2);
        print_list(l3);
        
    }
}
