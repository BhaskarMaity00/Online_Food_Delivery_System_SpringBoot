package com.DeliciousFood.model;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private User customer;

	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;

	private Long totalAmount;
	
	private String orderStatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@ManyToOne
	private Address deliveryAddress;

//	@JsonIgnore
	@OneToMany
	private List<OrderItem> items;

	@OneToOne
	private Payment payment;
	
	private int totalItem;
	
	private int totalPrice;

	public String getOrderStatus() {
		// TODO Auto-generated method stub
		return orderStatus;
	}

	public Object getCustomer() {
		// TODO Auto-generated method stub
		return customer;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setCustomer(User user) {
		// TODO Auto-generated method stub
		this.customer=user;
	}

	public void setDeliveryAddress(Address savedAddress) {
		// TODO Auto-generated method stub
		this.deliveryAddress=savedAddress;
	}

	public void setCreatedAt(Date date) {
		// TODO Auto-generated method stub
		this.createdAt=date;
	}

	public void setOrderStatus(String string) {
		// TODO Auto-generated method stub
		this.orderStatus=string;
	}

	public void setRestaurant(Restaurant restaurant2) {
		// TODO Auto-generated method stub
		this.restaurant=restaurant2;
	}

	public void setTotalAmount(Long totalPrice2) {
		// TODO Auto-generated method stub
		this.totalAmount=totalPrice2;
	}

	public void setItems(List<OrderItem> orderItems) {
		// TODO Auto-generated method stub
		this.items=orderItems;
	}

	public long getTotalAmount() {
		// TODO Auto-generated method stub
		return totalAmount;
	}


	

}
