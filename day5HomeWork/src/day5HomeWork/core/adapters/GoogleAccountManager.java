package day5HomeWork.core.adapters;

import googleAccount.GoogleAccount;

public class GoogleAccountManager implements GoogleAccountService {

	@Override
	public void googleRegister(String email) {
		GoogleAccount googleAccount = new GoogleAccount();
		googleAccount.register(email);
		
	}

	@Override
	public void googleLogin(String email, String password) {
		GoogleAccount googleAccount = new GoogleAccount();
		googleAccount.logIn(email,password);
		
	}

}
