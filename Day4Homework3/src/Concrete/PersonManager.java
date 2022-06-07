package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.PersonCheckService;
import Abstract.PersonService;
import Entities.Person;

public class PersonManager implements PersonService {

	
	private List<Person> persons;
	
	private PersonCheckService personCheckService;
	public PersonManager(PersonCheckService personCheckService) {
		
		this.persons = new ArrayList<Person>();
		this.personCheckService = personCheckService;
	}

	@Override
	public void add(Person person) {
		if(personCheckService.checkIfRealPerson(person)) {
			
			persons.add(person);
			System.out.println(person.getFirstName() +" Kullanýcý sisteme eklendi" );
		}
		
	}

	@Override
	public void update(Person oldPerson,Person newPerson) {
		int index = persons.indexOf(oldPerson);
		persons.remove(persons.indexOf(oldPerson));
		persons.add(index, newPerson);
	}

	@Override
	public void delete(Person person) {
		persons.remove(persons.indexOf(person));
		
	}
	
	@Override
	public void getPersons() {
		for(Person person :persons) {
			System.out.println(person.getFirstName());
		}
	}

}
