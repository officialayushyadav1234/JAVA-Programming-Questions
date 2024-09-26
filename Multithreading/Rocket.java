package Multithreading;

public class Rocket extends Thread {
    
    public void run(){
        System.out.println("Run method is implemented");
        System.out.println("Thread name is:" +Thread.currentThread().getName());
        System.out.println("Thread Id is:" +Thread.currentThread().getId());
        System.out.println("Thread Priority is:" +Thread.currentThread().getPriority());
        System.out.println("=============================");
    }
}
