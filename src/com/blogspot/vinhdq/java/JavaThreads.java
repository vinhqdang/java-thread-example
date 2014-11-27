/**
 * 
 */
package com.blogspot.vinhdq.java;

/**
 * @author "Quang-Vinh DANG"
 *
 */
public class JavaThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NUM_THREAD = 10;
		MyThread threads[] = new MyThread[NUM_THREAD];
		for (int i = 0; i < NUM_THREAD; i++) {
			threads[i] = new MyThread(i + 1);
			threads[i].setPriority(i + 1);
		}
		
		for (int i = 0; i < NUM_THREAD; i++) {
			threads[i].start();
		}
	}

}
