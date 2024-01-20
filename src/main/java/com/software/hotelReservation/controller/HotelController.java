package com.software.hotelReservation.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.software.hotelReservation.dto.response.HotelGetAllResponseDto;
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

}
