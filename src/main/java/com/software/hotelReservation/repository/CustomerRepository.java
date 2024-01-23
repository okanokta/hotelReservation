package com.software.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.hotelReservation.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
