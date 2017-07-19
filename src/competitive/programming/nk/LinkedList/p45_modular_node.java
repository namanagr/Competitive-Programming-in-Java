/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

// This program finds the last node from the beginning that satisfies n%k == 0 where n-> #nodes currently encountered, k-> integer specified by the user

/**
 *
 * @author Naman Agrawal
 */
public class p45_modular_node {
   static void modular_node(LinkedList list, int k){
       if (list.head == null){
           System.out.println("Empty list. Nothing to process");
       }
       else {
           Node temp = list.head;
           Node modular_node = null;
           int index = 1;
           while (temp != null){
               if (index%k == 0)
                   modular_node = temp;
               index++;
               temp = temp.next;
           }
           System.out.println(modular_node.data);
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
       modular_node(list,3);
   }
}
