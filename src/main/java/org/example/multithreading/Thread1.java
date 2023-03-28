package org.example.multithreading;

public class Thread1 extends  Thread {
    public Thread1(String thread1) {
        super(thread1);
    }

    @Override
    public  void  run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("inside thread: "+ Thread.currentThread().getName()+" " +i);
        }
    }
}
