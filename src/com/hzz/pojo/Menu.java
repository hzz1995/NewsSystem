package com.hzz.pojo;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;


/**
 * menu
 * @author otom3
 * @date 2017-03-28
 */
 @Table("menu")
public class Menu  {
	/**
	 * menu
	 */
	 @Id
	private java.lang.Integer id;//id
	 @Column
	private java.lang.String url;//url
	 @Column
	private java.lang.String name;//name
	public java.lang.Integer getId(){
		return this.id;
	}
	public void setId(java.lang.Integer id){
		this.id	= id;
	}
	public java.lang.String getUrl(){
		return this.url;
	}
	public void setUrl(java.lang.String url){
		this.url	= url;
	}
	public java.lang.String getName(){
		return this.name;
	}
	public void setName(java.lang.String name){
		this.name	= name;
	}
}