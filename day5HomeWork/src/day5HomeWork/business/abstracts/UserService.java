package day5HomeWork.business.abstracts;

import java.util.List;

import day5HomeWork.entites.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getUser(int id);
	List<User> getAll();
	void verificateUser(User user);
	
}
