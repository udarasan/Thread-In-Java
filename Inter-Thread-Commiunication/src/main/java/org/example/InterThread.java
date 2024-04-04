package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class A{
    int num;
    public void put(int num){
        this.num=num;
    }
    public void get(){
        System.out.println(num);
    }
}

class Producer implements Runnable{
    A a;
    //generate constructor
    public Producer(A a) {
        this.a = a;
        Thread t1=new Thread(this,"Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            a.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}