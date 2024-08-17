package com.DeliciousFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DeliciousFood.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
