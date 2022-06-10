package day5HomeWork.business.concretes;

import day5HomeWork.business.abstracts.LoginService;
import day5HomeWork.dataAccess.abstracts.UserDao;
import day5HomeWork.entites.concretes.User;


public class LoginManager implements LoginService {

	private UserDao userDao;
	
	public LoginManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	
	@Override
	public void login(String email, String password) {
		for(User user : this.userDao.getAll()) {
			if(user.getEmail().equals(email)&&user.getPassword().equals(password)&&user.getVerification()) {
				System.out.println("Giriþ baþarýlý bir þekilde gerçekleþtirilmiþtir.");
				return;
			}
			
		}
		System.out.println("Email ve Parolanýzý kontrol ediniz ve hesabýnýz onayladýðýnýzdan emin olunuz");
		
		
	}

}
