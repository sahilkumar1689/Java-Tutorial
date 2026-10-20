import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        // 1. Make a program to store the subjects numbers and get the percentage:

        Scanner sc1=new Scanner(System.in);
        System.out.print("Please enter total number of subjects:");
        int size=sc1.nextInt();
        // float arr[]=new float[size];
        float total=0.0f;
        for(int i=0;i<size;i++){
            System.out.print("Please enter the "+(i+1)+" subject number:");
            total+=sc1.nextFloat();
        }
        System.out.print("Your percentage is:"+(total/size));

        sc1.close();
    }
}
