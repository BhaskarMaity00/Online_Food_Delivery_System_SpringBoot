package com.DeliciousFood.response;


import com.DeliciousFood.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;
	public void setJwt(String token) {
		// TODO Auto-generated method stub
		this.jwt=token;
	}
	public void setMessage(String string) {
		// TODO Auto-generated method stub
		this.message=string;
	}
	public void setRole(USER_ROLE role2) {
		// TODO Auto-generated method stub
		this.role=role2;
	}
	


}
