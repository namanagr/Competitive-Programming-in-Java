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
public class p35_clist_split {
    
    public static class CL extends CLinkedList {
        void split(){
            if (head == null || head.next == null){
                System.out.println("Cannot split the circular list");
            }
            else {
                Node slow = head;
                Node fast = head;
                while (fast.next != head && fast.next.next != head){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                Node l2 = slow.next;
                slow.next = null;
                Node l1 = head;
                System.out.println("Printing the first list..");
                Node temp = l1;
                while (temp != null){
                    System.out.println(temp.val);
                    temp = temp.next;
                }
                temp = l2;
                System.out.println("Printing the second list..");
                while (temp != head){
                    System.out.println(temp.val);
                    temp = temp.next;
                }
            }
        }
    }
    
    public static void main(String[] args){
        CL clist = new CL();
        clist.append(new Node(1));
        clist.append(new Node(2));
        clist.append(new Node(3));
        clist.append(new Node(4));
        //clist.append(new Node(5));
        clist.split();
    }    
  
}
