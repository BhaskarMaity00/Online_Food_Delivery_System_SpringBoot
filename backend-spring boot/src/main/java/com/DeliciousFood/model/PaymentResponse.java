package com.DeliciousFood.model;

import lombok.Data;

@Data
public class PaymentResponse {
	
	private String payment_url ;

	public void setPayment_url(String url) {
		// TODO Auto-generated method stub
		this.payment_url=url;
	}

}
