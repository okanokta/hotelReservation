package com.software.hotelReservation.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.software.hotelReservation.dto.requestDto.RoomSaveRequestDto;
import com.software.hotelReservation.dto.requestDto.RoomUpdateRequestDto;
import com.software.hotelReservation.dto.responseDto.RoomGetAllResponseDto;
import com.software.hotelReservation.service.RoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {
	private final RoomService roomService;
	
	@GetMapping("/getAllRoom")
	public ResponseEntity<List<RoomGetAllResponseDto>> getAllRoom(){
		List<RoomGetAllResponseDto> allRoom = roomService.getAll();
		return new ResponseEntity<>(allRoom, HttpStatus.OK);
		
	}
	
	@PostMapping("/saveRoom")
	public ResponseEntity<Boolean> saveRoom(@RequestBody() RoomSaveRequestDto roomSaveRequestDto) {
		Boolean isSaveRoom = roomService.saveRoom(roomSaveRequestDto);
		return new ResponseEntity<>(isSaveRoom, HttpStatus.OK);
	}
	
	@PutMapping("/updateRoom")
	public ResponseEntity<Boolean> updateRoom(@RequestBody() RoomUpdateRequestDto roomUpdateRequestDto){
		Boolean isUpdateRoom = roomService.updateRoom(roomUpdateRequestDto);
		return new ResponseEntity<>(isUpdateRoom, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteRoom(@PathVariable() Long id){
		Boolean isDeleteRoom = roomService.deleteRoom(id);
		return new ResponseEntity<>(isDeleteRoom, HttpStatus.OK);
	}
}
