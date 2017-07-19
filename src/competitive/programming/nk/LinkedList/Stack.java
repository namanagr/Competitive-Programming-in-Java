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
public class Stack {
    
    Node head;
    
    Stack(){
        head = null;
    }
    
    void push(int item){
        Node node = new Node(item);
        if (head == null){
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }
    
    Node pop(){
        if (head == null){
            System.out.println("Empty stack. Nothing to pop.");
            return null;
        }
        else {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    
    Node peek(){
        if (head == null){
            System.out.println("Empty stack. Nothing to peek.");
            return null;
        }
        else
            return head;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void printstack(){
        if (head == null){
            System.out.println("Empty stack. Nothing to print.");
        }
        else {
            Node temp = head;
            System.out.println("Printing all the elements.");
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("Done with printing.");
        }
    }
    
    public static class timepass {
        public static void main(String[] args){
            p1_stack_using_ll stack = new p1_stack_using_ll();
            stack.push(new Node(1));
            stack.push(new Node(2));
            stack.push(new Node(3));
            stack.push(new Node(4));
            stack.printstack();
            System.out.println(stack.peek().data);
            System.out.println(stack.pop().data);
            
        }
    }
    
}
