package Abstract;

import Entities.Person;

public interface PersonService {
	void add(Person person);
	void update(Person oldPerson,Person newPerson);
	void delete(Person person);
	void getPersons();
}
