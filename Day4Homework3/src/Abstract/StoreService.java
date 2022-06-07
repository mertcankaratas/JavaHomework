package Abstract;

import Entities.Campain;
import Entities.Game;
import Entities.Person;

public interface StoreService {
	void sell(Campain campain, Person person,int selectIndex);
}
