package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //functional interfaces -> any interface which have only one abstract method is called as functional interfaces
        //1> Runnable interface
        //2> callable interface
        //3> comparable interface

        //1st method to access functional interface, In this you need to create extra class
        MyInter m=new MyInterImpl();
        m.sayHello();

        //2nd method to access functional interface
        MyInter i=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("first anonymous class");
            }

        };

        MyInter i2=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("second anonymous class");
            }

        };

        i.sayHello();
        i2.sayHello();

        //lambda expression
        MyInter i3=()-> System.out.println("calling functional interface using lambda ");


        i3.sayHello();


        //
        sum s=new sum() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        System.out.println(s.sum(4,5));

        sum s1=(a,b)-> a+b;

        System.out.println(s1.sum(5,5));

        len l=(Str)-> Str.length();

        System.out.println(l.strlen("subhani"));

    }
}