package org.example.multithreading;

public class Thread2 implements  Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("inside thread: "+ Thread.currentThread().getName()+" " +i);
        }
    }
}