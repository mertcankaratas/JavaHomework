package day3Homework2;

public class Instructor extends User {
	
	Course[] lessonsTaught;
	public Instructor(int id, String nationalIdentity, String firstName, String lastName, int age, String email,
			String password, String imagePath) {
		super(id, nationalIdentity, firstName, lastName, age, email, password, imagePath);
		// TODO Auto-generated constructor stub
	}
	public Course[] getLessonsTaught() {
		return lessonsTaught;
	}
	public void setLessonsTaught(Course[] lessonsTaught) {
		this.lessonsTaught = lessonsTaught;
	}
	
}
