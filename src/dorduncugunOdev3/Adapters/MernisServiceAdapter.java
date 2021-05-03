package dorduncugunOdev3.Adapters;

import java.rmi.RemoteException;

import dorduncugunOdev2KahveDukkani.Abstract.CustomerCheckService;
import dorduncugunOdev2KahveDukkani.Entities.Customer;
import dorduncugunOdev3.Abstract.UserCheckService;
import dorduncugunOdev3.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(), user.getLastName(), user.getYearOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

	

}
