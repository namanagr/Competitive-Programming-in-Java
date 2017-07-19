/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.nk.LinkedList;

/**
 *
 * @author Lenovo
 */
public class p15_insert_node_in_sorted_ll {
    public static class LL extends LinkedList{
        void sorted_add(Node node){
            // Adds a node in a sorted Linked list
            if (head == null)
                head = node;
            else {
                int item = node.data;
                Node temp = head;
                Node prev = null;
                boolean stop = false;
                while (temp != null && stop != true){
                    if (temp.data < item){
                        prev = temp;
                        temp = temp.next;
                    }
                    else
                        stop = true;                    
                }
                if (stop == true){
                    prev.next = node;
                    node.next = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(40));
        list.append(new Node(50));
        list.sorted_add(new Node(10));
        list.printll();
    }
    
}
