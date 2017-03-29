package com.hzz.module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.json.Json;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

import com.hzz.pojo.EasyUITree;
import com.hzz.pojo.Menu;


@IocBean
@At("/")

public class MenuTree {
	@Inject
	protected Dao dao;
	
	@At
	@Ok("Raw")
	public String menutree(HttpServletRequest request,HttpServletResponse respose){
		
		List<EasyUITree> etree = new ArrayList<EasyUITree>();
		List<Menu> list1 =  dao.query(Menu.class, Cnd.where("id","like","_").asc("id"));
		if(list1.size()!=0){
			for(int i =0;i<list1.size();i++){
				Menu menu = list1.get(i);
				EasyUITree tree = new EasyUITree();
				tree.setId(menu.getId());
				tree.setText(menu.getName());
				List<EasyUITree> etree1 = new ArrayList<EasyUITree>();
				List<Menu> list2 = dao.query(Menu.class, Cnd.where("id","like",menu.getId()+"__").asc("id"));
				for(i=0;i<list2.size();i++){
					Menu menu1= list2.get(i);
					EasyUITree tree1 = new EasyUITree();
					tree1.setId(menu1.getId());
					tree1.setText(menu1.getName());
					Map<String,Object> attributes = new HashMap<String, Object>();
				    attributes.put("url", menu1.getUrl());
				    System.out.println(menu1.getUrl()+",");
				    tree1.setAttributes(attributes);
				    tree1.setState("open");
				    etree1.add(tree1);
				}
				tree.setChildren(etree1);
				tree.setState("closed");
				etree.add(tree);
				
				
			}
		}
		
	
		
		return Json.toJson(etree);
	}


}
