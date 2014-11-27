/**
 * 
 */
package com.blogspot.vinhdq.java;

/**
 * @author "Quang-Vinh DANG"
 *
 */
public class MyThread extends Thread {
	int threadId;
	
	public MyThread (int threadId) {
		// TODO Auto-generated constructor stub
		this.threadId = threadId;
	}
	
	@Override
	public void run () {
		while (true) {
			System.out.println(threadId);
		}
	}
}
