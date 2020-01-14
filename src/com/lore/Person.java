package com.lore;

public class Person {
	
	private int id;
	private String name;
	private String sex;
	
	public Person(int id) {
		this.id = id;
	}
	
	public void say() {
		System.out.println("Œ“ «"+this.name);
	}
	
	public double calc(int n,double m) {
		return n*n + m*m;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
