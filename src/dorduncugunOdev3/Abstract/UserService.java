package dorduncugunOdev3.Abstract;

import dorduncugunOdev3.Entities.User;

public interface UserService {
	
	void signIn(User user);
	
	void register(User user);
	
	void update(User user);
	
	void delete(User user);

}
