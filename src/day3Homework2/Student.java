package day3Homework2;

public class Student extends User {
	
	Course[] lessons;
	public Student(int id, String nationalIdentity, String firstName, String lastName, int age, String email,
			String password, String imagePath) {
		super(id, nationalIdentity, firstName, lastName, age, email, password, imagePath);
	}
	public Course[] getLessons() {
		return lessons;
	}
	public void setLessons(Course[] lessons) {
		this.lessons = lessons;
	}
	
}
