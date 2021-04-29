package ucuncugunOdev2;

public class InstructorManager extends UserManager {
	
	public void addInstructorCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli e�itmen "+ instructor.getCourses()+  " adl� kursunu ekledi.");
	}
	public void deleteInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli e�itmen "+ instructor.getCourses()+  " adl� kursunu sildi.");
	}

	public void updateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli e�itmen "+ instructor.getCourses()+  " adl� kursunu g�ncelledi.");
	}

}
