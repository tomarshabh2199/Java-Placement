import java.util.*;
import java.io.*;


class LinkedList{

    Node head;
    
    class Node{
        String data;
        Node next;

        Node(data){
            this.data = data;
            this.next = null;
        }
    }

   //Add -First and Add Last
    public void addFirst(String data)
    {
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        // If head is not null 
        // Already linkedlist avialble
        newNode.next = head;
        head = newNode;
    }

    //Add last
    public void addLast(String data){

        //check head is null
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        //Create a new node for tranversing the linked list
        //jab tak last me null na mil jaye traverse krte hai
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    

    //Print List
    public void printList(){
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    //Delete first
    public void deleteFirst(){
        
        //Base case
        if(head == null){
            System.out.println("The List is empty");
            return;
        }

        head=head.next;
    }

    // Delete last
    public void deleteLast(){

        if(head == null){
            System.out.println("The List is empty");
            return;
        }

        //if only sigle node is available
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode= null
        while(lastNode.next != null){ //null.next  =null throw error so we design another base case
            lastNode= lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args){

        LinkedList LL = new LinkedList();
        LL.addFirst("a");
        LL.addFirst("is");

        LL.printList();

        LL.addLast("the");
        LL.printList();

        LL.addFirst("hello");
        LL.printList();

        LL.deleteFirst();
        LL.printList();

        LL.deleteLast();
        LL.printList();

    }
}