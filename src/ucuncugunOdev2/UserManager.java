package ucuncugunOdev2;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " adl� ki�i kay�t edildi.");
	}
	public void deleteUser(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " adl� ki�i silindi.");
	}

	public void updateUser(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " adl� ki�i g�ncellendi.");
	}


}
