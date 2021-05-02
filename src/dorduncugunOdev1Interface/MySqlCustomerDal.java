package dorduncugunOdev1Interface;

public class MySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("Mysql eklendi");
		
	}

}
