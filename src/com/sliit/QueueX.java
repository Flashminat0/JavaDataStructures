package com.sliit;

public class QueueX {
    private int[] QueueArr;
    private int maxSize;
    private int rear;
    private int front;
    private int noItems;

    public QueueX(int j) {
        maxSize = j;
        QueueArr = new int[maxSize];
        front = 0;
        rear = -1;
        noItems = 0;
    }

    public void insert(int j) {
        if (isFull()) {
            return;
//            System.out.println("This is full");
        } else {
            System.out.println();
            QueueArr[++rear] = j;
            noItems++;
        }
    }

    public void remove() {
        if (isEmpty()) {
            return;
//            System.out.println("This is empty");
        } else {
            QueueArr[front] = 0;
            front++;
            noItems--;
        }
    }

    public boolean isFull() {
        if (rear == maxSize - 1) {
            System.out.println("Array is Full");
            return true;
        } else {
            System.out.println("Array is not Full");
            return false;
        }
    }

    public boolean isEmpty() {
        if (noItems == 0) {
            System.out.println("is Empty");
            return true;
        } else {
            System.out.println("not Empty");
            return false;
        }
    }
}
