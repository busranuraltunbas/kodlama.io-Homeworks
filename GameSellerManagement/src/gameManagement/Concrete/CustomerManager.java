package gameManagement.Concrete;

import gameManagement.Abstract.CustomerCheckService;
import gameManagement.Abstract.CustomerService;
import gameManagement.Entites.Customer;

public class CustomerManager implements CustomerService{
	private CustomerCheckService customerCheckServis;
	

	public CustomerManager(CustomerCheckService customerCheckServis) {
		this.customerCheckServis = customerCheckServis;
	}
	

	@Override
	public void add(Customer customer) {
		if(customerCheckServis.checkIfRealPerson(customer)) {
			
			System.out.println("Save to db " + customer.getFirstName() + " " + customer.getLastName());
			
		}
		else {
			System.out.println("Not found " + customer.getFirstName() + " " + customer.getLastName());
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Delete from db " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Update " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
