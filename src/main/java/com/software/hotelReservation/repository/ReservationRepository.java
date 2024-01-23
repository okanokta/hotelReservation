package com.software.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.hotelReservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
