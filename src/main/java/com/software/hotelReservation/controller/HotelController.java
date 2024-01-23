package com.software.hotelReservation.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.software.hotelReservation.dto.requestDto.HotelSaveRequestDto;
import com.software.hotelReservation.dto.responseDto.HotelGetAllResponseDto;
import com.software.hotelReservation.service.HotelService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hotel")
public class HotelController {
	private final HotelService hotelService;
	
	@GetMapping("/getAllHotel")
	public ResponseEntity<List<HotelGetAllResponseDto>> getAllHotel(){
		List<HotelGetAllResponseDto> allHotel = hotelService.getAll();
		return new ResponseEntity<>(allHotel, HttpStatus.OK);
	}
	
	@PostMapping("/saveHotel")
	public ResponseEntity<Boolean> saveHotel(@RequestBody HotelSaveRequestDto hotelSaveRequestDto){
		Boolean isSaveHotel = hotelService.saveHotel(hotelSaveRequestDto);
		return new ResponseEntity<>(isSaveHotel,HttpStatus.OK);
		
	}

}
