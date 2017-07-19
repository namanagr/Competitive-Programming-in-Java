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
public class test {
    public static void main (String[] main){
        CLinkedList list = new CLinkedList();
        list.append(new Node(1));
        list.append(new Node(2));
        list.append(new Node(3));
        list.append(new Node(4));
        list.append(new Node(5));
        list.push(new Node(0));
        //list.insert(new Node(10), 3);
        System.out.println("After insert opn at pos 3.");
        list.printll();
        //list.del_pos(3);
        list.pop();
        list.del();
        System.out.println("After delete opn at pos 3 and then removing the first and last node.");
        list.printll();
        
    }
}
