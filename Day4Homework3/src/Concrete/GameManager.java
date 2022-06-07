package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	private List<Game> games;
	
	public GameManager() {
		
		this.games = new ArrayList<Game>();
	}

	@Override
	public void add(Game game) {
		games.add(game);
		
	}

	@Override
	public void delete(Game game) {
		games.remove(games.indexOf(game));
		
	}

	@Override
	public void update(Game oldGame, Game newGame) {
		int index = games.indexOf(oldGame);
		games.remove(games.indexOf(oldGame));
		games.add(index,newGame);
		
		
	}

	@Override
	public void getGames() {
		for(Game game :games) {
			System.out.println(game.getGameName());
		}
		
	}

}
