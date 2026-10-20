
import java.util.*;

public class program {
    static public void printPatternR(int n,int a){
        // Base Case:
        if(n==0) return;
        for(int i=0;i<(n-(n-1))+a;i++) System.out.print("*");
        System.out.println();
        printPatternR(n-1,a+1);
    }
    static public void printPatternB(int n){
        // Base Case:
        if(n==0) return;
        int temp=n;
        printPatternB(n-1);
        for(int i=0;i<temp;i++) System.out.print("*");
        System.out.println();
    }
    public static void main(String[] args) {
        // Program to print the pattern using recursion:
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Using recursion:
        printPatternR(n,0);
        // Using backtracking:
        printPatternB(n);
        sc.close();
    }
}
