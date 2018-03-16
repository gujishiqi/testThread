package com.zc.threadSychonize;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object signalA = new Object();
		Object signalB = new Object();
		
		new Thread(new PrintWorkerA(signalA, signalB)).start();
		new Thread(new PrintWorkerB(signalA, signalB)).start();
		
	}

}
