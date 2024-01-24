package com.software.hotelReservation.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.software.hotelReservation.dto.requestDto.CustomerSaveRequestDto;
import com.software.hotelReservation.dto.responseDto.CustomerGetAllResponseDto;
import com.software.hotelReservation.model.Customer;
import com.software.hotelReservation.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	private final CustomerRepository customerRepository;
	private final ModelMapper modelMapper;
	
	public List<CustomerGetAllResponseDto> getAllCustomer() {
		List<Customer> allCustomer = customerRepository.findAll();
		return allCustomer
				.stream()
				.map(customer -> modelMapper.map(customer, CustomerGetAllResponseDto.class))
				.toList();
	}

	public Boolean saveCustomer(CustomerSaveRequestDto customerSaveRequestDto) {
		Customer customer = modelMapper.map(customerSaveRequestDto, Customer.class);
		customerRepository.save(customer);
		return true;
		
	}

	

}
