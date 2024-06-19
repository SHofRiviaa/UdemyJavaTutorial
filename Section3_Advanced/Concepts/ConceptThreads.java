package Section3_Advanced.Concepts;

class Counter
{
    int count;
    public synchronized void increment()
    // synchronized keyword is used to make the method thread safe
    // means only one thread can access the method at a time
    {
        count++;
        //System.out.println(count);
    }
}

class Roach extends Thread // can also implement Runnable interface because Thread class implements Runnable interface
// use runnable interface when you want to extend another class
{
    public void run()
    {
        for (int i=0; i<50; i++)
        {
            System.out.println("Roach");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Akira extends Thread
{
    public void run()
    {
        for (int i=0; i<50; i++)
        {
            System.out.println("Akira");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ConceptThreads {
    


    public static void main(String[] args) throws InterruptedException {
        // Threads
        // A thread is a lightweight sub-process, a smallest unit of processing
        // A thread is a separate path of execution, it's like a separate program running inside the main program
        // A thread is a separate flow of execution, it's like a separate flow of control
        // A thread is a separate sequence of instructions, it's like a separate sequence of steps
        // A thread is a separate part of a program, it's like a separate part of the program running in parallel
        // A thread is a separate task, it's like a separate task running in parallel

        // Multithreading
        // Multithreading is the ability of a CPU to execute multiple threads concurrently
        // Multithreading is the ability of a CPU to execute multiple threads simultaneously
        // Multithreading is the ability of a CPU to execute multiple threads in parallel
        // Multithreading is the ability of a CPU to execute multiple threads at the same time

        // Advantages of multithreading
        // Multithreading improves the performance of the program
        // Multithreading improves the responsiveness of the program
        // Multithreading improves the throughput of the program
        // Multithreading improves the resource utilization of the program
        // Multithreading improves the efficiency of the program

        // Thread life cycle
        // New, Runnable, Running, Blocked, Dead

        // Thread states
        // New, Runnable, Waiting, Running, Blocked, Dead, 
        // New: The thread is in new state if you create an instance of Thread class but before the invocation of start() method
        // Runnable: The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread
        // Running: The thread is in running state if the thread scheduler has selected it, and the run() method is being executed
        // Blocked: The thread is in blocked state if it is waiting for a monitor lock to enter a synchronized block/method
        // Dead: The thread is in dead state if the run() method has completed, and the thread is no longer alive, stop()
        // Waiting: The thread is in waiting state if it is waiting for another thread to perform a particular action, sleep(), join(), wait(), notify() for Runnable

        // Thread priorities
        // Thread.MIN_PRIORITY, Thread.NORM_PRIORITY, Thread.MAX_PRIORITY

        // Thread synchronization
        // Thread synchronization is the ability to control the access of multiple threads to shared resources

        // Thread communication
        // Thread communication is the ability of multiple threads to communicate with each other

        // Thread deadlock
        // Thread deadlock is a situation where two or more threads are waiting for each other to release the lock, and none of them releases the lock

        // Thread starvation
        // Thread starvation is a situation where a thread is waiting for a long time to get the lock, and other threads are getting the lock

        // Thread sleep
        // Thread sleep is a method used to pause the execution of the current thread for a specified amount of time

        // Thread yield
        // Thread yield is a method used to pause the execution of the current thread and give a chance to other threads to execute

        // Thread join
        // Thread join is a method used to wait for the completion of a thread

        // Thread interrupt
        // Thread interrupt is a method used to interrupt the execution of a thread

        // Thread isAlive
        // Thread isAlive is a method used to check if a thread is alive or not
/* 
        Roach obj1 = new Roach();
        Akira obj2 = new Akira();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();

        try{
            Thread.sleep(2);
        } catch (Exception e) {
            System.out.println(e);
        }

        obj2.start(); */

        // example of runnable
        // Runnable obj1 = new Roach();
        // Runnable obj2 = new Akira();

        //ex of lambda expression for runnable
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i=0; i<1000; i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i=0; i<1000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(c.count);
        // Mutation
        // Mutation is the ability of a thread to change the state of an object

        // Thread safety
        // Thread safety is the ability of a program to execute multiple threads concurrently without any data corruption


    }

}
