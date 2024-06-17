package Section3_Advanced.Concepts;

class Roach extends Thread
{
    public void run()
    {
        for (int i=0; i<50; i++)
        {
            System.out.println("Roach");
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
        }
    }
}

public class ConceptThreads {
    


    public static void main(String[] args) {
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
        // New, Runnable, Running, Blocked, Dead

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

        Roach obj1 = new Roach();
        Akira obj2 = new Akira();

        obj1.start();
        obj2.start();


    }

}
