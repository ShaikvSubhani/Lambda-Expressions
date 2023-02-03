package org.example;

public class ThreadDemo {
    public static void main(String[] args) {
        //first thread: john
        Runnable r=()-> {
            for(int i=1;i<=10;i++) {
                System.out.println(i);
                {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t=new Thread(r);
        t.setName("john");
        t.start();

        //2nd thread
        Runnable t2=()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(2*i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1=new Thread(t2);
        t1.start();

    }
}
