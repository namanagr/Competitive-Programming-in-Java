/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program finds the n/kth node in the LinkedList, where n-> #nodes in the list and k-> integer provided by the user

/**
 *
 * @author Naman Agrawal
 */
public class p47_find_nbykth_element {
    static void nbykth(LinkedList list, int k){
        Node temp = list.head;
        Node modular_node = null;
        int index = 1; // To track the position of the node.
        int n = 0;
        boolean flag = false;
        while (temp != null){ //Count the number of nodes in the linkedlist
            n++;
            temp = temp.next;
        }
        temp = list.head; // Reset the temp node to point to the head of the linked list
        while (temp != null){
            if (index == n/k){
                flag = true;
                break;
            }
            index++;
            temp = temp.next;
        }
        if (flag == true)
            System.out.print("The detected node is " + temp.data);
        else
            System.out.print("No such node found");
    }
    
    public static void main(String[] args){
       LinkedList list = new LinkedList();
       list.append(new Node(1));
       list.append(new Node(2));
       list.append(new Node(3));
       list.append(new Node(4));
       list.append(new Node(5));
       list.append(new Node(6));
       list.append(new Node(7));
       list.append(new Node(8));
       nbykth(list,4);
    }
}
