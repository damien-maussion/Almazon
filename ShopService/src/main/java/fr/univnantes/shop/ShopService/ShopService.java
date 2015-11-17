package fr.univnantes.shop.ShopService;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import fr.univnantes.shop.ShopService.BankStub.BankServiceStub;
import fr.univnantes.shop.ShopService.BankStub.BankServiceStub.GetExchangeRate;

public class ShopService {
	private BankServiceStub bss;
	
	public ShopService() throws AxisFault{
		bss = new BankServiceStub("http://localhost:9763/services/BankService/ ");
	}
	
	public double getExchangeRate() throws RemoteException{
		GetExchangeRate g = new GetExchangeRate();
		
		return bss.getExchangeRate(g).get_return();
	}
}
