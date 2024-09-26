package Multithreading;

import java.lang.*;
public class Driver1 {
    
    public static void main(String[] args) {
        
        System.out.println("Thrad name is: "+Thread.currentThread().getName());
        System.out.println("Thread Prio");

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        
        t2.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
