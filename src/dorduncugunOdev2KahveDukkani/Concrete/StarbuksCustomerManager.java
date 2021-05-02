package dorduncugunOdev2KahveDukkani.Concrete;

import dorduncugunOdev2KahveDukkani.Abstract.BaseCustomerManager;
import dorduncugunOdev2KahveDukkani.Abstract.CustomerCheckService;
import dorduncugunOdev2KahveDukkani.Entities.Customer;

public class StarbuksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;

	public StarbuksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.err.println("Ge�erli ki�i de�il : " + customer.getFirstName() + " " + customer.getLastName());
		}

	}

}
