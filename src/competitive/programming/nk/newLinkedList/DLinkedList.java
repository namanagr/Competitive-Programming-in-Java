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
public class DLinkedList {
    DNode head;
    
    DLinkedList(){
        head = null;
    }
    
    void push(DNode node){
        if (head == null){
            head = node;
        }
        else {
            DNode temp = head;
            node.next = temp;
            temp.prev = node;
            head = node;                  
        }
    }
    
    void append(DNode node){
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
    
    void insert(DNode node, int pos){
        if (head == null){
            if (pos == 1){
                head = node;
            }
            else {
                System.out.println("Invalid position");
            }
        }
        else {
            DNode temp = head;
            int index = 0;
            while (index < pos-2){
                if (temp == null){
                    System.out.println("Invalid position.");
                    return;
                }
                else {
                    index++;
                    temp = temp.next;
                }                
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    DNode pop(){
        if (head == null){
            System.out.println("Nothing to pop.");
            return null;
        }
        else {
            DNode temp = head;
            head = head.next;
            return head;
        }
    }
    
    DNode del(){
        if (head == null){
            System.out.println("Nothing to delete");
            return null;
        }
        else {
            DNode temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.prev.next = head;
            head.prev = temp.prev;
            return temp;
        }
    }
    
    DNode del_pos(int pos){
        if (head == null){
            System.out.println("Nothing to delete");
            return null;
        }
        else {
            DNode temp = head;
            int index = 0;
            while (index < pos-2){
                if (temp == null){
                    System.out.println("Invalid position");
                    return null;
                }
                else {
                    index++;
                    temp = temp.next;
                }
            }
            temp.prev = temp.next;
            return temp;
        }
    }
}
