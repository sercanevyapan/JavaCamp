package dorduncugunOdev2KahveDukkani;

import java.util.Date;

import dorduncugunOdev2KahveDukkani.Abstract.BaseCustomerManager;
import dorduncugunOdev2KahveDukkani.Adapters.MernisServiceAdapter;
import dorduncugunOdev2KahveDukkani.Concrete.NeroCustomerManager;
import dorduncugunOdev2KahveDukkani.Concrete.StarbuksCustomerManager;
import dorduncugunOdev2KahveDukkani.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbuksCustomerManager(new MernisServiceAdapter());
	
		customerManager.save(new Customer(1,"Sercan", "Evyapan",new Date(1983,11,25),"29680770874"));
		

	}
}

