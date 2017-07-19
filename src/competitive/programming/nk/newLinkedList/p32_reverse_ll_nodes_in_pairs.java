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
public class p32_reverse_ll_nodes_in_pairs {
    
    public static class LL extends LinkedList {
        void pairwise_reverse(){
            if (head == null || head.next == null){
            }
            else {
                Node temp = head;
                while (temp != null && temp.next != null){
                    int tmp = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = tmp;
                    temp = temp.next.next;
                }
            }
                
        }
    } 
        
    public static void main(String[] args){
        LL list = new LL();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        list.pairwise_reverse();
        list.printll();
    }
}
