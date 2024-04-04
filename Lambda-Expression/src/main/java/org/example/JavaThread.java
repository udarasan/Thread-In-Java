package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
//we use this class to only implement from runnable interface
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
//we use this class to only implement from runnable interface
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

        Runnable obj1=new One();
        Runnable obj2=new Two();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

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