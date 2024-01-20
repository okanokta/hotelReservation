package com.software.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.software.hotelReservation.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
