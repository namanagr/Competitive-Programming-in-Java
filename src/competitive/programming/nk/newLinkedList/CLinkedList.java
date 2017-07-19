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
public class CLinkedList {
    
    Node head;
    
    CLinkedList(){
        head = null;
    }
    
    void push(Node node){
        if (head == null){
            head = node;
            node.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
            head = node;
        }
    }
    
    void append(Node node){
        if (head == null){
            head = node;
            node.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
        }
    }
    
    void insert(Node node, int pos){
        if (head == null){
            if (pos == 1){
                head = node;
                node.next = head;
            }
            else {
                System.out.println("Invalid position..");
            }
        }
        else {
            Node temp = head;
            int index = 0;
            while (index < pos - 2){
                if (temp != null){
                    index++;
                    temp = temp.next;
                }       
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    void printll(){
        if (head == null){
            System.out.println("Empty List");
        }
        else {
            Node temp = head;
            System.out.println(temp.val);
            temp = temp.next;
            while (temp != head){
                System.out.println(temp.val);
                temp = temp.next;
            }
                
        }
    }
    
    Node pop(){
        if (head == null){
            System.out.println("Nothing to pop");
            return null;
        }
        else {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    
    Node del(){
        if (head == null){
            System.out.println("Nothing to pop");
            return null;
        }
        else {
            Node temp = head;
            Node prev = null;
            while (temp.next != head){
                prev = temp;
                temp = temp.next;
            }
            prev.next = head;
            return temp;              
        }
    }
    
    Node del_pos(int pos){
        if (head == null){
            System.out.println("Nothing to delete");
            return null;
        }
        else {
            Node temp = head;
            int index = 0;
            Node prev = null;
            while (index < pos-1){
                index++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            return temp;
        }
    }
    
}
