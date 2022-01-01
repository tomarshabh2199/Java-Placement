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

// 2. Count total paths in a maze to move from (0,0) to (n,m)
// n=3, m=3 n*m (0,0) (2,2)
// right and downward move only
// total paths=6

public static int totalPaths(int i, int j, int n, int m) {

    //Base case

    if(i == n && j == m){
        return 0;
    }

    if(i== n-1 && j== m-1) return{
        return 1;
    }
    //move downwards
    int downPaths = totalPaths(i+1, j, n, m);

    //move right
    int rightPaths = totalPaths(i, j+1, n, m);

    return downPaths + rightPaths;
}

// 3. Place Tiles of size 1*m in a floor of size n*m 
// such that no two tiles overlap
// horizaontally place tiles and vertically place tiles
// n=4, m=2 

public static int placeTiles(int n, int m){
    
      //Base case
    if(n == m)
    {
        return 2;
    }

    if(n < m)
    {
        return 1;
    }

    //vertcally place tiles
    int verticalPlacements = placeTiles(n-m , m);

    //horizontally place tiles
    int horizontalPlacements = placeTiles(n-1, m);

    return verticalPlacements + horizontalPlacements;

}


    public static void main(String[] args){

        String str = "abc";
        printPermutation(str, ""); //TC-O(n!)

        int n=3, m=3;
        System.out.println(totalPaths(0,0,n,m)); //TC-O(n*m)

        int n=3, m=3;
        System.out.println(placeTiles(n,m)); //TC-O(n*m)

    }
}