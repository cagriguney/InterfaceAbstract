package turkcellHW;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public IPersonCheckService personCheckService;

	public StarbucksCustomerManager(IPersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	public StarbucksCustomerManager() {
		super();
	}
	
	public void Save(Customer customer) throws RemoteException{
		if(personCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new RemoteException("Person is not valid.");
		}
	}

	
	
}
