package com.DeliciousFood.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Food food;
    
    private int quantity;
    private Long totalPrice;
    
    private List<String> ingredients;

	public Object getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	public void setQuantity(Object quantity2) {
		// TODO Auto-generated method stub
		this.quantity=(int) quantity2;
	}

	public void setFood(Object food2) {
		// TODO Auto-generated method stub
		this.food=(Food) food2;
	}

	@SuppressWarnings("unchecked")
	public void setIngredients(Object ingredients2) {
		// TODO Auto-generated method stub
		this.ingredients=(List<String>) ingredients2;
	}

	public void setQuantity(int quantity2) {
		// TODO Auto-generated method stub
		this.quantity=quantity2;
	}

	public void setTotalPrice(int i) {
		// TODO Auto-generated method stub
		this.totalPrice=(long) i;
	}

}

