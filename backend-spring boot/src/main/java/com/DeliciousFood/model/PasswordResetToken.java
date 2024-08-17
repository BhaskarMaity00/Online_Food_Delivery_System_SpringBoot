package com.DeliciousFood.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class PasswordResetToken {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private @NonNull String token;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	private @NonNull User user;
	
	private @NonNull  Date expiryDate;
	
	public PasswordResetToken(String resetToken, User user2, Date expiryDate2) {
		// TODO Auto-generated constructor stub
		this.token=resetToken;
		this.user=user2;
		this.expiryDate=expiryDate2;
	}

	public boolean isExpired() {
        return expiryDate.before(new Date());
    }

	public User getUser() {
		// TODO Auto-generated method stub
		return user;
	}

}
