package turkcellHW;

import java.rmi.RemoteException;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) throws RemoteException {
		System.out.println(customer.getFirstName()+" veritabanina kaydedildi.");
		
	}


}
