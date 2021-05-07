package besincigunOdev1.DataAccess.abstracts;

import java.util.List;

import besincigunOdev1.Entities.Concretes.User;


public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(int userId);
	User get(String email );
	List<User> getAll();
	

}
