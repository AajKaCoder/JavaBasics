package com.koderpacks.thread.basic;

/**
 * 
 * Class illustrates creation of thread using Runnable interface.
 * @author KoderPacks
 *
 */
public class ThreadExample2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("hello from thread created using Runnable Interface!!");
		}
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadExample2());
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("hello from main thread!!!");
		}
	}
}
