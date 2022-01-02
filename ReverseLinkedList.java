import java.io.*;
import java.util.*;

class ReverseLinkedList{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Iterative Approach
    public void reverseIterate(){

        //Base case
        if(head == null || head.next == null ){
            return;
        }


         Node prevNode = head;
         Node currNode = head.next; 
         while(currNode != null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;


             // update 
             prevNode = currNode;
             currNode = nextNode;
         }

         head.next = null;
         head = prevNode;

    }

    //Recursive Approach
    public Node reverseRecursive(Node head) {
       
        //Base case
        if( head == null || head.next == null ){
            return head;
        }

       Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;

        return newHead;
    }


    public static void main(String[] args){
      
        ReverseLinkedList list = new ReverseLinkedList();
        list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
    }
}