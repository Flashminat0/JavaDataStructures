package com.sliit;

public class Queue {
    public static void main(String[] args) {
        QueueX q = new QueueX(3);
        while (q.isEmpty()){
            q.insert(5);
        }
        q.isFull();
    }
}
