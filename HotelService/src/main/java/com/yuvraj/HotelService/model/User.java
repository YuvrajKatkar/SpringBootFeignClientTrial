package com.yuvraj.HotelService.model;

public class User {
	private int id;
	private String name;
	private int age;
	private int Hotelid;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHotelid() {
		return Hotelid;
	}
	public void setHotelid(int hotelid) {
		Hotelid = hotelid;
	}
	public User(int id, String name, int age, int hotelid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Hotelid = hotelid;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", Hotelid=" + Hotelid + "]";
	}
}
