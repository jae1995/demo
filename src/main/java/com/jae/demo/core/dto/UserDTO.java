package com.jae.demo.core.dto;

public class UserDTO extends BaseDTO{

	private static final long serialVersionUID = 2892078330500574725L;

	private Integer uid;
	
	private String username;
	
	private String password;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
