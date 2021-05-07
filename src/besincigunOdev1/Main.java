package besincigunOdev1;

import besincigunOdev1.Business.concretes.AuthManager;
import besincigunOdev1.Business.concretes.UserManager;
import besincigunOdev1.Core.AmazonMailManagerAdapter;
import besincigunOdev1.Core.GoogleMailManagerAdapter;
import besincigunOdev1.DataAccess.concrete.UserinMemoryDao;
import besincigunOdev1.Entities.Concretes.LoginDto;
import besincigunOdev1.Entities.Concretes.User;


public class Main {

	public static void main(String[] args) {
		
				User sercan3=new User(3, "Sercan3", "Evyapan3", "sercan3@gmail.com", "3333333", true);
				//userManager.add(sercan3);
				
				User sercan4 = new User(4, "Sercan3", "Evyapan3", "sercan4@gmail.com", "1111111", false);
				//userManager.update(sercan4);
				
				LoginDto sercan5 = new LoginDto("sevyapan1@gmail.com", "123456");
				
				UserinMemoryDao userInMemoryUserDao = new UserinMemoryDao();
				GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
				AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

				
				AuthManager authManager =new AuthManager(new UserManager(userInMemoryUserDao, googleMailManagerAdapter));
				//authManager.register(sercan4);
				
				UserManager userManager = new UserManager(userInMemoryUserDao, amazonMailManagerAdapter);
				
				authManager.login(sercan5);
				
				//userManager.add("sercan5@gmail.com");
				//userManager.delete( 2);
				userManager.getAll();
				//userManager.add(sercan4);
				
	}

}
