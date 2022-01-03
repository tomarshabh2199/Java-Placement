import java.util.*;
import java.io.*;

class ArrayListImplemenationStack{

  static class Stack{
        ArrayList<Integer> list =new ArrayList<>();

        public static boolean isEmpty(){
         return  list.size()==0
        }

        // push opeartion
        public static void push(int data){
            list.add(data);
        }

        // pop opeartion
        public static int pop(){

            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            //list ka last index pop out hoga
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek opeartion
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
        }
    }

public static void main(String[] args){
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }

    }
}