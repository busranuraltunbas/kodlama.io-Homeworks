package gameManagement;

import gameManagement.Adapter.CustomerManagerAdapter;
import gameManagement.Concrete.CampaignManager;
import gameManagement.Concrete.CustomerManager;
import gameManagement.Concrete.GameManager;
import gameManagement.Concrete.SaleManager;
import gameManagement.Entites.Campaign;
import gameManagement.Entites.Customer;
import gameManagement.Entites.Game;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1, "Büþra Nur", "Korkut", 1995, "1000398004", "busrakorkut");
		Customer customer2 = new Customer(2, "Gizem", "Altunbas", 1998, "2155222", "gizemaltunbas");
		
		Game game1 = new Game(100, "CS", 100);
		Game game2 = new Game(101, "Mario", 150);
		
		CustomerManager customerManager = new CustomerManager(new CustomerManagerAdapter());
		
		customerManager.add(customer1);
		customerManager.add(customer2);
		
		System.out.println("-----------------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		GameManager gameManager2 = new GameManager();
		gameManager2.add(game2);
		
		System.out.println("-----------------------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(customer1, game1);
		
		System.out.println("-----------------------------------------");
		
		Campaign campaign1 = new Campaign(200, game2.getId(), "Black Friday",game2.getPrice(), 25);
		Campaign campaign2 = new Campaign(200, game2.getId(), "Winter Campaign",game2.getPrice(), 50);
		CampaignManager manager =  new CampaignManager();
		manager.add(campaign1);
		
		manager.update(campaign2);
		
		
		
		
		
		
		

	}

}
