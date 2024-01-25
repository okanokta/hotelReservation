package com.software.hotelReservation.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.software.hotelReservation.dto.requestDto.RoomSaveRequestDto;
import com.software.hotelReservation.dto.requestDto.RoomUpdateRequestDto;
import com.software.hotelReservation.dto.responseDto.RoomGetAllResponseDto;
import com.software.hotelReservation.model.Room;
import com.software.hotelReservation.repository.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomService {
	private final RoomRepository roomRepository;
	private final ModelMapper modelMapper;
	
	public List<RoomGetAllResponseDto> getAll() {
		List<Room> allRoom = roomRepository.findAll();
	       return allRoom.stream()
	                .map(room -> modelMapper.map(room, RoomGetAllResponseDto.class))
	                .toList();
	}

	public Boolean saveRoom(RoomSaveRequestDto roomSaveRequestDto) {
		modelMapper.getConfiguration()
		.setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
		Room room = modelMapper.map(roomSaveRequestDto, Room.class);
		roomRepository.save(room);
		return true;
		
	}

	public Boolean updateRoom(RoomUpdateRequestDto roomUpdateRequestDto) {
		Room existingHotel = roomRepository.findById(roomUpdateRequestDto.getRoomId())
	            .orElseThrow(() -> new RuntimeException("Hotel not found with id: " + roomUpdateRequestDto.getRoomId()));

	    // Assuming hotelName is the only field you want to update
	    existingHotel.setPrice(roomUpdateRequestDto.getPrice());

	    roomRepository.save(existingHotel);
	    return true;

	}

	public Boolean deleteRoom(Long id) {
		this.roomRepository.deleteById(id);
		return true;
	}

	
}
