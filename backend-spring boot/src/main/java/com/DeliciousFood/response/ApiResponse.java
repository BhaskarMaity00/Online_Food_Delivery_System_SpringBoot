package com.DeliciousFood.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
	
	private String message;
	private boolean status;
	public ApiResponse(String string, boolean b) {
		// TODO Auto-generated constructor stub
		this.message=string;
		this.status=b;
	}
	


	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}



	public void setMessage(String string) {
		// TODO Auto-generated method stub
		this.message=string;
	}
	public void setStatus(boolean b) {
		// TODO Auto-generated method stub
		this.status=b;
	}


}
