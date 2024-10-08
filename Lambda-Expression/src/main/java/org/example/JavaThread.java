package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
public class JavaThread {
    public static void main(String[] args) {

        Thread t1=new Thread(() -> {
            for (int i=1;i<=5;i++) {
                System.out.println("Thread One");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2=new Thread(() -> {
            for (int i=1;i<=5;i++) {
                System.out.println("Thread Two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //runnable interface don't have start method
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();



    }
}