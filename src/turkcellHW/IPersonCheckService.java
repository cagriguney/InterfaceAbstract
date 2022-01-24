package turkcellHW;

import java.rmi.RemoteException;

public interface IPersonCheckService {
	
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
	
}
