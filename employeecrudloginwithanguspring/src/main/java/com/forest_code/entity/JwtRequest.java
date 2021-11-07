package com.forest_code.entity;

public class JwtRequest {

	String username;
	String password;

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JwtRequest [username=" + username + ", password=" + password + "]";
	}
	public JwtRequest() {
		super();
	}
	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	
	
}
