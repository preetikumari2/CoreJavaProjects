package com.example;

public class ThreadName {
  public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        System.out.println(myThread.getName());
        Thread.currentThread().setName("Gyan");
        System.out.println(Thread.currentThread().getName());
    }
}
