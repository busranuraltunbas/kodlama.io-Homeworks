package gameManagement.Concrete;

import gameManagement.Abstract.SaleService;
import gameManagement.Entites.Customer;
import gameManagement.Entites.Game;

public class SaleManager implements SaleService{

	@Override
	public void sale(Customer customer, Game game) {
		System.out.println(game.getName() + " purchased to " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
