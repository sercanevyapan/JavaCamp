package besincigunOdev1.Core;

import besincigunOdev1.Business.abstracts.UserService;
import besincigunOdev1.Entities.Concretes.LoginDto;
import besincigunOdev1.Entities.Concretes.User;


public class GoogleAuthManagerAdapter implements ExternalAuthService {
	
	
	private UserService userService;
	
	public GoogleAuthManagerAdapter(UserService userService) {
		this.userService=userService;
	}

	@Override
	public void register(String email) {
		
		if(userExists(email)==false) {
		
			
			userService.add(email);
			
		}else {
			User user=userService.get(email);
			
			LoginDto dto=new LoginDto();
			dto.setEmail(user.getEmail());
			dto.setPassword(user.getPassword());
			login(dto);
		}
		
	}

	@Override
	public boolean userExists(String email) {
		if(userService.get(email)!=null) {
			return true;
		}
		
		
		return false;
	}

	@Override
	public void login(LoginDto dto) {
		if(dto != null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Baþarýyla giriþ yaptýnýz.");				
		}
		else {
			System.out.println("Kullanýcý adý veya þifren yanlýþ.!");
		}
		
	}

}
