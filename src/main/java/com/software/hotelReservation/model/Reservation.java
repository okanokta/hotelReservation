package com.software.hotelReservation.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reservation_id")
	private Long reservationId;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne()
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne()
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	
	@OneToMany(mappedBy = "reservation")
	private List<Room> rooms;
	
	@OneToOne(mappedBy = "reservation",cascade = CascadeType.ALL)
	private Payment payment;

}
