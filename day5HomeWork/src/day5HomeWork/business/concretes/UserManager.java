package day5HomeWork.business.concretes;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import day5HomeWork.business.abstracts.UserService;
import day5HomeWork.core.Mail;
import day5HomeWork.core.adapters.GoogleAccountService;
import day5HomeWork.dataAccess.abstracts.UserDao;
import day5HomeWork.entites.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	
	private GoogleAccountService googleAccountService;
	public UserManager(UserDao userDao,GoogleAccountService googleAccountService) {
		
		this.userDao = userDao;
		this.googleAccountService = googleAccountService;
	}

	@Override
	public void add(User user) {
		if(!checkIfUserExist(user.getEmail()) && emailCheck(user.getEmail()) && passwordCheck(user.getPassword()) && nameAndLastnameCheck(user.getName(), user.getLastName()) ) {
			Mail.sendMail(user.getEmail(), "123");
			userDao.add(user);
			
		}else {
			System.out.println("Kullanýcý bilgilerini kontrol ediniz.");
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
				userDao.update(user);
		
	}

	@Override
	public User getUser(int id) {

		return userDao.getUser(id);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	
	boolean checkIfUserExist(String email) {
		for(User user  : getAll()) {
			if(user.getEmail()==email) {
				return true;
			}
		}
		return false;
	}
	
	
	boolean emailCheck(String email) {
		
		String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher =pattern.matcher(email);
		return matcher.matches();
	}
	
	
	boolean passwordCheck(String password) {
		if(password.length()<6) {
			System.out.println("Parolanýz 6 karakterden oluþmalýdýr.");
			return false;
		}
		return  true;
	}
	
	boolean nameAndLastnameCheck(String name,String lastName) {
		
		if(name.length()<2|| lastName.length()<2) {
			return false;
		}
		return true;
	}

	@Override
	public void verificateUser(User user) {
		userDao.verificateUser(user);
		System.out.println("Kullanýcý baþarý ile doðrulandý artýk sisteme giriþ yapabilirsiniz");
		
	}

}
