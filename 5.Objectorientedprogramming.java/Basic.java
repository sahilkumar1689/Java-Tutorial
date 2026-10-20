
class Employee{
    String name;
    int id;
    void printDetails(){
        System.out.println("Name is:"+name);
        System.out.println("Id is:"+id);
    }
};
class Employee1{
    private String name;
    private int id;
    void set_Details(String str,int emid){
        // Don't use "->":
        this.name=str;
        this.id=emid;
    }
    void printDetails(){
        System.out.println("Name is:"+name);
        System.out.println("Id is:"+id);
    }
};
class Employee2{
    private String name;
    private int id;
    Employee2(String str,int emid){
        this.name=str;
        this.id=emid;
    }
    void printDetails(){
        System.out.println("Name is:"+name);
        System.out.println("Id is:"+id);
    }
};

public class Basic {

    public static void main(String[] args) {
        // 1. Object oriented program in the java is similar to the c++ with little bit differences:
        // 1. In this default visibility mode is public not private.
        // 2. Instead of using access specifier block in java you need to use access specifier with every single methods and attributes.
        // 3. In java we don't use the "->" pointer operator with "this" keyword.We use the "." dot operator.
        // 4. In java we can'nt use the shorthand constructor assignment.e.g.:
        // constructor(...):p1(.),p2(.){}; // we can'nt use this in java.
        // 5. In java we use the "extends" keyword in ordered to implement inheritance.


        // e.g.:
        // 1. Make an employee class without using any access specifier,it means default access specifier is public:
        // Employee em1=new Employee();
        // em1.id=5;
        // em1.name="Sahil";
        // em1.printDetails();
        
        // // 2. With using different acces specifier:
        // Employee1 em2=new Employee1();
        // em2.set_Details("Sahil", 5);
        // em2.printDetails();
        
        
        // // 3. Using Constructor:
        // Employee2 em3=new Employee2("Sahil",5);
        // em3.printDetails();

    }
}
