package org.example;

/**
 * @TimeStamp $DATE $TIME
 * @ProjectDetails $PROJECT_NAME
 * @Author $USER
 */
class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread goes here
        System.out.println("Thread is running");
    }
}
public class ExtentThreadClass {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();
    }
}