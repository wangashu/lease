package com.wangashu.config;

import java.util.concurrent.*;

public class Test4 {

    public static void main(String[] args) {
   /*     ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,  // 核心线程数
                5,  // 最大线程数
                60, // 线程最大空闲时间（秒）
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3), // 任务队列（3个任务）
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy() // 拒绝策略
        );

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " 执行任务 " + taskId);
            });
        }

        threadPool.shutdown();*/



        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();




    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }

        }
    }



}
