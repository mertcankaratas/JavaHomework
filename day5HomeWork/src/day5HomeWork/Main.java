package day5HomeWork;

import day5HomeWork.business.concretes.LoginManager;
import day5HomeWork.business.concretes.UserManager;
import day5HomeWork.core.adapters.GoogleAccountManager;
import day5HomeWork.dataAccess.concretes.HibernateUserDao;
import day5HomeWork.entites.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		HibernateUserDao hibernaterDao = new HibernateUserDao();
		UserManager userManager = new UserManager(hibernaterDao, new GoogleAccountManager());
		
		User user = new User(1,"Mertcan","Karataþ","mertcan@gmail.com","123456789");
		userManager.add(user);
		
		LoginManager loginManager = new LoginManager(hibernaterDao);
		loginManager.login(user.getEmail(), user.getPassword());
		
		userManager.verificateUser(user);
		loginManager.login(user.getEmail(), user.getPassword());
	}

}
