package besincigunOdev1.Core;

import besincigunOdev1.Entities.Concretes.LoginDto;


public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto loginDto);

}
