package com.software.hotelReservation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.software.hotelReservation.dto.requestDto.RoomSaveRequestDto;
import com.software.hotelReservation.service.RoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/room")
public class RoomController {
	
	private final RoomService roomService;
	
	@PostMapping("/saveRoom")
	public ResponseEntity<Boolean> saveRoom(RoomSaveRequestDto roomSaveRequestDto){
		Boolean isSaveRoom = roomService.saveRoom(roomSaveRequestDto);
		return new ResponseEntity<>(isSaveRoom, HttpStatus.OK);
		
	}
	
	

}
