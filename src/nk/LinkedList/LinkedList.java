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

public class LinkedList {
     
    Node head;
    
    LinkedList(){
        head = null;
    }
    
    void append(Node node){
        if (head == null){
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
    void push(Node node){
        if (head == null){
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }
    
    void insert_pos(Node node, int pos){
        if (head == null) {
            if (pos != 0)
                System.out.println("Invalid postion.");
            else
                head = node;
        }
        else {
            Node temp = head;
            int index = 0;
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
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    void delete_pos(int pos){
        if (head == null)
            System.out.println("Invalid postion.");
        else{
            int index = 0;
            Node temp = head;
            Node prev = null;
            while (index < pos){
                if (temp != null){
                    prev = temp;
                    temp = temp.next;
                    index++;
                }
                else {
                    System.out.println("Invalid position.");
                }
            }
            prev.next = temp.next;
        }
    }
    
    void printll(){
        if (head == null){
            System.out.println("Empty Linked List..");
        }
        else {
            Node temp = head;
            System.out.println("Printing the elements of the Linked List..");
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("Done printing all the elements");
        }
    }
    
    Node pop(){
        if (head == null){
            System.out.println("Empty Linked List. Nothing to pop..");
            return null;
        }
        else {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    
    void del(){
        if (head == null){
            System.out.println("Empty linked list. Noting to delete..");
        }
        else {
            Node temp = head;
            Node prev = null;
            while (temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
    }
    
}
