import java.util.*;

// 1. Single Inheritance:
class base{
    void greet1(){System.out.println("I'm base class.");}
};
class derived extends base{
    void greet2(){System.out.println("I'm derived class.");}
};

// 2. Multilevel inheritance:
class base1{
    void greet1(){System.out.println("I'm base class.");}
};
class derived1 extends base1{
    void greet2(){System.out.println("I'm derived1 class.");}
};
class derived2 extends derived1{
    void greet3(){System.out.println("I'm derived2 class.");}
};

// 3. Hirarchical Inheritance:
class base2{
    void greet1(){System.out.println("I'm base class.");}
};
class derive1 extends base2{
    void greet2(){System.out.println("I'm derived1 class.");}
};
class derive2 extends base2{
    void greet3(){System.out.println("I'm derived2 class.");}
};


// 4. Constructor Inheritance:
class profile{
    private String name;
    private int id;

    profile(String str,int emid){
        this.name=str;
        this.id=emid;
    }

    void printProfileDetails(){
        System.out.println("Name is:"+name);
        System.out.println("Employee id is:"+id);
    }
};
class salary extends profile{
    float a;
    salary(String str,int id,float a){
        super(str, id);
        this.a=a;
    }

    void printSalaryDetails(){
        printProfileDetails();
        System.out.println("Salary is:"+a);
    }
};
class employee extends salary{
    String department;
    employee(String name,int id,float sal,String depar){
        super(name,id,sal);
        this.department=depar;
    }

    void printAllDetails(){
        printSalaryDetails();
        System.out.println("Departement is:"+department);
    }
};

// 1. Assignment= Make a number guessing game using classes:
class guessGame{
    private int guess,randNumber,range,noGuess;

    guessGame(int a){
        range=a;

        Random ran=new Random();
        randNumber=ran.nextInt(range+1);

        noGuess=0;

    }
    
    void takeInput(){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        while(flag!=1){
            System.out.print("Please enter you guess number:");
            guess=sc.nextInt();
            
            if(guess<randNumber) {
                System.out.println("Your guess a small number.");
                noGuess++;
            }
            else if(guess>randNumber){
                System.out.println("Your guess a large number.");
                noGuess++;
            }
            else flag=1;
        }

        System.out.println("\nCongractulations,You guess the right number.");
        sc.close();
    }
    
    void numberOfGuess(){
        System.out.println("\nYou take "+noGuess+" moves to guess the number.");
    }
};

public class Inheritance {
    public static void main(String[] args) {
        // 1. Inheritance = Inheritance is a mechanism in which one class aquires all the properties of his parents class.In java this is done by using the "extends" keyword.The parent class are known as base class on the other hand the child class knowns as derived class.
        // Types of inheritance:
        // 1. Single=In this we have one base class and one derived class.
        // 2. Multilevel=In this every class is the base class of his derived class.
        // 3. Hierachical=In this one base class can be inherited by more than one derived class.
        // 4. Multiple and hybrid=These inheritance are discussed further.These are not inherited by using "extends" keyword.
        
        
        // e.g.:
        // 1. Single Inheritance:
        // derived obj=new derived();
        // obj.greet1();
        // obj.greet2();
        
        // 2. Multiple inheritance:

        // derived2 obj=new derived2();
        // obj.greet1();
        // obj.greet2();
        // obj.greet3();
        
        // 3. Hierarhical Inheritance:
        
        // derive1 obj1=new derive1();
        // obj1.greet1();
        // obj1.greet2();
        
        // derive2 obj2 = new derive2();
        // obj2.greet1();
        // obj2.greet3();
        
        
        // 2. constructor in inheritance = We can also inherit the constructor in heritance by using the "super()" function.
        
        // e.g.:
        
        // employee em1=new employee("Sahil", 5, 1000000, "IT");
        // em1.printAllDetails();
        
        
        // 1. Assignment= Make a number guessing game using classes:
        
        System.out.println("\t\tWelcome in the number guessing game.\n");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range of the guess number.e.g. 100,200,etc:");
        int range=sc.nextInt();
        guessGame g1=new guessGame(range);
        g1.takeInput();
        g1.numberOfGuess();
            
        sc.close();
       
    }
}
