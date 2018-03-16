package com.zc.threadSychonize;

public class PrintWorkerA implements Runnable {

	private Object objectA = null;
	private Object objectB = null;

	PrintWorkerA(Object printACon, Object printBCon) {
	        objectA = printACon;
	        objectB = printBCon;
	    }

	public void run() {
		System.out.println("PrintA start......");
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("printA print " + i);
		}

		try {
			// A线程打印完了1、2、3后通知线程开始打印并且自身开始等待
			synchronized (objectA) {
				synchronized (objectB) {
					objectB.notify();
				}
				objectA.wait();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("PrintA reStart......");
		for (int i = 7; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("printA print " + i);
		}
	}

}
