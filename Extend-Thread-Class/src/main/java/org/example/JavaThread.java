package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class One extends Thread{
    public void whichThread(){
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
class Two extends Thread{
    public void whichThread(){
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

        //start method came after the extending class form thread class
        obj1.start();
        obj2.start();

        obj1.whichThread();
        obj2.whichThread();


    }
}