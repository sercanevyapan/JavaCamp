package besincigunOdev1.Business.concretes;


import besincigunOdev1.Business.abstracts.AuthService;
import besincigunOdev1.Business.abstracts.UserService;
import besincigunOdev1.Entities.Concretes.LoginDto;
import besincigunOdev1.Entities.Concretes.User;


public class AuthManager implements AuthService {
	
	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		
		if(userValidate(user) && passwordValidate(user.getPassword())&& !userExists(user.getEmail())) {
			
			userService.add(user);
		}else {
			System.out.println("Kay�t ba�ar�s�z");
		}
		
		
	}

	@Override
	public void verify(User user, String token) {
		
		if(user!=null && token.length()>15) {
			User existUser = userService.get(user.getEmail());
			existUser.setVerified(true);
			
			userService.update(existUser);
			System.out.println("Email do�ruland�");
			
		}else {
			System.out.println("Email do�rulanamad�");
		}
	}
	
	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());
		if(user!=null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Ba�ar�yla giri� yapt�n�z.");
		}else {
			System.out.println("Kullan�c� ad� veya �ifren yanl��.");
		}
		
		
	}



	@Override
	public boolean userExists(String email) {
		
		User user=userService.get(email);
		
		if(user==null) {
			return false;
		}else {
			System.out.println("Email zaten mevcut."+email);
			return true;
		}
		
	}

	
	public boolean userValidate(User user) {
		
		if(user!=null && !user.getFirstName().isEmpty()&& !user.getLastName().isEmpty() &&!user.getEmail().isEmpty()&&!user.getPassword().isEmpty() ) {
			return true;
		}
		System.out.println("Bo� alanlar� giriniz.");
		return false;
	}

	public boolean passwordValidate(String password) {
		if(password.length()>=6) {
			return true;
		}
		System.out.println("�ifreniz 6 karakterden az olamaz.");
		return false;
	}



}
