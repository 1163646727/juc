package com.pri.juc.createThread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 创建线程方式五：定时任务<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo5 {

    public static void main(String[] args) {

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务。。。。。");
            }
        },0,100);

    }
}
