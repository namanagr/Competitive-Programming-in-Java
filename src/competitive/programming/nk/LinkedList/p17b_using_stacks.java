/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//http://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/

package competitive.programming.nk.LinkedList;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class p17b_using_stacks {
    public static class ll_intersection{
        
        void print_nodelist(Node start){
            if (start == null){
                System.out.println("Nothing to print.");
            }
            else {
                System.out.println("Starting to print..");
                while (start != null){
                    System.out.println(start.data);
                    start = start.next;
                }
                System.out.println("Done with printing..");
            }
        }
        
        Node intersecting_node(Node list1, Node list2){
            if (list1 == null || list2 == null)
                return null;
            Stack stk1 = new Stack();
            Stack stk2 = new Stack();
            
            // Pushing the list1 nodes onto stack1
            while (list1 != null){
                stk1.push(list1);
                list1 = list1.next;
            }
            
            // Pushing the list2 nodes onto stack2
            while (list2 != null){
                stk2.push(list2);
                list2 = list2.next;
            }
            
            //stk1.printstack();
            //stk2.printstack();
            
            Node temp = null;
            System.out.println("stk1 empty - "+!stk1.isEmpty());
            System.out.println("stk2 empty - "+!stk1.isEmpty());
            //System.out.println("stk1 = "+stk1.peek().data);
            //System.out.println("stk2 = "+stk2.peek().data);
            while (!stk1.isEmpty() && !stk2.isEmpty() && stk1.peek().data == stk2.peek().data){
                System.out.println("hit");
                temp = stk1.pop();
                stk2.pop();
            }
            return temp;
            
        }
    }
    
    public static void main(String[] args){
        ll_intersection obj = new ll_intersection();
        Node list1 = new Node(1);
        Node list2 = new Node(10);
        list1.next = new Node(2);
        list2.next = list1.next;
        list1.next.next = new Node(3);
        list1.next.next.next = new Node(4);
        
        //obj.print_nodelist(list1); // Printing the nodes of list1
        //obj.print_nodelist(list2); // Printing the nodes of list2
        
        Node intersect_node = obj.intersecting_node(list1, list2);
        if (intersect_node == null)
            System.out.println("No intersecting node.");
        else
            System.out.println("Intersecting node found = ");
    }
    
}
