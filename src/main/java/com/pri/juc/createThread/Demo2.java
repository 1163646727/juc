package com.pri.juc.createThread;

import java.util.concurrent.TimeUnit;

/**
 * 创建线程方式二：实现 Runable 接口，作为线程任务存在<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo2 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()+" thread runing...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Demo2());
        thread.start();

/*        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }*/

        TimeUnit.SECONDS.sleep(1);
        // thread.interrupt();
        thread.stop();
    }
}
