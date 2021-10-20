package com.pri.juc.threadSecurity;

/**
 * 复现 多线程操作共享数据，存在的安全问题 <BR>
 * author: ChenQi <BR>
 * createDate: 2021/10/20 <BR>
 */
public class Sequence {
    private volatile Integer value = 0;

    public Integer getNext(){
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

        synchronized (this){
            value = value + 1;
        }

        return value;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i=0;i<20;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" : "+sequence.getNext());
                }
            }).start();
        }
    }
}
