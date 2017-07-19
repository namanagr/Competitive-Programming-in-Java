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
public class p17_ll_intersection_node {
    public static class ll_intersection{
        Node interecting_node(Node list1, Node list2){
            if (list1 == null || list2 == null)
                return null;
            Set collection = new HashSet();
            while (list1 != null){
                collection.add(list1);
                list1 = list1.next;
            }
            while (list2 != null){
                if (collection.contains(list2))
                    return list2;
                list2 = list2.next;
            }
            return null;
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
        Node intersect_node = obj.interecting_node(list1, list2);
        if (intersect_node == null)
            System.out.println("No intersecting node.");
        else
            System.out.println("Intersecting node found = " + intersect_node.data);
    }
    
}
