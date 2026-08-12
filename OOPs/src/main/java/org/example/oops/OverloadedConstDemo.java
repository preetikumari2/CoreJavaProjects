package org.example.oops;

public class OverloadedConstDemo {

    OverloadedConstDemo() {
        this(10);
        System.out.println("no argument");
    }

    OverloadedConstDemo(int i) {
        this(10.5);
        System.out.println("int argument");
    }

    OverloadedConstDemo(double d) {
        System.out.println("double argument");
    }

    public static  void main(String[] args) {
        OverloadedConstDemo oc1 = new OverloadedConstDemo();
        System.out.println("--------------------");
        OverloadedConstDemo oc2 = new OverloadedConstDemo(10);
        System.out.println("--------------------");
        OverloadedConstDemo oc3 = new OverloadedConstDemo(10.5);
        System.out.println("--------------------");
        OverloadedConstDemo oc4 = new OverloadedConstDemo(10l);
    }

}
