package com.btkAkademi.rentACar.business.abstracts;

import com.btkAkademi.rentACar.business.requests.individualCustomerRequests.CreateIndividualCustomerRequest;
import com.btkAkademi.rentACar.core.utilities.results.DataResult;
import com.btkAkademi.rentACar.core.utilities.results.Result;
import com.btkAkademi.rentACar.entities.concretes.IndividualCustomer;

public interface IndividualCustomerService {
	
	Result addIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomer);
	
	DataResult<IndividualCustomer> getById(int id);
}
