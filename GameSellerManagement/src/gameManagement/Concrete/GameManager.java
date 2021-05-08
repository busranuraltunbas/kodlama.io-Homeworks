package gameManagement.Concrete;

import gameManagement.Abstract.GameService;
import gameManagement.Entites.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Added " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Deleted " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated " + game.getName());
		
	}

}
