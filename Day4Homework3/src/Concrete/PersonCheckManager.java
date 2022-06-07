package Concrete;

import Abstract.PersonCheckService;
import Entities.Person;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Person person) {
		if(person.getNationalIdentity().length() ==11) {
			return true;
		}
		return false;
	}

}
