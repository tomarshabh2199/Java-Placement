import java.io.*;
import java.util.*;

class AdvancedRecursion{


// 1. Print all permuations of a string
// "abc"->"abc", "acb", "bac", "bca", "cab", "cba" (all possible combination of letters)
// "abcd"->"abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca", "cabd", "cadb", "cbad", "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba"

public static void printPermutation(String str, String permutation)
{
    //Base case
    if(str.length() == 0){
        System.out.println(permutation);
        return;
    }

    for(int i=0; i<str.length(); i++){
        char currentChar = str.charAt(i);

        //"abc"->"ab"
        String newStr = str.substring(0,i) + str.substring(i+1);
        printPermutation(newStr, permutation + currentChar);

    }
}


    public static void main(String[] args){

        String str = "abc";
        printPermutation(str, ""); //TC-O(n!)

    }
}