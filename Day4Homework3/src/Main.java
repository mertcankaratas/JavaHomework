import java.time.LocalDate;
import java.util.Date;

import Concrete.CampainManager;
import Concrete.GameManager;
import Concrete.PersonCheckManager;
import Concrete.PersonManager;
import Concrete.StoreManager;
import Entities.Campain;
import Entities.Game;
import Entities.Person;

public class Main {

	public static void main(String[] args) {
		PersonManager personManager = new PersonManager(new PersonCheckManager());
	
		Person person = new Person(1,"Mertcan","Karataþ",new Date(1997),"11111111111");
		Person person2 = new Person(2,"can","Karataþ",new Date(1997),"11111111111");
		Person person3 = new Person(3,"ali","Karataþ",new Date(1997),"11111111111");
		
		personManager.add(person);
		personManager.add(person2);
		personManager.getPersons();
		//personManager.getPersons();
		//personManager.delete(person2);
		System.out.println("after update");
		personManager.update(person, person3);
		
		personManager.getPersons();
		
		// Game
		
		GameManager gameManager = new GameManager();
		
		Game game = new Game(1,"Nba2k 22","Basketbol",125);
		Game game2 = new Game(2,"Fifa 22","Futbol",115);
		Game game3 = new Game(3,"Call of duty","Savaþ",225);
		
		gameManager.add(game);
		gameManager.add(game2);
		gameManager.add(game3);
		System.out.println("Game list");
		gameManager.getGames();
		
		
		
		person.setGames(game);
		person.setGames(game2);
		person.setGames(game3);
		
		//System.out.println("Person get game name");
		//System.out.println(person.getGames().get(0).getGameName());
		
		
		// campain
		
		Campain campain = new Campain(1,"Summer",LocalDate.of(2022, 06, 10),LocalDate.of(2022, 06, 17));
		Campain campain2= new Campain(2,"autumn",LocalDate.of(2022,10,17),LocalDate.of(2022,10,17));
		
		
		campain.setGames(game);
		campain.setGames(game2);
		campain.setGames(game3);
		CampainManager campainManager = new CampainManager();
		campainManager.add(campain2);
		
		
		// store
		
		System.out.println("Store buy Game ");
		StoreManager storeManager = new StoreManager();
		
		storeManager.sell(campain, person3,1);
		storeManager.sell(campain, person3,2);
		
		for(Game gameElement : person3.getGames()) {
			System.out.println(gameElement.getGameName());
		}
		
		
		
	}

}
