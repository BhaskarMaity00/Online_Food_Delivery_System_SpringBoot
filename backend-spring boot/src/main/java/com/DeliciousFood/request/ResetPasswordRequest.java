package com.DeliciousFood.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {
	
	private String password;
	private String token;
	public String getToken() {
		// TODO Auto-generated method stub
		return token;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


}
