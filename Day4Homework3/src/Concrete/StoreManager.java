package Concrete;

import Abstract.StoreService;
import Entities.Campain;
import Entities.Person;

public class StoreManager implements StoreService {

	@Override
	public void sell(Campain campain, Person person,int selectIndex) {
		
		person.setGames(campain.getGames().get(selectIndex));
		
	}

}
