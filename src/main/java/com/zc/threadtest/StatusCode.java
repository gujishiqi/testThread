package com.zc.threadtest;

public enum StatusCode {
	
	
	
	 SUCCES(200,"请求成功！"),
	 NODATA(201,"暂无数据"),
	 REDIRECT(302,"请求被转发"),
	 PARA_ERROR(400,"请求参数有误！"),
	 NOAUTH(401,"无身份认证信息"),
	 NORIGHT(403,"操作受限"),
	 NOTFOUND(404,"资源不存在"),
	 TIMEOUT(408,"请求超时！"),
	 SERVER_ERROR(500,"服务器内部错误！");
	 
	 private int code;
	 private String msg;
	 
	 StatusCode(int code, String msg){
		 this.code = code;
		 this.msg = msg;
	 }

	public int getCode() {
		return this.code;
	}

	public String getMsg() {
		return this.msg;
	}
	
	 
}
