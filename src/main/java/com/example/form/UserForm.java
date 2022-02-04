//requestパラメーターを受け取るクラス

package com.example.form;

public class UserForm {
	
	private String name;
	private String age;
	private String commnet;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
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
		return "UserForm [name=" + name + ", age=" + age + ", commnet=" + commnet + "]";
	}
	
	
	
	
	
}
