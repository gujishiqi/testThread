package com.zc.threadtest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class TestThread 
{
    public static void main( String[] args )
    {
//        普通方法调用
//        ThreadWithRunnable  launch = new ThreadWithRunnable();
//        launch.run();
//    	  System.out.println("waiting for thread off...");
    	  
//    	    单线程调用
//    	  Thread t = new Thread(new ThreadWithRunnable());
//    	  t.start();
//    	  System.out.println("waiting for thread off...");
    	  
//    	     多线程
//    	  for (int i=5; i>0; i--) {
//			  new Thread(new ThreadWithRunnable()).start();
//			  System.out.println("waiting for thread off...");
//		  }
    	Map<String,String> testMap = new HashMap<String,String>();
    	testMap.put("dsd","ssss");
    	testMap.put("dsd1","ssss");
    	testMap.put("dsd2","ssss");
    	testMap.put("dsd3","ssss");
    	
    	Iterator<String> iterator = testMap.keySet().iterator();
    	while(iterator.hasNext()){
    		String key = iterator.next();
    		System.out.println(key+"======"+testMap.get(key));
    	}
    	System.out.println("=============================="+testMap.size());
    	testMap.remove("dsd");
    	Iterator<String> iterator1 = testMap.keySet().iterator();
    	while(iterator1.hasNext()){
    		String key = iterator1.next();
    		System.out.println(key+"======"+testMap.get(key));
    	}
    	System.out.println("=============================="+testMap.size());
    }
}
