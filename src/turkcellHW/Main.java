package turkcellHW;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.Save(new Customer(1, "cagri","guney", 1998, "21542444212"));
		
		BaseCustomerManager cM=new StarbucksCustomerManager(new MernisServiceAdapter());
		cM.Save(new Customer(1, "Çağrı","Güney", 1998, "21448480056"));
	}

}
