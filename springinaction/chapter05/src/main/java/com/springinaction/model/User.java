package com.springinaction.model;

/**
 * 
 * @ClassName: User 
 * @Description: 用户的model类
 * @author mao
 * @date 2017年3月29日 下午11:57:39 
 *
 */
public class User {
	
	private int id;
	private String userName;
	private String birthday;
	private String sex;
	private String address;
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", birthday="
				+ birthday + ", sex=" + sex + ", address=" + address + "]";
	}
	
	
	
	
	
}
