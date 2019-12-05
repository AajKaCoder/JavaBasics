package com.koderpacks.thread.basic;

/**
 * 
 * Class to illustrate thread creation by extending Thread Class.
 * @author KoderPacks
 *
 */
public class ThreadExample1 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from my frst thread created using extention of Thread Class!!!");
		}
	}
	
	public static void main(String[] args) {
		ThreadExample1 thread=new ThreadExample1();
		thread.start();
		for (int i = 0; i <10; i++) {
			System.out.println("Hello from Main thread!!!");
		}
	}
	
}
