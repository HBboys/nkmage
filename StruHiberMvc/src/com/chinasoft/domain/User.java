package com.chinasoft.domain;

// Generated 2017-7-14 9:17:12 by Hibernate Tools 3.4.0.CR1

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer uid;
	private String username;
	private String password;
	private Integer age;
	private String address;
	private int cid;
	private String cname;
	private int sid;
	private String sname;

	public User() {
	}

	public User(int cid, int sid) {
		this.cid = cid;
		this.sid = sid;
	}

	public User(String username, String password, Integer age, String address,
			int cid, String cname, int sid, String sname) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.address = address;
		this.cid = cid;
		this.cname = cname;
		this.sid = sid;
		this.sname = sname;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
