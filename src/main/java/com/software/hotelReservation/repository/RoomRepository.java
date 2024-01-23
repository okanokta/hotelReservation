package com.software.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.hotelReservation.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
