import java.io.*;
import java.util.*;

//Package create
import bank;

class Shape{
    String color;

    public void area(){
        System.out.println("display area");
    }

}

//inheritance
class Triangle extends Shape{

    //single level inheritance
    public void area(int l, int h){
        System.out.println((l*h)/2);
    }
}

class EquilateralTriangle extends Triangle{
     //Multi- Level Inheritance
    public void area(int l, int h){
        System.out.println((l*h)/2);
    }

}

//Hiearchial Inheritance

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

//Hybrid inheritance

//class Pen{
    //String color;
   // String type; // ballpoint, gel


    // public void write(){
        // System.out.println("Writing something ....");
    // }

    // public void printColor(){
        // System.out.println(this.color);
    // }

// }

// class Student
// {
    // String name;
    // int age;

    //polymorphism implementation
    // public void printInfo(String name){
        // System.out.println(name);
    // }

    // public void printInfo(int age){
        // System.out.println(age);
    // }

    // public void printInfo(String name, int age){
        // System.out.println(name + " " + age);
    // }

   // public void printInfo(){
   //    System.out.println(this.name);
    //    System.out.println(this.age);
   // }

    
    //non parametrized Constructor by default constructor 
    //Student(){
      //System.out.println("constructor called");
    //}

    //parametrized constructor
   // Student(String name, String age){
  //this.name object name
   //this.name = name; //name pass parameter
    //this.age = age;
   // }

    //copy constructor -user defined
   // Student(Student s2){
    //   this.name = s2.name;
   //    this.age = s2.age;
    //}

  // Student() {
//
 //   }

 //Abstract class and abstract method
abstract class Animal {
    abstract void walk()

    //abstact class ka constructor we can make

    Animal() {
        System.out.println(" Create Animal constructor");
    }
        public void eat(){
            System.out.println("eating");
        
    }
}

//Abstarction because we dont allow to show animal class to user to make them abstarct
class Horse extends Animal {

    //Horse Constructor
    Horse() {
        System.out.println(" Create Horse constructor");
    }

    public void walk(){
        System.out.println("walking on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("walking on 2 legs");
    }
}

}


//Interfaces
interface Animal{
    public void walk();

    //not any abstarct method and also no any implementation
    void eat(){

    }
    //we can not make a construtcor of interface
    Animal(){
    }

}

interface Herbivores
{

}

//Mutiple Inheritance
//Interfaces implement hote hai
class Horse implements Animal,Herbivores {
    public void walk(){
        System.out.println("walking on 4 legs");
    }
}

public class OOPS{
    public static void main(String args[]){

    // Pen p=new Pen();
    //  p.color="blue";
    //  p.type="gel";

    // Pen p2=new Pen();
    //  p2.color="black";
    // p2.type="ballpoint";

    // p.write();
    // p1.printColor();
    // p2.printColor();

   //Student s1=new Student();
   // s1.name="aman";
   // s1.age="24";

   // Student s2=new Student();
   // s2.name="Shradha";
   //  s2.age="22";


   //constructor call
   // Student s1=new Student("Shubham", "23");

   // Student s1=new Student();
   // s1.name="Prince";
   // s1.age="23";

     //object ki copy because we never assign the value for s2
   // Student s2=new Student(s1);
   //s2.printInfo();

   //s1.printInfo();


    // polymorphism call
   // s1.printInfo(s1.age);
   // s1.printInfo(s1.name);
   //s1.printInfo(s1.name, s1.age);


    //Traingle t1=new Traingle();
    //t1.color="red";


    //Packages usage...
    //bank.Account account1=new bank.Account();
    //account1.name="aman";


    //Encapsulation- wrapping up of data into one single unit...
    //like join data withs data members and function
    
    
    // data hiding vs abstarction

    //Abstarction can be achieve with abstarct keword by craeting abstract class or interface...

    //private members ko accessible krne ke liye we use getter ansd setters
    //to achieve the same




Horse horse = new Horse();
    horse.walk();

Animal animal = new Horse();
    animal.walk();  //error can not insiate object of abstact class and method and throw run time errror
    }


    //constructor chaining parent call first then others
    //Interfaces have pure abstarction
}