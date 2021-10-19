package com.pri.juc.createThread;

import java.util.concurrent.TimeUnit;

/**
 * <BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class InterruptedThread implements Runnable{
    @Override
    public void run() {
        // 一直 run
        while (true) {
            // System.out.println("runing...");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread interrupted = new Thread(new InterruptedThread(), "interrupted");
        interrupted.start();

        TimeUnit.SECONDS.sleep(2);

        interrupted.interrupt();
        // interrupted.stop();

        System.out.println("interruped is "+ interrupted.isInterrupted());

        TimeUnit.SECONDS.sleep(2);
    }
}
