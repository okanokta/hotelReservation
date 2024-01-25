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

import com.software.hotelReservation.dto.requestDto.ReservationSaveRequestDto;
import com.software.hotelReservation.dto.requestDto.ReservationUpdateRequestDto;
import com.software.hotelReservation.dto.responseDto.ReservationGetAllResponseDto;
import com.software.hotelReservation.service.ReservationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {
	private final ReservationService reservationService;
	
	@GetMapping("/getAllReservation")
	public ResponseEntity<List<ReservationGetAllResponseDto>> getAllReservation(){
		List<ReservationGetAllResponseDto> allReservation = reservationService.getAll();
		return new ResponseEntity<>(allReservation, HttpStatus.OK);
	}
	
	@PostMapping("saveReservation")
	public ResponseEntity<Boolean> saveReservation(@RequestBody ReservationSaveRequestDto reservationRequestDto){
		Boolean isSaveReservation = reservationService.saveReservation(reservationRequestDto);
		return new ResponseEntity<>(isSaveReservation, HttpStatus.CREATED);
		
	}
	
	@PutMapping("updateReservation")
	public ResponseEntity<Boolean> updateReservation(@RequestBody() ReservationUpdateRequestDto reservationUpdateRequestDto){
		Boolean isUPdateReservation = reservationService.updateReservation(reservationUpdateRequestDto);
		return new ResponseEntity<>(isUPdateReservation,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteReservation(@PathVariable Long id){
		Boolean isDeleteReservation = reservationService.deleteReservation(id);
		return new ResponseEntity<>(isDeleteReservation,HttpStatus.OK);
	}

}
