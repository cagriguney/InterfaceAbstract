package turkcellHW;

import java.rmi.RemoteException;

public interface ICustomerService {

	void Save(Customer customer) throws RemoteException;
	
}
