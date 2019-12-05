package com.koderpacks.thread.basic;

/**
 * 
 * Class illustrates different Thread constructors. 
 * @author KoderPacks
 *
 */
public class ThreadExample3 implements Runnable{

	@Override
	public void run() {
		System.out.println("hello from Thread: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadExample3());//thread created with name given by JVM..
		Thread t2=new Thread(new ThreadExample3(), "customName");//thread created with name given by user.
		
		t1.start();
		t2.start();
	}
}
