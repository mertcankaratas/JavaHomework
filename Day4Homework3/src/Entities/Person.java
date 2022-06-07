package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import Abstract.Entity;

public class Person implements Entity {
	private int personId;
	private String firstName;
	private String lastName;
	private Date birthYear;
	private String nationalIdentity;
	private List<Game> games;
	public Person(int personId, String firstName, String lastName, Date birthYear, String nationalIdentity) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalIdentity = nationalIdentity;
		this.games = new LinkedList<Game>()	;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(Game game) {
		this.games.add(game);
	}
	
	
	
	
	
	
}
