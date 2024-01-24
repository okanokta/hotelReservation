package com.software.hotelReservation.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.software.hotelReservation.dto.requestDto.CustomerSaveRequestDto;
import com.software.hotelReservation.dto.responseDto.CustomerGetAllResponseDto;
import com.software.hotelReservation.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
	private final CustomerService customerService;
	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<CustomerGetAllResponseDto>> getAllCustomer(){
		List<CustomerGetAllResponseDto> allCustomer = customerService.getAllCustomer();
		return new ResponseEntity<>(allCustomer,HttpStatus.OK);
	}
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Boolean> saveCustomer(@RequestBody CustomerSaveRequestDto customerSaveRequestDto){
		Boolean isSaveCustomer = customerService.saveCustomer(customerSaveRequestDto);
		return new ResponseEntity<>(isSaveCustomer,HttpStatus.OK);
	}

}
