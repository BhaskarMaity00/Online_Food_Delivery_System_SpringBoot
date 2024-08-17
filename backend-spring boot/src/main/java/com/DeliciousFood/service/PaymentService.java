package com.DeliciousFood.service;

import com.stripe.exception.StripeException;
import com.DeliciousFood.model.Order;
import com.DeliciousFood.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
