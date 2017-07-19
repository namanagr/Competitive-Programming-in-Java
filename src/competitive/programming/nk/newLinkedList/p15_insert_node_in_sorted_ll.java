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
public class p15_insert_node_in_sorted_ll {
    
    public static class LL extends LinkedList {
        
        void sortedInsert(Node node){
            if (head == null){
                head = node;
            }
            else {
                Node temp = head;
                Node prev = null;
                while (temp != null){
                    if (temp.val >= node.val)
                        break;
                    prev = temp;
                    temp = temp.next;
                }
                node.next = temp;
                prev.next = node;
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
        list.sortedInsert(new Node(10));
        list.printll();
    }
}
