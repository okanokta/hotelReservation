package com.software.hotelReservation.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.software.hotelReservation.dto.requestDto.RoomSaveRequestDto;
import com.software.hotelReservation.model.Room;
import com.software.hotelReservation.repository.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomService {
	private final RoomRepository roomRepository;
	private final ModelMapper modelMapper;

	public Boolean saveRoom(RoomSaveRequestDto roomSaveRequestDto) {
		Room room = modelMapper.map(roomSaveRequestDto, Room.class);
		roomRepository.save(room);
		return true;
	}
	
	
}
