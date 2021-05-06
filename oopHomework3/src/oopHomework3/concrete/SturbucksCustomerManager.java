package oopHomework3.concrete;

import oopHomework3.abstracts.BaseCustomerManager;
import oopHomework3.abstracts.ICustomerCheckService;
import oopHomework3.entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService customerCheckService;
	
	public SturbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " not found ");
		}
	}

}
