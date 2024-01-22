package com.software.hotelReservation.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="hotel")
@Data
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="address")
	private String address;
	
	@OneToMany(mappedBy = "hotel")
	private List<Room> rooms;
}
