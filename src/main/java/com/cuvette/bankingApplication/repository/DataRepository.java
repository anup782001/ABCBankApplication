package com.cuvette.bankingApplication.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cuvette.bankingApplication.models.Branch;
import com.cuvette.bankingApplication.models.Service;

@Repository
public class DataRepository {
	
	String bankName = "ABC Bank" ;
	
	public String getBankName() {
        return bankName;
    }

    public List<Branch> getBranches() {
		
    	return Arrays.asList(
    		    new Branch(bankName+" - MG Road", "No. 45, MG Road, Bangalore", "560001",
    		            "080-26543210", " ABC0001234"),
    		    new Branch(bankName+" - Whitefield", " - No. 67, Whitefield Main Road, Bangalore", "560066",
    		            "080-26456789", "ABC0004567"),
    		    new Branch(bankName+" - Indiranagar", "No. 10, 100 Feet Road, Indiranagar, Bangalore", "560038",
    		            "080-25298765", "ABC0007890"),
    		    new Branch(bankName+" - Koramangala", "No. 5, Koramangala 6th Block, Bangalore", "560095",
    		            "080-25987654", "ABC0001122"),
    		    new Branch(bankName+" - Jayanagar", "No. 22, 4th Block, Jayanagar, Bangalore", "560041",
    		            "080-26546789", "ABC0003345"),
    		    new Branch(bankName+" - Electronic City", "No. 12, Hosur Road, Electronic City, Bangalore", "560100",
    		            "080-27123456", "ABC0005566"),
    		    new Branch(bankName+" - Rajajinagar", "No. 55, 2nd Block, Rajajinagar, Bangalore", "560010",
    		            "080-23234567", "ABC0007788"),
    		    new Branch(bankName+" - Hebbal", "No. 30, Outer Ring Road, Hebbal, Bangalore", "560024",
    		            "080-22876543", "ABC0009900"),
    		    new Branch(bankName+ " - Banashankari", "No. 14, Banashankari 2nd Stage, Bangalore", "560070",
    		            "080-26789012", "ABC0012345"),
    		    new Branch(bankName+" - JP Nagar", "No. 88, 15th Cross, JP Nagar 3rd Phase, Bangalore", "560078",
    		            "080-26432109", "ABC0005678")
    		);

    }

    public List<Service> getServices() {
        return Arrays.asList(
            new Service("Loans", "Providing home, personal, and business loans."),
            new Service("Accounts", "Saving and current account management."),
            new Service("Credit Cards", "Wide range of credit cards with rewards."),
            new Service("Investments", "Mutual funds, fixed deposits, and more."),
            new Service("Insurance", "Life, health, and general insurance services.")
        );
    }

}
