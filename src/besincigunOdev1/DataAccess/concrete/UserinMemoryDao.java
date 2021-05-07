package besincigunOdev1.DataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import besincigunOdev1.DataAccess.abstracts.UserDao;
import besincigunOdev1.Entities.Concretes.User;

public class UserinMemoryDao implements UserDao {
	
	private List<User> users = new ArrayList<User>();

	public UserinMemoryDao() {

		User user1 = new User(1,"Sercan1","Evyapan1","sevyapan1@gmail.com","123456",true);
		User user2 = new User(2,"Sercan2","Evyapan2","sevyapan2@gmail.com","1234567",true);
		
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {
		System.out.println("Log in memory: " + user.getEmail());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		User userToUpdate =users.stream()
				.filter(u->u.getId()==user.getId())
				.findFirst()
				.orElse(null);
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerified(user.isVerified());
		
	}

	@Override
	public void delete(int userId) {
		User customerToDelete =users.stream()
				.filter(u->u.getId()==userId)
				.findFirst()
				.orElse(null);
		
		users.remove(customerToDelete);
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User get(String email) {
		User user =users.stream()
				.filter(u->u.getEmail()==email)
				.findFirst()
				.orElse(null);
		return user;
	}
	
}
