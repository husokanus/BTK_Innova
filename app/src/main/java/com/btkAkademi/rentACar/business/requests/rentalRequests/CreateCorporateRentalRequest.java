package com.btkAkademi.rentACar.business.requests.rentalRequests;

import java.time.LocalDate;

import com.btkAkademi.rentACar.business.requests.IRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCorporateRentalRequest implements IRequest
{
	private LocalDate rentDate;	
	private int rentedKilometer;	
	
	private int rentedCityId;
	private int returnedCityId;
	
	private String code;
	private int customerId;
	private int carId;
}
