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


    public static void main(String[] args){

        LinkedList LL = new LinkedList();
        LL.addFirst("a");
        LL.addFirst("is");

        LL.printList();

        LL.addLast("the");
        LL.printList();

        LL.addFirst("hello");
        LL.printList();

    }
}