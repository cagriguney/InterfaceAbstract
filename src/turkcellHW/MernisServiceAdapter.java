package turkcellHW;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException{
		
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalitId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
	}

	

	
	
}
