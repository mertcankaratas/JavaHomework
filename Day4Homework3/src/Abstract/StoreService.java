package Abstract;

import Entities.Campain;
import Entities.Person;

public interface StoreService {
	void sell(Campain campain, Person person,int selectIndex);
}
