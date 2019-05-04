package com.jae.demo.core.dto;

import java.io.Serializable;

import net.sf.json.JSONObject;

public abstract class BaseDTO implements Serializable{

	private static final long serialVersionUID = 5826205300570043292L;
	
	@Override
	public String toString() {
		return JSONObject.fromObject(this).toString();
	}
}
