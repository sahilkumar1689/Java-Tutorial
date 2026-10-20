// import java.time.*;
// import java.time.format.*;


// 1. Anonymous Function:
interface anonym{
    void greet();
    void sum(int a,int b);
}

// 2. Lambda Expression:
interface lambda{
    void greet();
}
public class othertopic {
    public static void main(String[] args) {
        // 1. Data and Time = To play with the data and time java hava a header file called "java.time".

        // It contains following methods:

        // 1. LocalTime.now() = It is used to get the current time.
        // LocalTime t1=LocalTime.now();
        // System.out.println(t1);

        // // 2. LocalDate.now() = It is used to get the current date/
        // LocalDate d1 = LocalDate.now();
        // System.out.println(d1);

        // 3. LocalDateTime.now() = It is used to get both date and time.
        // LocalDateTime dt=LocalDateTime.now();
        // System.out.println(dt);

        // // 4. plusHour(hours) = It is used to add the hours in the current time.
        // LocalTime t2=t1.plusHours(1);
        // System.out.println(t2);

        // // 5. minusHour(hours) = It is ued to subtract the hours in the current time.
        // LocalTime t3 = t1.minusHours(1);
        // System.out.println(t3);

        // Note = 1. We can plus and subtract minute and second.


        // 2. Date and Time Formater = It is used to format our date and time in our desired format.To foramt the data and time you need to import the "java.util.Formater.*".

        // 1. DateTimeFormater.ofpattern("Desiredpattern") = It is used to make the desired format of your date and time.After that you only need to pass it using the format() method.

        // e.g.:

        // Firstly make the object that contains the current date and time:
        // LocalDateTime t1 = LocalDateTime.now();
        // System.out.println("Date and time without format:"+t1);

        // // After that make the object which contains your desired format:
        // // You can check all the valid patterns on the java documentation:
        // DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy --E H:m:s a");

        // // Pass curernt time to the desired format and store the format in the string:
        // String newTime = t1.format(f1);

        // System.out.println("Date and time with format:"+newTime);



        // 3. Anonymous Function = If we want to override the interface methods and use only ones.Then we not need to make any class to implement it.We directly use the anonymous function.

        //e.g.:

        // anonym obj = new anonym(){
        //     @Override
        //     public void greet(){
        //         System.out.println("I'm the anonymous greet function.");
        //     }
        //     public void sum(int a,int b){
        //         System.out.println("Sum is:"+(a+b));
        //     }
        // };

        // obj.greet();
        // obj.sum(5, 5);

        // See clearly we no need to make any class to implements the interface we directly make the anonymous function to Override it.


        // 4. Lambda Epression = See if we have a functionInterface,it means if we have a interface which contains atmost one overrided method then we directly use the lambda expression to override it.In this we not need to make any object we  directly override it.We can also pass parameter in it.
        // e.g.:

        lambda obj = ()->{System.out.println("I'm the lambda expression method.");};
        obj.greet();

        // Note = 1. Anonymous function is used when we only need to override the method ones and use it ones.
        // 2. We use lambda expression only then,when we have an functionalInterface, i.e. We only have one method in our interface.


        





        


        
    }
}
