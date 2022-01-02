import java.io.*;
import java.util.*;

class MoreWithLinkedList{

     Node head;

     //Node class
     class Node{
         int data;
         Node next;

         Node(int data){
             this.data = data;
             this.next = null;
         }
     }

   // 1. find the nth node from last + delete nth node
   // delete the nth node from linkedlist and return the head of linkedlist
   public Node removeNthFromEnd(Node head, int n)
   {
       //Base case only 1 node in the linkedlist
       if(head.next == null){
           return null;
       }

       //find size of linkedlist
       int size = 0;
       Node currNode = head;
       while(currNode != null){
           currNode = currNode.next;
           size++;
       }

       //special case 
       if( n == size ){
              return head.next;
       }

       //find out the previous node
       int indexToSearch = size -n;
       Node prev = head;
       int i = 1;
       while( i < indexToSearch){
           prev = prev.next;
           i++;
       }

       prev.next = prev.next.next;
       return head;

   }

   //2. Plaindrome LinkedList

   public Node reverse(Node head){
    Node prev = null;
    Node curr = head;

    while( curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next; 
    }
     return prev;
   }

   public Node findMiddle(Node head){
       Node hare = head;
       Node turtle = head;
       while( hare.next != null && hare.next.next != null){
           hare = hare.next.next;
           turtle = turtle.next;
       }
       return turtle;
   }

   public boolean isPalindrome(Node head){
       if ( head == null || head.next == null){
           return true;
       }

      Node middle = findMiddle(head); //1st half ka end
      Node secondHalfStart = reverse(middle.next); //reverse the 2nd half

        Node firstHalfStart = head;
        while(SecondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
                }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }

    public static void main(String[] args){

    }



}