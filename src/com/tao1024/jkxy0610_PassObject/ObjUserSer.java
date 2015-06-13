package com.tao1024.jkxy0610_PassObject;

import java.io.Serializable;

public class ObjUserSer implements Serializable{

	private String name;
	private int age;
	
	public ObjUserSer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
