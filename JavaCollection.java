import java.util.*:
import java.io.*;

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

        
}