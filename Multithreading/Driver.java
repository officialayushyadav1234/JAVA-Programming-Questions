package Multithreading;

public class Driver {
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        l1.start();
        System.out.println("===================");
        l2.start();
        System.out.println("=======================");
        l3.start();
    }
}
