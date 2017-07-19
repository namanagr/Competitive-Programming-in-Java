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
public class DNode<T> {
    T data;
    DNode next;
    DNode prev;

    DNode(T data){
        this.data = data;
        prev = null;
        next = null;
    }
}
