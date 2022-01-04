import java.util.*;
import java.io.*;
import java.util.Queue*;
import java.util.LinkedList.*;

class JavaCollection{
    public static void main(String[] args){

        String[] studentName = new String[30];
        studentName[0] = "John";
        studentName[1] = "Mary";
        studentName[30] = "Peter"; //error throw because index

        ArrayList<String> studentName = new ArrayList<>();
        //Initial 10 in size
        //like n - n+ n/2+1
        studentName.add("John");
        studentName.add("Mary");

        //add at specific index
        List<Integer> list= new ArrayList<>();

        //List also implement Linked List and Array List in it.
        //List<Integer> list = new LinkedList<>();

        //add the element at the end of list
        list.add(23);
        list.add(index:0, element:1);
        list.add(1,2);
        list.add(2,3);
        System.out.println(list);

        // create a new new list and add them in the existing List
        List<Integer> list2 = new ArrayList<>();
        list.add(list2);
        System.out.println(list);

        //get the element at index of 0
        System.out.println(list.get(0));
        
        list.remove(index:0);

        //if we want to delete element
        list.remove(Integer.valueOf(1));
        System.out.println(list);      
        
        //remove complete list
        list.clear();
        System.out.println(list);

        //update the value
        list.set(index:2, value:1000);
        System.out.println(list);

        //check return true/false
        list.contains(50);
        System.out.println(list);

        //traverse list
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        foreach(Integer element : list){
            System.out.println(element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);

        stack.peek();
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        //Queue
        Queue<Integer> queue = new LinkedList<>();

        //add element in queue
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue);

        //remove element in queue
        queue.poll();

        //it remove element from the front and also give the remove element in result
        System.out.println(queue.poll());

        //give next top element
        System.out.println(queue.peek());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Priority queue implemet min heap internally
        //can also write like this
       // Queue<Integer> q = new PriorityQueue<>();

       //it work like max heap now
       // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(1);
        pq.poll(1);
        System.out.println(pq);

        System.out.println(pq.peek());

        //Deque
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.offerFirst(2);
        deque.offerLast(3);

        System.out.println(deque);



}