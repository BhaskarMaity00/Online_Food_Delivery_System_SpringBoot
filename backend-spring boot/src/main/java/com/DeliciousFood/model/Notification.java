package com.DeliciousFood.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private User customer;
    
    @ManyToOne
    private Restaurant restaurant;
    
    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    private Date sentAt;
    
    private boolean readStatus;

	public void setMessage(String string) {
		// TODO Auto-generated method stub
		this.message=string;
	}

	public void setCustomer(Object customer2) {
		// TODO Auto-generated method stub
		this.customer=(User) customer2;
	}

	public void setSentAt(Date date) {
		// TODO Auto-generated method stub
		this.sentAt=date;
	}
    
    
}

