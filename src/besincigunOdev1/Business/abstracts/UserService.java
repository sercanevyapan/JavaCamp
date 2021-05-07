package besincigunOdev1.Business.abstracts;

import java.util.List;

import besincigunOdev1.Entities.Concretes.User;

public interface UserService {
	
	void add(User user);
	void add(String email);
	void update(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
	

}
