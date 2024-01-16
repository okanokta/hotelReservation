package com.software.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.hotelReservation.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
