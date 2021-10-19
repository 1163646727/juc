package com.pri.juc.createThread;

import java.util.concurrent.TimeUnit;

/**
 * 创建线程方式一、继承 Thread 类<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo1 extends Thread{


    public Demo1(String demo1) {
        super(demo1);
    }

    @Override
    public void run() {
        while ( !interrupted()){
            System.out.println(getName()+"线程执行了...");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo1 = new Demo1("demo1");
        Demo1 demo2 = new Demo1("demo2");

        demo1.start();
        demo2.start();

        System.out.println("start()");

        TimeUnit.SECONDS.sleep(5);

        //停止线程
        demo1.interrupt();
        // demo2.interrupt();
        // demo1.stop();
        demo2.stop();

    }
}
