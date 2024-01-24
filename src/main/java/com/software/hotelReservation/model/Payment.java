package com.software.hotelReservation.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="hotel")

public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="payment_date")
	private LocalDate paymentDate;
	
	@Column(name="amount")
	private double amount;
	
	@OneToOne()
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToOne()
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	

}
