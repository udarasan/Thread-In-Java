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


public class InterThread {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}