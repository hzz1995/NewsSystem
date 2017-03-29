package com.hzz.module;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;

@IocBean
@At("/news")
@Ok("json")
@Fail("http:500")
public class UserModule {
	@Inject
	protected Dao dao;
	
	@At
	@Ok("json")
	public int docount(){
		System.out.println("登录成功");
		return 1;
	}
	
	
}
