package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class One{
    public void whichThread(){
        for (int i=1;i<=5;i++) {
            System.out.println("Thread One");
        }
    }
}
class Two{
    public void whichThread(){
        for (int i=1;i<=5;i++) {
            System.out.println("Thread Two");
        }
    }
}
public class JavaThread {
    public static void main(String[] args) {

        One obj1=new One();
        Two obj2=new Two();

        obj1.whichThread();
        obj2.whichThread();


    }
}