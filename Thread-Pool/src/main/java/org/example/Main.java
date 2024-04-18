package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @TimeStamp 2024-04-19 00:03
 * @ProjectDetails Thread-In-Java
 * @Author udarasan
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);

        for (int i=0;i<5;i++){
            Runnable runnable=new MyRunnable("myWorkerThread : " +i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        System.out.println("All Request Completed Successfully");
    }
}
