package com.cuvette.bankingApplication.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cuvette.bankingApplication.models.Branch;
import com.cuvette.bankingApplication.models.Service;
import com.cuvette.bankingApplication.repository.DataRepository;

@org.springframework.stereotype.Service
public class BankService {
	
	 @Autowired
	    private DataRepository repository;

	    public String getBankName() {
	        return repository.getBankName();
	    }

	    public List<Branch> getBranches() {
	        return repository.getBranches();
	    }

	    public List<Service> getServices() {
	        return repository.getServices();
	    }

}
