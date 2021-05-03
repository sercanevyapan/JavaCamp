package dorduncugunOdev3.Abstract;

import dorduncugunOdev3.Entities.User;

public abstract class BaseUserManager implements UserService {
	
	@Override
	public void signIn(User user) {
		System.out.println("Kullanýcý giriþ yaptý: " + user.getFirstName());
	}
	
	@Override
	public void register(User user) {
		System.out.println("Kullanýcý kayýt oldu: " + user.getFirstName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getFirstName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getFirstName());
	}
	
	

}
