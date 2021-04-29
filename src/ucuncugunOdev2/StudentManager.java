package ucuncugunOdev2;

public class StudentManager extends UserManager {
	
	public void addCourse(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " isimli öğrenci "+ student.getCourses()+  " adlı kursu ekledi.");
	}
	public void deleteCourse(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " isimli öğrenci"+ student.getCourses()+  " adlı kursu sildi.");
	}

}
