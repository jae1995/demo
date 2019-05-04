package com.jae.demo.core.po;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = -6648460303896033829L;
	
	@Id
	@Column(name = "id", type = MySqlTypeConstant.BIGINT, length = 20, isKey = true, isAutoIncrement = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	
	@Column(name="username",type = MySqlTypeConstant.VARCHAR,length = 255)
	private String username;
	
	@Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 255)
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
