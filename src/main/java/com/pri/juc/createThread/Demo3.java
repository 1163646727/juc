package com.pri.juc.createThread;

/**
 * 创建线程方式三：匿名内部类<BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/19 <BR>
 */
public class Demo3 {


    public static void main(String[] args) {

        /*new Thread(){
            public void run(){
                System.out.println("thread.....");
            }
        }.start();*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread.....");
            }
        }).start();
    }
}
