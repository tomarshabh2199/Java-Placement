import java.io.*;
import java.util.*;

class StackCollection{


    //1. Push at the bottom of the Stack
    public static void pushAtBottom(int data, Stack<Integer> s){
        //Base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // 2. Reverse a stack
    public static void reverse(Stack<Integer> s){

        //Base Case
        if(s.isEmpty()){
            return;
        }

        int top= s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        pushAtBottom(data, s);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}