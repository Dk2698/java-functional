package org.example.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;

    private  int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    public  boolean add(int item){
        synchronized (q){
            if(q.size() == capacity){
                // do something
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            q.add(item);
            q.notifyAll();
            return  true;
        }
    }
    public  int remove(){
        synchronized (q){
            if(q.size() == 0){
                // do something
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int element = q.poll();
            q.notifyAll();
            return  element;
        }
    }
}
