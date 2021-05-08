package gameManagement.Concrete;

import gameManagement.Abstract.CustomerCheckService;
import gameManagement.Entites.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
