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
                System.out.println("Thread One : " +Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2=new Thread(() -> {
            for (int i=1;i<=5;i++) {
                System.out.println("Thread Two : " +Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //get default priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

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