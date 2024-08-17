package com.DeliciousFood.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Food food;
    
    private int quantity;
    
    private List<String> ingredients;
    
    private Long totalPrice;

	public Object getFood() {
		// TODO Auto-generated method stub
		return food;
	}

	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setFood(Food food2) {
		// TODO Auto-generated method stub
		this.food=food2;
	}

	public void setQuantity(int quantity2) {
		// TODO Auto-generated method stub
		this.quantity=quantity2;
	}

	public void setCart(Cart cart2) {
		// TODO Auto-generated method stub
		this.cart=cart2;
	}

	@SuppressWarnings("unchecked")
	public void setIngredients(Object ingredients2) {
		// TODO Auto-generated method stub
		this.ingredients = (List<String>) ingredients2;
	}

	public void setTotalPrice(int i) {
		// TODO Auto-generated method stub
		this.totalPrice=(long) i;
	}

	public Object getIngredients() {
		// TODO Auto-generated method stub
		return ingredients;
	}
	
    
   
}

