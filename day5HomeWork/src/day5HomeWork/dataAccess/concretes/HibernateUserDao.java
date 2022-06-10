package day5HomeWork.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5HomeWork.dataAccess.abstracts.UserDao;
import day5HomeWork.entites.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users;
	
	public HibernateUserDao() {
		this.users= new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		this.users.add(user);
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(this.users.indexOf(user));
		
		
	}

	@Override
	public void update(User user) {
		int index = this.users.indexOf(user);
		this.users.remove(this.users.indexOf(user));
		this.users.add(index, user);
		
	}

	@Override
	public User getUser(int id) {
		return this.users.get(id);
		
	}

	@Override
	public List<User> getAll() {
	
		return  this.users;
	}

	@Override
	public void verificateUser(User user) {
		
		int index = this.users.indexOf(user);
		
		User verificate=  getUser(index);
		verificate.setVerification(true);
		
	}

}
