package com.software.hotelReservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="room_id")
	private Long roomId;
	
	@Column(name="room_number")
	private int roomNumber;
	
	@Column(name="room_type")
	private String roomType;
	
	@Column(name="price")
	private int price;
	
	@ManyToOne()
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	
	@ManyToOne()
	@JoinColumn(name="reservation_id")
	private Reservation reservation;
}
