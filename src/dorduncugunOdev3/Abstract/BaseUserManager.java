package dorduncugunOdev3.Abstract;

import dorduncugunOdev3.Entities.User;

public abstract class BaseUserManager implements UserService {
	
	@Override
	public void signIn(User user) {
		System.out.println("Kullan�c� giri� yapt�: " + user.getFirstName());
	}
	
	@Override
	public void register(User user) {
		System.out.println("Kullan�c� kay�t oldu: " + user.getFirstName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.getFirstName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: " + user.getFirstName());
	}
	
	

}
