// import java.util.Scanner;

class MaxAge extends Exception{
    @Override
    public String toString(){
        return "Age can'nt be greather than 125.";
    }
    @Override
    public String getMessage(){
        return "Make sure the entered age is correct.";
    }
};

public class Exceptionbasic {
    public static void main(String[] args) {
        // 1. Exception Handling=Exception handling in java is one of the effective mechanism to handle runtime error so that the regular flow of the application can be preserved.Basically it is used to handle runtime error such as ClassNotFoundException, IOException,SQLException,RemoteException,etc.

        // Basically in java,exception is an unwanted or unexpected event which occurs during the execution of a program,i.e. at runtime that disrupts the normal flow of the program's instruction.
        // These exception are handle using the try-catch block:
        // Syntax:
        // try{// The code need to be try.}
        // catch(Exception e){// Handle exception code.}

        // e.g.:
        // int a = 10;
        // int b=0;
        // try{
        //     System.out.println(a/b);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }


        // 2. Types of exception=Java defines several types of exception that relates to its various class libraries.It can be categorized in two ways:

        // 1. Built in Exception = Basically these are those exception which are already present in the java libraries.They further divided into two parts:
        // (i). Checked Exception=It is also called a compile time exception because these exception are checked by the compiler at compile time.
        // e.g.:
        // ClassNotFoundException,FileNotFoundException,IOException,SQLException,etc.

        // (ii). Unchecked Exception=These exception are just opposite to the checked exception.The compiler will not check these exception at compile time.
        // e.g.:
        // ArithmeticException,NullPointerException,ArrayIndexOutOfBoundException,etc.

        //e.g.:
        // We can also add more than one catch block to handle more than one exception at a time:
        // Scanner sc = new Scanner(System.in);
        // try {
        //     int a=sc.nextInt();
        //     int b=sc.nextInt();
        //     System.out.println(a/b);
        // }
        // // It is used to catch arithmetic exception: 
        // catch (ArithmeticException e) {
        //     System.out.println("It an arithemetic exception.");
        //     System.out.println(e);
        // }
        // // It is used to catch only runtime exception:
        // catch(RuntimeException e){
        //     System.out.println("It an runtime error arises.");
        //     System.out.println(e);
        // }
        // // This block is used to catch all type of exceptions:
        // catch(Exception e){
        //     System.out.println("Exception arises.");
        //     System.out.println(e);
        // }
        // sc.close();


        // 2. User defined Exception=Some time the built in exception in java are not able to describe a certain situtaion.In such case user can also create there own exception called user defined exception.
        // Basically in this we need to make our new class which extends from the Exception class and override some methods of them and they used using "throw "keyword.

        // Method available in the userdefinedexception:
        // 1. printStackTrace()=It print the name and discription of the exception,stack trace.
        // 2. toString()=It print the name of the exception.
        // 3. getMessage()=It prints only the discription of the exception.


        // e.g.:
        // Scanner sc=new Scanner(System.in);
        // try {
        //     int age=sc.nextInt();
        //     if(age>125) 
        //         throw new MaxAge();
        //     System.out.println("Age is:"+age);
            
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        //     e.printStackTrace();
        // }
        // sc.close();


    }
}
