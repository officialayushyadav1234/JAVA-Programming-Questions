package Multithreading;

public class Vehicle implements Runnable {
    

    public void run(){
           System.out.println("========Vehicle is started========");
           drive();
           System.out.println("========Vehicle reached Destination======");
    }

    public void drive() {
        for(int i = 1; i<=10 ; i++) {
            System.out.println("Vehicle has completed " +i+ "KM");
        }
    }
}
