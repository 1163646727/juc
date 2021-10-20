package com.pri.juc.threadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockSynchronized1 {

	// private static Object lock = new Object();
	private static Lock lock = new ReentrantLock();


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int N = 10;
		Thread[] threads = new Thread[N];

		for(int i = 0; i < N; ++i){
			threads[i] = new Thread(new Runnable(){
				public void run() {
					// synchronized(lock){
					lock.lock();
						System.out.println(Thread.currentThread().getName() + " get synch lock!");
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						lock.unlock();
					// }
				}
				
			});
		}
		synchronized(lock){
			for(int i = 0; i < N; ++i){
				threads[i].start();
				Thread.sleep(200);
			}
		}
			
		for(int i = 0; i < N; ++i)
			threads[i].join();
	}
}