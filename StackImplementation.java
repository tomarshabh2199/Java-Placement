import java.io.*;
import java.util.*;


class StackImplementation{

    //Stack implementation of linkedlist
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{

        //stack ka top
        public static Node head;

        //isEmpty function
    public static boolean isEmpty(){
        return head == null; // return true and false
       }

        //push opeartion
    public static void push(int data){
 
            Node newNode = new Node(data);
            
            if(isEmpty()){
            head = newNode;
            return;
            }

        newNode.next = head;
        head = newNode;
    }
        
    public static int pop(){

        if( isempty() ){
            System.out.println("Stack is empty");
            return -1;
        }

        int top = head.data;
        head = head.next; //update head after pop for further
        return top;
    }
        
        // Peek Operation
        public static int peek(){
            if( isempty() ){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = head.data;
            return top;
        }

    }

    public static void main(String[]){
        Stack s =new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}