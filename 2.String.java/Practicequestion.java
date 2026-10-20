
import java.util.*;

public class Practicequestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. Write a program to convert the given word into lower case letter:

        // System.out.println("Please enter your name:");
        // // Using in built function:
        // String str=sc.nextLine();
        // str=str.toLowerCase();
        // System.out.println(str);

        // 2. Write a program to replace the space with the user input string in the given string.
        // System.out.println("Please enter any line:");
        // String str= sc.nextLine();
        // System.out.println("Please enter any string or word you want to repalce with space:");
        // String tempStr = sc.nextLine();

        // str=str.replace(" ", tempStr);
        // System.out.println("After replacing:"+str);


        // 3. Check what is the status of the given website name:
        // e.g. : www.google.com = comersial website , .in = indian , .gov= government

        System.out.println("Please enter any website full name to check the status of the website:");
        String str = sc.nextLine();

        if(str.endsWith(".com")) System.out.println("Comersial Website.");
        else if (str.endsWith(".gov")) System.out.println("Government Website.");
        else if(str.endsWith(".in")) System.out.println("Indian Website.");
        else System.out.println("Any other website.");
       
        sc.close();
    }
}
