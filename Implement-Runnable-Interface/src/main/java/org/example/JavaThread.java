package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class One implements Runnable {
    public void run(){
        for (int i=1;i<=5;i++) {
            System.out.println("Thread One");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Two implements Runnable {
    public void run(){
        for (int i=1;i<=5;i++) {
            System.out.println("Thread Two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class JavaThread {
    public static void main(String[] args) {

        One obj1=new One();
        Two obj2=new Two();

        Thread t1=new Thread();
        Thread t2=new Thread();

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