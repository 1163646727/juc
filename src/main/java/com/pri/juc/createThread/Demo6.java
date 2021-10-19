package com.pri.juc.createThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程方式六：线程池<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo6 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();

        for (int i=0;i<30;i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" 线程runing ...");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        threadPool.shutdown();
    }
}
