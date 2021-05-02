package dorduncugunOdev2KahveDukkani.Concrete;

import dorduncugunOdev2KahveDukkani.Abstract.CustomerCheckService;
import dorduncugunOdev2KahveDukkani.Entities.Customer;

public class CustomerCheckmanager implements CustomerCheckService  {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}


	
	

}
