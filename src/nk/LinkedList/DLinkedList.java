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
public class DLinkedList {
    
    DNode head;
    
    DLinkedList(){
        head = null;
    }
    
    void push(DNode node){
        //Adds a node at the beginning of the DLL.
        if (head == null){
            head = node;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    
    void append(DNode node){
        // Add a node at the end of the DLL.
        if (head == null){
            head = node;
        }
        else {
            DNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }
    
    void printll(){
        // Prints all the elements of the Doubly Linked List
        if (head == null)
            System.out.println("Empty DL list.");
        else {
            DNode temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("Done printing all the elements.");
        }
    }
    
    void insert_pos(DNode node, int pos){
        // Inserts a node at the specified position starting from 0
        if (head == null){
            if (pos != 0){
                System.out.println("Invalid position");
            }
            else {
                head = node;
            }
        }
        else {
            int index = 0;
            DNode temp = head;
            while (index < pos-1){
                if (temp == null){
                    System.out.println("Invalid position");
                    return;
                }
                else {
                    temp = temp.next;
                    index++;
                }
            }
            node.next = temp;
            node.prev = temp.prev;
            temp.prev.next = node;
            temp.prev = node;
        }
        
    }
    
    DNode pop(){
        //Deletes a node from the start of the DLL and returns the node
        if (head == null){
            System.out.println("Empty DL list. Nothing to pop.");
            return null;
        }
        else {
            DNode temp = head;
            head = head.next;
            head.prev = null;
            return temp;
        }
    }
    
    DNode del(){
        //Deletes a node from the end of the DLL and returns the node
        if (head == null){
            System.out.println("Empty DLL. Nothing to delete");
            return null;
        }
        else {
            DNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
            return temp;
        }
    }
    
    DNode delete_pos(int pos){
        //Deletes a node from a specified position and returns the node
        if (head == null){
            System.out.println("Invalid position");
            return null;
        }
        else {
            int index = 0;
            DNode temp = head;
            while (index < pos){
                if (temp == null){
                    System.out.println("Invalid position");
                    return null;
                }
                else {
                    temp = temp.next;
                    index++;
                }
                
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            return temp;
        }
    }
}
