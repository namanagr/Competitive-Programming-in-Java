/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program finds the first node from the last that satisfies n%k == 0 where n-> #nodes in the list, k-> integer specified by the user

/**
 *
 * @author Naman Agrawal
 */
public class p46_module_node_from_last {
   static void modular_node(LinkedList list, int k){
       if (list.head == null){
           System.out.println("Empty list. Nothing to process");
       }
       else {
           Node temp = list.head;
           Node modular_node = null;
           int n = 0; // no of elements in the list
           while (temp != null){ // count the number of elements in the list
               n++;
               temp = temp.next;
           }
           temp = list.head; // reset temp to point to the head of the node.
           int index = 1; // index to track the position of the node
           while (temp != null){
               if (n%k == 0)
                   modular_node = temp;
               index++;
               temp = temp.next;
           }
           if (modular_node != null)
               System.out.println(modular_node.data);
           else
               System.out.println("No such node exists.");
       }
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
       modular_node(list,7);
   }
}
