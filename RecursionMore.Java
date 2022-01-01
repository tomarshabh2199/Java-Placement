import java.util.*;
import java.io.*;

class RecursionMore{

//1.Tower of Hanoi
public static void towerOfHanoi(int n, String src, String helper, String dest) {

    //Base Case
    if(n==1){
        System.out.println("Move disk 1 from " + src + " to " + dest);
        return;
    }

    towerOfHanoi(n-1 ,src, dest, helper);
    System.out.println("transfer disk"+ n + "from" + src + "to" + dest);
    towerOfHanoi(n-1, helper, src, dest);

}

 //2. Print a String in reverse order
 // "abcd"->"dcba"
public static void reverseString(String str, int idx){
     //Base case 
    if(idx==0){
        System.out.println(str.charAt(idx));
        return;
    }

    System.out.print(str.charAt(idx));
    reveraeString(str, idx-1);
}

//3. Find the 1st and last occurence of a character in a string
//"abaacdaefaah"->"a" idx:0, idx:10

public static int first=-1;
public static int last=-1;

public static void firstandlastOccurence(String str, int idx, char element)
{

    //Base case
    if(str.length() == idx){
        System.out.println(first);
        System.out.println(last);
        return;
    }

    char currChar=str.charAt(idx);
    if(currChar==element){
        if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }
    }
    firstandlastOccurence(str, idx+1, element);
}


public static void main(string[] args){
        int n=3; //number of disks
        towerOfHanoi(n,"S","H","D"); //TC-O(2^n-1)


        String str="abcd";  //Reverse a String
        reveraeString(str, str.length-1);  //TC-O(n)

        String str="abaacdaefaah";
        firstandlastOccurence(str, 0, 'a'); //TC-O(n)

    }
}