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
    public static void main(String[] args) {

        Calculation c=new Calculation();
        c.increment();
        c.increment();
        System.out.println("COUNT : "+c.num);
    }
}