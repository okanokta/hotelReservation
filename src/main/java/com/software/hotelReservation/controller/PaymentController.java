package com.software.hotelReservation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.software.hotelReservation.dto.requestDto.PaymentSaveRequestDto;
import com.software.hotelReservation.service.PaymentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {
	private final PaymentService paymentService;
	
	@PostMapping("/savePayment")
	public ResponseEntity<Boolean> savePayment(PaymentSaveRequestDto paymentSaveRequestDto){
		Boolean isSavePayment = paymentService.savePayment(paymentSaveRequestDto);
		return new ResponseEntity<>(isSavePayment,HttpStatus.OK);
	}

}
