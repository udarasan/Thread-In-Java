package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class Calculation{
    int num;
    public void increment(){
        num++;
    }
}
public class JavaThreadSync {
    public static void main(String[] args) throws InterruptedException {

        Calculation c=new Calculation();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t1.join();
        System.out.println("COUNT : "+c.num);
    }
}