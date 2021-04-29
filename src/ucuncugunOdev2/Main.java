package ucuncugunOdev2;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.setId(1);
		student1.setFirstName("Sercan");
		student1.setLastName("Evyapan");
		student1.setEmail("sevyapan@gmail.com");
		student1.setUserImage("image.jpg");
		student1.setCourses("Java");

		System.out.println("Öğrenci adı: " + student1.getFirstName());
		System.out.println("Öğrenci soyadı: " + student1.getLastName());
		System.out.println("Öğrenci email adresi: " + student1.getEmail());
		System.out.println("Öğrenci profil fotoğrafı:" + student1.getUserImage());
		System.out.println("Öğrenci kursu: " + student1.getCourses());

		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student1);
		studentManager.addCourse(student1);

		Instructor instructor1 = new Instructor();

		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setUserImage("image.jpg");
		instructor1.setCourses("Java");

		System.out.println("Eğitmen adı: " + instructor1.getFirstName());
		System.out.println("Eğitmen soyadı: " + instructor1.getLastName());
		System.out.println("Eğitmen email adresi: " + instructor1.getEmail());
		System.out.println("Eğitmen profil fotoğrafı:" + instructor1.getUserImage());
		System.out.println("Eğitmen kursu: " + instructor1.getCourses());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.deleteInstructor(instructor1);

	}

}
