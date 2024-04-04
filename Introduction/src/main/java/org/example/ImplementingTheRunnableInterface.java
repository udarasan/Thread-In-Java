package org.example;

/**
 * @TimeStamp 2024-04-05 00:49
 * @ProjectDetails Thread-In-Java
 * @Author udarasan
 */
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread goes here
        System.out.println("Thread is running");
    }
}
public class ImplementingTheRunnableInterface {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object, passing the instance of MyRunnable to its constructor
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();
    }
}
