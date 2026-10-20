
class thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("I'm the thread1.");
    }
};
class thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("I'm the thread2.");
    }
};
public class Threadingsmethods {
    public static void main(String[] args) throws InterruptedException {

        // 1. Priorities in multithreading = Basically all the threads which are ready and  waiting to be executed are present in the ready queue.But the question is that on what basis the thread schedular decides that a particular thread will run before the other threads.
        // Here comes the concept of the priority.There are three type of priority in the threads:
        // 1. Thread.MIN_PRIORITY = It's final value is 1.
        // 2. Thread.NORM_PRIORITY = It's final value is 5.
        // 3. Thread.MAX_PRIORITY = It's final value is 10.

        // There are two methods to set the priority:
        // 1. obj1.set_priority([1,10])= This value can be varies from [1,10].
        // 2. obj1.get_priority()= It is used to see the priority of any object.

        // e.g.:

        // thread1 obj1= new thread1();
        // thread2 obj2 = new thread2();
        
        // obj1.setPriority(Thread.MAX_PRIORITY); // You can also set between [1,10].
        // obj2.setPriority(Thread.MIN_PRIORITY); // You can also set between [1,10].
        
        // System.out.println("Thread 1 execute first it's priority is:"+obj1.getPriority());
        // obj1.start();
        // System.out.println("Thread 2 execute second it's priority is:"+obj2.getPriority());
        // obj2.start();
        
        
        // 2. join() and sleep() = The join() method allow one thread to wait until the execution of some other thread is completed.We can also pass the millisecond as a argument inside the join to wait until specific time.join() method are put inside the try catch block.
        // sleep(millisecond) method is used to pause the flow of the code until specific millisecond
        
        // e.g.:
        
        // thread1 obj1= new thread1();
        // thread2 obj2 = new thread2();

        // obj1.start();
        // try {
        //     obj1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // Thread.sleep(1000);
        // obj2.start();


        // Some of the main methods are:
        // 1. run()=It is used to run the action for a thread.
        // 2. start()=It is used to start the executio of the thread.
        // 3. sleep(millisecond)=It sleep the thread specific amount of time.
        // 4. join(millisecond or not)=It allow one thread to wait until the other thread is executed.
        // 5. getpriority()=Get the priority of the thread.
        // 6. setpriority()=Set the priority of the thread.
        // 7. getName()=Set the name of the thread.
        // 8. setName()=Get the name of the thread.
        // 9. getId()=Return the id of the thread.
        // 10. isAlive()=It tells whether the thread is alive or not.
        // 11. yield()=It pause the current thread execution and allow other thead to execute for temporaily.
        // 12. isDaemon()=It test whether the thread is daemon or not.
        // 13. setDaemon()=It set any thread daemon.
        // 14. interrupt()=It interrupt the thread.
    }
}
