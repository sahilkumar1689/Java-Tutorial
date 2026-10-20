

public class Basicmethods {
    // 1. Using static keyword:
    public static void greet() {
        System.out.println("Hello i'm static function.");
    }
    // 2. Without using the static keyword:
    public void greet1(){
        System.out.println("Hello i'm non static fucnction.");
    }

    // 3. Variable Arguments:
    public static int sum(int...arr){
        int ans=0;
        for(int it:arr) ans+=it;
        return ans;
    }
    // 4. Variable Arguments with restriction:
    public static int sum1(int x,int...arr){
        int ans=x;
        for(int it:arr) ans+=it;
        return ans;
    }

    public static void main(String[] args) {
        // 1. Methods = Basically methods are the functions which are written inside the class.There are two methods/ways to declare a function/method inside a class.
        // By using the static keyword and without using static keyword.
        // 1. Simple if we want to share our method to all around inside a class then we use the static keyword.
        // 2. But if we don'nt want to share our function to all around the class then we don'nt use the static keyword but in this we need to make an object of that class to call that function.
        
        // e.g.:
        
        // 1. Using static keyword:
        greet();
        
        // 2. Without using the static keyword:
        Basicmethods obj=new Basicmethods();
        obj.greet1();
        
        
        // Note = 1. If we want to use the function with the similar concept of c++ then use the static keyword.
        // 2. But if we want ot use the function as an object then don'nt use the static keyword.
        // 3. Rest of the concept in the function/method will be similar to the c++.
        // 4. In this we can'nt overload function by changing the return type,but in c++ we did it.


        // 2. Special topic int java functions/methods:
        
        // (i) Variable Arguments = In this we bacially make our function capable to handle multiple arguments with one declaration and one defination.

        // Syntax:
        // static public data_type func_name(int...arr){// In this arr will be treated as the array which stores all the multiple arguments.}

        // e.g.:
        System.out.println(sum(4,5,6,7,8));

        
        // (ii) We can also set restriction in our function to give atleast onde argument.
        // Syntax:
        // static public data_type func_type(int a,int...arr){// In this x will be treated as the first argument element and rest of the elements are stored in the arr.}

        // e.g.:
        System.out.println(sum1(4,5,6,7,8));

        // Recommendation = Not use to much and use wiselly.

    }
    
}
