package com.example;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(15); // IllegalArgumentException
        Thread.currentThread().setPriority(7);
        MyThread myThread = new MyThread();
        System.out.println(myThread.getPriority());
    }
}
