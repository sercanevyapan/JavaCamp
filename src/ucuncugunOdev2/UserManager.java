package ucuncugunOdev2;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " adlý kiþi kayýt edildi.");
	}
	public void deleteUser(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " adlý kiþi silindi.");
	}

	public void updateUser(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " adlý kiþi güncellendi.");
	}


}
