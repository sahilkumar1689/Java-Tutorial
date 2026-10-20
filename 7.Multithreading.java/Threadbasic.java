
// 1. Extended the thread class:

class Thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thread1 is running.");
            i++;
        }
    }
};

class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thread2 is running.");
            i++;
        }
    }
};


// 2. Implements the Runnable interface:

class newThread1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thread1 is running.");
            i++;
        }
    }
};

class newThread2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thread2 is running.");
            i++;
        }
    }
};

// 3. Thread Constructor:
class thread extends Thread{
    public thread(String name){super(name);}
    @Override
    public void run(){
        System.out.println("I'm the thread with constructor.");
    }
};


public class Threadbasic  {
    public static void main(String[] args) {
        // 1. Multithreading=Multithreading in java is a process of  executing multiple threads simultaneously.Basically it is a feature of java that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.A thread is a lightweight sub-process,the smallest unit of processing.Basically multiprocessing and multithreading both are used to execute multitasking.But we use multithreading rather that multiprocessing because thread used a shared memory area.They don't allocate separate memory area so save memory and also context switching between the threads take less time than multiprocess.

        // Threads can be created by using two mechanisms:
        // 1. Extending the threads class=Basically in this we create our own class and extends it by Threads class.After that we can overrride the run() method of thread class in them.A thread begin its life inside the run() method.After that we create the object of that new extended class and call the start() method.The start() method invoke the run() method.

        // 2. Implements the Runnable interface=Basically in this we create a new class which implements the Runnable interface and override the  run() method in them.Then we instantiate a thread object and call start() method on their object.

        // e.g.:

        // 1. Extended the thread class:

        // Thread1 obj1 = new Thread1();
        // Thread2 obj2 = new Thread2();

        // obj1.start();
        // obj2.start();


        // 2. Implements the Runnable interface:

        // Firstly make the obj of runnable interface implemented class:
        // newThread1 obj1 = new newThread1();
        // newThread2 obj2 = new newThread2();

        // // After that pass its object as the arguments in the constructor of thread class:
        // Thread newObj1 = new Thread(obj1);
        // Thread newObj2 = new Thread(obj2);

        // newObj1.start();
        // newObj2.start();


        // Constructor in threads:
        // 1. Thread() = Default consturctor we see above in 1.
        // 2. Thread(String)=It is used to set gave the name of the parameter.In this the whole implementation will be same but we only need to make a parameterised constuctor which take a string value and after that they will pass to its upper class using super(value) function.
        // e.g.:
        // thread obj = new thread("Sahil thread."); 
        // obj.start();
        // System.out.println("The name of the thread is:"+obj.getName()); // this function is used to get the name of the thread.
        
        // 3. Thread(Runnable rObj)=We see above in 2.
        // 4. Thread(Runnable rObj,String_name)=The whole implementation will be similar but the only difference is that we need to pass one more argument in constructor.
        // e.g.:
        newThread1 obj3 = new newThread1();
        Thread newobj = new Thread(obj3,"Sahil");
        newobj.start();
        System.out.println("The name of thread is:"+newobj.getName());

    }
}
