package oopHomework3.concrete;

import oopHomework3.abstracts.ICustomerCheckService;
import oopHomework3.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
