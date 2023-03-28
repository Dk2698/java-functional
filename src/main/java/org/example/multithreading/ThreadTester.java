package org.example.multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("main is starting");

        Thread thread1 = new Thread1("thread1");
//        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new Thread2(),"thread2");
        thread2.start();

//        System.out.println("main is exiting");


//        Thread thread3 = new Thread(()->{
//            try {
//                Thread.sleep(1);
//                for (int i = 0; i < 1000 ; i++) {
//                    System.out.println(i);
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        },"states");
//
//        thread3.start();
//
//        while (true){
//            Thread.State  state = thread3.getState();
//            System.out.println(state);
//            if (state == Thread.State.TERMINATED) break;
//        }


        Thread thread4 = new Thread( () -> {
            System.out.println(Thread.currentThread());
        }, "our Thread"
        );
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main is exiting");


        // dead lock
        String lock1 = "kumar";
        String lock2 = "kumar2";

        Thread thread5 = new Thread(() ->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        }, "Thread5");


        Thread thread6 = new Thread(() ->{
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("lock acquired");
                }
            }
        }, "Thread6");

        thread5.start();
        thread6.start();
    }

}
