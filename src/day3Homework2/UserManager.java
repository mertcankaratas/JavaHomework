package day3Homework2;

public class UserManager{
	public void addComment(User user,String message) {
		System.out.println(user.firstName+ " "+user.lastName + " : " + message);
	}
	public void nextSection() {
		System.out.println("Bitir  ve Devam et");
	}
	
	public void previousSection() {
		System.out.println("Önceki Ders");
	}
	
	public void login(String email,String password) {
		System.out.println("Login Yapýldý.");
	}
	
	public void logout() {
		System.out.println("Çýkýþ yapýldý.");
	}
	
	public void register(User user) {
		System.out.println("Kayýt olundu");
	}
	
	public void courseList() {
		System.out.println("Dersler Listelendi");
	}
	
	public void subscribeLesson() {
		System.out.println("Derse kayýt olundu");
	}
}
