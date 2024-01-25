package com.software.hotelReservation.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.software.hotelReservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	List<Reservation> findByHotelIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
	        Long hotelId, LocalDate endDate, LocalDate startDate
	    );

}
