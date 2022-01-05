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

        deque.poll();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);

        //HashSet
        // No duplicates are allowed under this condition

        Set<Integer> hashSet = new HashSet<>();
        //Set<Integer> hashSet2 = new LinkedHashSet<>();
        //jis order me element fill kre hai us order me hi element milenge
        
        
        // 1.Tree-Sort //implement binary search internally
        // Set<Integer> hashSet3 = new TreeSet<>();


        // hashset behind the seen uses equal method
        // generate hash code for each operation
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        //Order can be changed while re run but ensures unique
        //Hash key
        System.out.println(hashSet);

        hashSet.remove(1);
        System.out.println(hashSet);

        hashSet.contains(1);
        System.out.println(hashSet);

        System.out.println(hashSet.isEmpty());

        hashSet.clear();


        //HashMap
        Map<String, Integer> map= new HashMap<>();
        map.put("John", 23);
        map.put("Mary", 24);
        map.put("Peter", 25);
        
        //map also have unique entries 
        // duplicates entries get override

        if(map.containsKey("John")){
            System.out.println(map.get("John"));
        }

        map.putIfAbsent("John", 30);

        System.out.println(map);

        //Map Iteration
        for(Map.Entry<String, Integer> entry : map.entrySet()){ 
            System.out.println(entry.getKey() + " " + entry.getValue());        
            System.out.println(entry);

            for( String key : map.KeySet()){
                System.out.println(key);

            }

            for(Integer value : map.values()){
                System.out.println(value);
            }

            System.out.println(map.containsValue(value));
            map.remove("John");


            //Collection Class in Java
            int[] numbers={1,2,3,4,5,6,7,8,9};
            int index = Arrays.binarySearch(numbers, 3);

            Arrays.sort(numbers);

            Arrays.fill(numbers, 13);

            System.out.println(Collections.min(list));
            System.out.println(Collections.max(list));
            System.out.println(Collections.frequency(list, 2));

            Collections.sort(numbers);

            Collections.sort(numbers, Collections.reverseOrder());
            


        }
}