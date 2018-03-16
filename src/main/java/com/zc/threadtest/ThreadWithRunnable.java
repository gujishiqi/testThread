package com.zc.threadtest;


public class ThreadWithRunnable implements Runnable {

	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public ThreadWithRunnable(){};
	
	public ThreadWithRunnable(int countDown){
		this.countDown = countDown;
	}
	
	public String status(){
		
		return "#" + id + "(" + (countDown>0 ? countDown: "lifeoff") + ").";
	}
	
	public void run() {
		while(countDown-- >0){
			System.out.println(status());
			Thread.yield();
		}
	}

}
