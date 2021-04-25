package ikincigünOdev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","image1","Engin Demiroð",50);
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","image2","Engin Demiroð",10);
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","image3","Engin Demiroð",60);
		
		Category category1 = new Category(1,"Tümü");
		Category category2 = new Category(2,"Programlama");
		
		Course[] courses = {course1,course2,course3};
		
		Category[] categories = {category1,category2};
		
		
		for (Course course : courses) {
			System.out.println(" Course Id: "+course.id+" Course Name: "+course.name+" Course Image: "+course.image+" Course Instructor Name: "+course.instructorName+" Course Percentage: "+course.percentage);
		}
		
		for (Category category : categories) {
			System.out.println(" Category Id: "+category.id+" Course Name: "+category.name);
		
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.AddComment(course1);
		courseManager.StartToCourse(course2);
		
		
		
	}

}
