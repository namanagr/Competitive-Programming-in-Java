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
public class LinkedList {
    Node head;
    
    LinkedList (){
        head = null;
    }
    
    void push(Node node){ // Adds a node at the start of the Linked List
        if (head == null)
            head = node;
        else {
            node.next = head;
            head = node;
        }
    }
    
    void append(Node node){ // Adds a node at the end of the Linked List
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    
    void insert(Node node, int pos){ // Insert a node at a specified position
        if (head == null) {
            if (pos != 1)
                System.out.println("Invalid position");
            else
                head = node;
        }
        else {
            Node temp = head;
            int index = 0;
            while (index < pos-2){
                if (temp != null) {
                    index++;
                    temp = temp.next;
                }
                else {
                    System.out.println("Invalid position.");
                    break;
                }
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    Node del() { // Deletes and returns the node from the end of the LinkedList
        if (head == null){
            System.out.println("Empty list");
            return null;
        }
        else {
            Node temp = head;
            while (temp.next.next != null){ 
                temp = temp.next;
            }
            Node temp2 = temp.next;
            temp.next = null;
            return temp2;
        }
    }
    
    Node pop() { // Deletes and returns the first node of the Linked List
        if (head == null){
            System.out.println("Empty list");
            return null;
        }
        else {
            Node temp = head;
            head = temp.next;
            return temp;
        }
    }
    
    Node del_pos(int pos) { // Deletes a node from the specified position
        if (head == null){
            System.out.println("Empty List");
            return null;
        }
        else {
            int index = 0;
            Node temp = head;
            while (index < pos-2){
                if (temp != null){
                    index++;
                    temp = temp.next;
                }
                else {
                    System.out.println("Invalid position");
                    return null;
                }
            }
            Node temp2 = temp.next;
            temp.next = temp.next.next;
            return temp2;
        }
    }
    
    void printll(){ // Prints all the elements of the Linked List
        if (head == null){
            System.out.println("Empty List..");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }
}
