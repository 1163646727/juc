package com.pri.juc.createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 创建线程方式四： 带返回值的线程<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo4 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("thread callable run ...");
        Thread.sleep(2000);
        System.out.println("thread end !");
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo4 demo4 = new Demo4();

        FutureTask<Integer> task = new FutureTask<Integer>(demo4);
        System.out.println("摸鱼时间--------。。。。");
        Thread thread = new Thread(task);
        System.out.println("摸鱼时间00000。。。。");
        thread.start();

        TimeUnit.SECONDS.sleep(3);

        System.out.println("摸鱼时间。。。。");

        Integer res = task.get();
        System.out.println("摸鱼时间222。。。。");
        System.out.println("线程执行结构："+res);
        System.out.println("摸鱼时间333。。。。");


    }
}
