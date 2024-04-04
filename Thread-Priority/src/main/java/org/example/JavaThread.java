package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
public class JavaThread {
    public static void main(String[] args) throws InterruptedException {

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

        //get thread name
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        t1.join();
        t2.join();

        //main thread print this line
        System.out.println("Bye");


    }
}