package com.software.hotelReservation.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.software.hotelReservation.dto.requestDto.PaymentSaveRequestDto;
import com.software.hotelReservation.model.Payment;
import com.software.hotelReservation.repository.PaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {
	
	private final PaymentRepository paymentRepository;
	private final ModelMapper modelMapper;
	
	public Boolean savePayment(PaymentSaveRequestDto paymentSaveRequestDto) {
		modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.STANDARD);
		Payment payment = this.modelMapper.map(paymentSaveRequestDto, Payment.class);
		this.paymentRepository.save(payment);
		return true;
	}

}
