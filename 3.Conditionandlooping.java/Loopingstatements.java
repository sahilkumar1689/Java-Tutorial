
import java.util.*;

public class Loopingstatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. Make a program to print the reverse 90 degree pattern:
        // int n=sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=(n-i);j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 2. Write a program to print the table of any number enter by the user:
            // int n=sc.nextInt();

            // System.out.println("Table of "+n+" is:\n");
            // for(int i=1;i<=10;i++) System.out.println(n+" x "+i+" = "+(n*i)+"\n");

        
        // 3. Print sum of all the numbers in the printed table:
            int n=sc.nextInt();

            System.out.println("\nTable of "+n+" is:\n");
            int sum=0;
            for(int i=1;i<=10;i++) {
                System.out.println(n+" x "+i+" = "+(n*i)); 
                sum=sum+n*i;
            }  
            System.out.println("\nTotal sum is:"+sum);

        sc.close();
    }
}
