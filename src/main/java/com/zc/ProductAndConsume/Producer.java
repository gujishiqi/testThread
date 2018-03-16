package com.zc.ProductAndConsume;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {

	private  List<Integer> taskQueue = null;
	private  int max_capacity ;
	
	public Producer(List<Integer> taskQueue, int max_capacity){
		this.taskQueue = taskQueue;
		this.max_capacity = max_capacity;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		int counter = 0;
		while(true){
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized (taskQueue) {
			while(taskQueue.size() == max_capacity){
				System.out.println("the queue is full "+ Thread.currentThread().getName()+" "+Thread.currentThread().getId());
				taskQueue.wait();
			}
			
			Thread.sleep(1000);
			taskQueue.add(i);
			System.out.println(Thread.currentThread().getName()+ " Produt"+ i);
			taskQueue.notifyAll();
		}
	}

}
