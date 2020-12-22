package com.cnb;

public class Student {
	String name;
	int sid;
	public Student(String name, int sid) {
		super();
		this.name = name;
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + "]";
	}	
}
