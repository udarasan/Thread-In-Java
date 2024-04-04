package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class A{
    int num;
    boolean value=false;
    public synchronized void put(int num){
        while (value){
            try {
                //pass to wait state
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("PUT : " + num);
        this.num=num;
        value=true;
        notify();
    }
    public synchronized void get(){
        while (!value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("GET : " + num);
        value=false;
        notify();
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

class Consumer implements Runnable{
    A a;
    //generate constructor
    public Consumer(A a) {
        this.a = a;
        Thread t2=new Thread(this,"Consumer");
        t2.start();
    }

    @Override
    public void run() {

        while (true){
            a.get();
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

        A a=new A();
        new Producer(a);
        new Consumer(a);
    }
}