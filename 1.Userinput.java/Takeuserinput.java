
import java.util.Scanner;

public class Takeuserinput {
    public static void main(String[] args) {

        // 1. Take User Input = In order to take input from the user in java we hava a scanner class.So, firstly you need to import this class to take input from the user by adding "import java.util.Scanner;" after that you can create your object dynamically and pass "System.in" as a parameter to the constructer.After that your object will be able to use all the methods of that scanner class.

        // There are lot of method in the scanner class but most of them are:
        // 1. object_Name.nextInt() = It is used to take integer input from the user.
        // 2. object_Name.nextFloat() = It is used to take float point number.
        // 3. object_Name.next() = It is used to take single world.
        // 4. object_Name.nextLine() = It is used to take whole complete line.
        // 5. object_Name.nextByte() = It is used to take input with in range [1,127].
        // 6. object_Name.nextBoolean() = It is used to take whole complete line.
        // 7. object_Name.nextDouble() = It is used to take whole complete line.
        // 8. object_Name.nextShort() = It is used to take whole complete line.
        // 9. object_Name.nextLong() = It is used to take whole complete line.
        // 10. object_Name.nextBigDecimal() = It is used to take whole complete line.
        // 11. object_Name.nextBigInteger() = It is used to take whole complete line.
        // 12. object.close() = It is used to close the scanner object.

        // Syntax:
        // Scanner object_Name = new Scanner(System.in); // Dynamically allocate the object.                     (parameter to the constructor.)

        // e.g.:
        Scanner sc = new Scanner(System.in);

        // System.out.print("Please enter any number:");
        // 1. Take interger as input and store in the int varible:
        // int a=sc.nextInt();
        // System.out.println(a);

        // // 2. Take float as input:
        // float b=sc.nextFloat();
        // System.out.println(b);

        // 3. Take first name:
        // String str = sc.next();
        // System.out.println(str);

        // 4. Take complete name:
        // String str = sc.nextLine();
        // System.out.println(str);

        // Checking methods:
        // 1. hasnextInt() = It is used to check the input is interger or not.
        // 2. hasnextFloat() = It is used to check the input is float or not.
        // 3. hasnext() = It is used to check the input is word or not.
        // 4. hasnextLine() = It is used to check the input is line or not.
        // 5. hasnextByte() = It is used to check the input is Byte or not.
        // 6. hasnextBoolean() = It is used to check the input is boolean or not.
        // 7. hasnextLong() = It is used to check the input is long or not.
        // 8. hasnextShort() = It is used to check the input is short or not.
        // 9. hasnextDouble() = It is used to check the input is double or not.
        // 10. hasBigDecimal() = It is used to check the input is bigdecimal or not.
        // 11. hasBigInterger() = It is used to check the input is biginteger or not.
        
        // 1.hasnextInt():
        // boolean a=sc.hasNextInt();
        // System.out.println(a);

        // 2.hasnextFloat():
        // boolean a=sc.hasNextFloat();
        // System.out.println(a);

        // 3.hasnextDouble():
        // boolean a=sc.hasNextDouble();
        // System.out.println(a);

        // 4.hasnextLine():
        // boolean a=sc.hasNextLine();
        // System.out.println(a);


        // It is very important to close the scanner object after taking input from the user.
        sc.close();


    }
}