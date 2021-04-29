package ucuncugunOdev2;

public class InstructorManager extends UserManager {
	
	public void addInstructorCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli eðitmen "+ instructor.getCourses()+  " adlý kursunu ekledi.");
	}
	public void deleteInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli eðitmen "+ instructor.getCourses()+  " adlý kursunu sildi.");
	}

	public void updateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli eðitmen "+ instructor.getCourses()+  " adlý kursunu güncelledi.");
	}

}
