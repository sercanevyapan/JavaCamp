package besincigunOdev1.Business.concretes;

import java.util.List;

import besincigunOdev1.Business.abstracts.UserService;
import besincigunOdev1.Core.EmailServices;
import besincigunOdev1.DataAccess.abstracts.UserDao;
import besincigunOdev1.Entities.Concretes.User;


public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailServices emailService;
	
	public UserManager(UserDao userDao,EmailServices emailService) {
		this.userDao=userDao;
		this.emailService = emailService;
	}

	@Override
	public void add(User user) {
		if(userValidate(user)) {
			userDao.add(user);
			emailService.send(user.getEmail(), "Kayýt oldunuz");
		}
		
		
	}
	
	@Override
	public void add(String email) {
		User user =new User();
		user.setEmail(email);
		userDao.add(user);
		System.out.println("Log2: " + user.getEmail());
		emailService.send(email,"Kayýt oldunuz.");
		
	}


	@Override
	public void update(User user) {
		if(userValidate(user)) {
			userDao.update(user);
			
		}
		
	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);
		
	}

	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getId() +" "+ user.getEmail() +" "+ user.getFullName());
		}
		return userDao.getAll();
		
	}

	@Override
	public User get(String email) {
		
		return userDao.get(email);
	}
	
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}
		System.out.println("Ad ve soyad 2 karakterden az olamaz");
		return false;
	}


}
