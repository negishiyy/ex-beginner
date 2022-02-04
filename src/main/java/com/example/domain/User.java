package com.example.domain;

public class User {
	
	private String name;
	private Integer age;
	private String commnet;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCommnet() {
		return commnet;
	}
	public void setCommnet(String commnet) {
		this.commnet = commnet;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", commnet=" + commnet + "]";
	}

	
}
