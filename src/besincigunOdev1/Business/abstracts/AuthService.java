package besincigunOdev1.Business.abstracts;

import besincigunOdev1.Entities.Concretes.LoginDto;
import besincigunOdev1.Entities.Concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto loginDto);
	
}
