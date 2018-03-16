package com.zc.testArea;

import java.io.IOException;

import org.jsoup.Jsoup;

public class LocationByAreaName {
	public static void main(String[] args) {
//		http://api.map.baidu.com/geocoder?address=%E4%B8%8A%E5%9C%B0%E5%8D%81%E8%A1%9710%E5%8F%B7&output=json&key=37492c0ee6f924cb5e934fa08c6b1676
//		String ip = "http://api.map.baidu.com/geocoder/v2/?address=西安市&output=json&ak=79oGApCrDAMR1VIWvgNmz950v6xaNVDn";
//		try {
//			String con = Jsoup.connect(ip).ignoreContentType(true).execute().body();
//			System.out.println(con);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		double num = 108.95309827919623;
//		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");  
//		String format = df.format(num);
//		System.out.println(format);
		//'ZCPG'=='{\'企业名称\':\'西安曲江合创房地产开发有限公司\'}'
		String test = "2010-12-13";
		//System.out.println(test.replace("'",""));
		String s = test.replace("'","\"");
		if(test.length()>10){
			System.out.println(test.substring(0,10));
		}else{
			System.out.println(test);
		}
		
		
	}
}
