/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nk.LinkedList;

import competitive.programming.nk.LinkedList.*;

/**
 *
 * @author Lenovo
 */
public class CLinkedList {
    
    Node head;
    
    CLinkedList(){
        head = null;
    }
    
    void push(Node node){
        // Pushes a node at the beginning of the CList. 
        if (head == null){
            head = node;
            head.next = head;
        }
        else {
            node.next = head;
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            head = node;
        }
    }
    
    void append(Node node){
        // Pushed a node at the end of the CList. 
        if (head == null){
            head = node;
            head.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
        }
    }
    
    Node pop(){
        // Pops a node from the beginning of the CList and returns it.
        if (head == null){
            System.out.println("Nothing to pop.");
            return null;
        }
        else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = head.next;
            temp = head;
            head = head.next;
            return temp;
        }
    }
    
    Node del_end(){
        // Deletes a node from the end of the CList and returns it.
        if (head == null){
            System.out.println("Nothing to delete");
            return null;
        }
        else {
            Node temp = head;
            Node prev = null;
            while (temp.next != head){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            return temp;
           }
    }
    
    void printll(){
        // Prints all elements of the CList
        if (head == null)
            System.out.println("Empty CList. Nothing to print.");
        else {
            Node temp = head;
            System.out.println("Printing all the elements of the CList..");
            System.out.println(temp.data);
            temp = temp.next;
            while (temp != head){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    
    void insert_pos(Node node, int pos){
        if (head == null){
            if (pos != 0){
                System.out.println("Invalid position.");
                return;
            }
            else
                head = node;
        }
        else {
            int index = 0;
            Node temp = head;
            while (index < pos-1){
                if (temp != null){
                    temp = temp.next;
                    index++;
                }
                else {
                    System.out.println("Invalid position.");
                    return;
                }                    
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    Node del_pos(int pos){
        if (head == null){
            System.out.println("Empty CList. Nothing to delete.");
            return null;
        }
        else {
            Node temp = head;
            Node prev = null;
            int index = 0;
            while (index < pos){
                if (temp == null){
                    System.out.println("Invalid position.");
                    return null;
                }
                else {
                    prev = temp;
                    temp = temp.next;
                    index++;
                }
            }
            prev.next = temp.next;
            return temp;
        }
    }
    
}
