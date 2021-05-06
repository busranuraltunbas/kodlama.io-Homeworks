package oopHomework3.abstracts;

import oopHomework3.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db " + customer.getFirstName());
	}

}
