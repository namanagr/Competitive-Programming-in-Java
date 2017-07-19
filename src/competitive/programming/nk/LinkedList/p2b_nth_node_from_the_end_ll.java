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
public class p2b_nth_node_from_the_end_ll {
    public static class LL extends LinkedList {
        Node nthfromend(int n){
            if (head == null){
                System.out.println("Empty list. Invalid request.");
                return null; 
            }
            else {
                Node start = new Node(9627); //trick - to make the list one node behind
                start.next = head;
                Node slow = start; 
                Node fast = start;
                
                //The follwoing section is a different way of implementing the same stuff as in version 1 of the code.
                while (fast.next != null){
                    if (n <= 0)
                        slow = slow.next;
                    else
                        n--;
                    fast = fast.next;
                }
                Node temp = slow.next;
                slow.next = slow.next.next;
                return temp;
            }
            
        }
       
        public static class test{
        public static void main(String[] args){
            LL ll = new LL();
            ll.append(new Node(1));
            ll.append(new Node(2));
            ll.append(new Node(3));
            ll.append(new Node(4));
            ll.append(new Node(5));
            ll.printll();
            System.out.println(ll.nthfromend(3).data);
        }
    }
    
    }


}


