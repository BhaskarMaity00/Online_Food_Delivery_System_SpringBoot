package com.DeliciousFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DeliciousFood.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
