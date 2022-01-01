import java.util.*;
import java.io.*;

class Recursion{


    //print x^n (stack height =logn)
    //x^n = x^(n/2) * x^(n/2) if n is even
    //x^n = x^(n/2) * x^(n/2)  * x if n is odd
    public static int calculatepower(int x, int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n%2==0)
            return power(x,n/2)*power(x,n/2);
        else
            return power(x,n/2)*power(x,n/2)*x;
    }


 //Print x^n (stack height =n)
 //x*x*x*x..... nth times
 //x*x^n-1=x^n
 //x^0=1 //base case
 //x=0=0 //base case
public static int calPower(int x, int n){
    //base case 1
        if(n==0)  
            return 1;

        //base case 2
        else if(x==0)
            return 0;  
        
        else
            return x*calPower(x,n-1);    
}

    //fibonacci sequence till nth term
    public static void fibonacci(int n)
    {
        if(n == 1 || n == 0){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //Factorial of n number
    public static void calFactorial(int n) {

        //Base Case
        if(n==1 || n==0){        
            return 1;
        }
    
        int result=n*calFactorial(n-1) ;
            return result;
    }

    //sum of first n natural number
    public static void printSum(int i, int number, int sum)
    {
        //Base case
        if(i==number){
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        printSum(i+1, number, sum);
    }

    //print num in ascednding order 1>2>3>4>5
    public static void printNum(int num)
    {
        if(num == 6)
        {
            return;
        }

        System.out.println(num);
        printNum(num+1);
        System.out.println(i);
    }

    //print number in desceding order 5>4>3>2>1
    public static void printNumb(int num){

        //Base Case: number
        if(num==0){
            return;
        }

        System.out.println(num);
        printNumb(num-1);
    }


    public static void main(String[] args)
    {
        int num=5;
        printNumb(num); //num=5

        int n=1;
        printSum(num); //num=1

        printSum(1,5,0); //1+2+3+4+5=15

        int n=6;
        int ans=calFactorial(n);
        System.out.println(ans); //6!=720

        int n=5;
        int ans=fibonacci(n);
        System.out.println(ans);


        int x=2, n=5;
        int ans=calPower(x,n); //2^5=32
        System.out.println(ans);

        int x=2, n=5;
        int ans=calculatepower(x,n); //2^5=32
        System.out.println(ans);
    }
}



