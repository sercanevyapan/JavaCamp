package dorduncugunOdev3.Concrete;

import dorduncugunOdev3.Abstract.UserCheckService;
import dorduncugunOdev3.Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
	
	
		return true;
	}

}
