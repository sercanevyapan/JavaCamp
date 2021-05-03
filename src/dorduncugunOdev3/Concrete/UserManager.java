package dorduncugunOdev3.Concrete;

import dorduncugunOdev3.Abstract.BaseUserManager;
import dorduncugunOdev3.Abstract.UserCheckService;
import dorduncugunOdev3.Entities.User;

public class UserManager extends BaseUserManager {

	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void register(User user) {

		if (userCheckService.checkIfRealPerson(user)) {
			super.register(user);
		} else {
			System.out.println("Geçerli kiþi deðil: " + user.getFirstName());
		}

	}

	@Override
	public void signIn(User user) {

		System.out.println("Kullanýcý giriþ yaptý: " + user.getFirstName());

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
