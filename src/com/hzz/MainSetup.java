package com.hzz;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.nutz.dao.Dao;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

import com.hzz.pojo.UserName;

public class MainSetup implements Setup{

	public void init(NutConfig nc) {
		Ioc ioc = nc.getIoc();
		Dao dao = ioc.get(Dao.class);
		Daos.createTablesInPackage(dao, "com.hzz.pojo", false);
		if(dao.count(UserName.class)==0){
			UserName user = new UserName();
			user.setId("14436320");
			user.setName("胡正再");
			String salt = "123456781234567812345678";
			user.setPwd(new Sha256Hash("1234",salt,1024).toBase64());
			dao.insert(user);
			
			
			
		}
	}
	public void destroy(NutConfig nc) {
		
		
	}
}
