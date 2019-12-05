package com.koderpacks.thread.basic;

/**
 * 
 * Class illustrates Thread's Yield method .
 * @author KoderPacks
 *
 */
public class ThreadExample4 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("Hello from thread :"+Thread.currentThread().getName());
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadExample4(), "custom1");
		Thread t2=new Thread(new ThreadExample4() {public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Hello from thread :"+Thread.currentThread().getName());
				}
			
		}}, "custom2");
		t1.start();
		t2.start();
	}
}
