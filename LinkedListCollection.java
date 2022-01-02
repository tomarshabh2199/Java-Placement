import java.io.*;
import java.util.*;

class LinkedListCollection{

public static void main(String[] args){ 

      LinkedList<String> ll=new LinkedList<String>();
      ll.addFirst("a");
      ll.addFirst("b");
      System.out.println(ll);

      ll.addLast("this");
      ll.addLast("is");
      System.out.println(ll);
      
      System.out.println(ll.size());
      System.out.println(ll.getFirst());

      for(int i=0; i<ll.size(); i++){
          System.out.println(ll.get(i));
      }

      ll.removeFirst();
      System.out.println(ll);

      ll.removeLast();
      System.out.println(ll);

      ll.remove(3); //remove at index value
      System.out.println(ll);

    }
}