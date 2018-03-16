package com.zc.commontest;

import java.util.ArrayList;
import java.util.List;

public class CommonTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asfa");
		list.add("bsfa");
		list.add("csfa");
		list.add("dsfa");
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		
	}
}
