import java.util.*;
import java.io.*;
import java.util.HashSet.*;

class RecursionMore{

//1.Tower of Hanoi

public static void towerOfHanoi(int n, String src, String helper, String dest) {

    //Base Case
    if(n == 1){
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
    if(idx == 0){
        System.out.println(str.charAt(idx));
        return;
    }

    System.out.print(str.charAt(idx));
    reveraeString(str, idx-1);
}

//3.Find the 1st and last occurence of a character in a string
//"abaacdaefaah"->"a" idx:0, idx:10

public static int firs = -1;
public static int last = -1;

public static void firstandlastOccurence(String str, int idx, char element)
{

    //Base case
    if(str.length() == idx){
        System.out.println(first);
        System.out.println(last);
        return;
    }

    char currChar = str.charAt(idx);
    if(currChar == element){
        if(first == -1){
            first = idx;
        }
        else{
            last=idx;
        }
    }
    firstandlastOccurence(str, idx+1, element);
}

//4. Check if an array is sorted (Strictly Incresing)
//{1,2,3,4,5}->true
//{1,2,3,4,4}->false

public static boolean isSorted(int[] arr, int idx){

    //Base case
    if(arr.length-1 == idx){
        return true;
    }

    if(arr[idx] < arr[idx+1]){
    //array is sorted till now
        return isSorted(arr,idx+1);
    }

    else{
        return true;
    }

}

//5. Move all 'x' to the end of the String
//"abxcdex"->"abcdexx"

public static void moveAllX(String str, int idx, int count, String newString){

    //Base case
    if(idx==str.length()){
        for(int i=0; i<count; i++){
            newString = newString + 'x';
        }
        System.out.println(newString);
        return;
    }

    char currentChar=str.charAt(idx);
    if(currentChar == 'x'){
        count++;
        moveAllX(str, idx+1, count, newString);
    }

    else{
        newString += currentChar;
        moveAllX(str, idx+1, count, newString);
    }
}


//6. Remove Duplicates in a String
//"abbccda"->"abcd"

public static boolean[] map=new boolean[26];

public static void removeDuplicate(String str, int idx, String newString) {
    
    //Base case:
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }
    
    char currentChar = str.charAt(idx);
    if(map[currentChar-'a']){
        removeDuplicate(str, idx+1, newString);
    }

    else{
        newString += currentChar;
        map[currentChar-'a'] = true;
        removeDuplicate(str, idx+1, newString);
    }
}

// 7.Print all the Subsequences of string
// "abc"->"a","b","c","ab","ac","bc","abc"

public static void subSequence(String str, int idx, String newString){

    //Base case
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }

    char currentChar=str.charAt(idx);

    //to be 
    subSequence(str, idx+1, newString+currentChar);

    // not to be 
    subsequence(str, idx+1, newString);

}

// 8. Print All Unique Subsequences
// "aaa"->"a","aa","aaa"
// use HashSet 

public static void uniqueSubSequences(String str, int idx, String newString, HashSet<String> set){
    
    //Base Case
    if(idx == str.length()){
        if(set.contains(newString)){
            return;
        }

        else{
                System.out.println(newString);
                set.add(newString);
                return;
        }

    }

    char currentChar=str.charAt(idx);

    //to be 
    uniqueSubSequences(str, idx+1, newString+currentChar, set);

    // not to be 
    uniqueSubSequences(str, idx+1, newString, set);
}

//9. Print keypad Combinations
//"23"->"ad","ae","af","bd","be","bf","cd","ce","cf"
//0->.
//1->abc
//2->def
//3->ghi
//4->jkl
//5->mno
//6->pqrs
//7->tuv
//8->wxyz
//9->

public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

public static void printCombination(String str, int idx, String combination)
{
    //Base case
    if(idx == str.length())
    {
        System.out.println(combination);
        return;
    }
    
    char currentChar = str.charAt(idx);
    String mapping = keypad[currentChar-'0'];

    for(int i=0; i<mapping.length(); i++)
    {
        printCombination(str, idx+1, combination+mapping.charAt(i));
    }
}

//Main Method

public static void main(string[] args){
        int n=3; //number of disks
        towerOfHanoi(n,"S","H","D"); //TC-O(2^n-1)


        String str="abcd";  //Reverse a String
        reverseString(str, str.length-1);  //TC-O(n)

        String str="abaacdaefaah";
        firstandlastOccurence(str, 0, 'a'); //TC-O(n)

        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr,0)); //TC-O(n)

        String str="abxcdex";
        moveAllX(str, 0, 0, ""); //TC-O(n)

        String str="abbccda";
        removeDuplicate(str, 0, ""); //TC-O(n)

        String str="abc";
        subSequence(str, 0, ""); //TC-O(n^2)

        HashSet<String>set=new HashSet<>();
        uniqueSubSequences(str, 0, "", set);

        String str="23";
        printCombination(str, 0, ""); //TC-O(n!)
    }
}