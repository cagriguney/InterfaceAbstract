package turkcellHW;

import java.rmi.RemoteException;

public class NeroCustomerManager extends BaseCustomerManager {
	
	public void save(Customer customer) throws RemoteException{
		super.Save(customer);
	}
	
}
