package com.software.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.hotelReservation.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
