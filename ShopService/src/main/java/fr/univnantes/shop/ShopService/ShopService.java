package fr.univnantes.shop.ShopService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.axis2.AxisFault;

import fr.univnantes.shop.ShopService.BankStub.BankServiceStub;
import fr.univnantes.shop.ShopService.BankStub.BankServiceStub.Debit;
import fr.univnantes.shop.ShopService.BankStub.BankServiceStub.GetExchangeRate;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.Buy;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.CancelBuy;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.GetItemList;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.GetPrice;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.GetStock;
import fr.univnantes.shop.ShopService.SupplierStub.SupplierServiceStub.Product;

public class ShopService {
	private BankServiceStub bss;
	private SupplierServiceStub sss;
	
	public ShopService() throws AxisFault{
		bss = new BankServiceStub("http://localhost:9763/services/BankService/");
		sss = new SupplierServiceStub("http://localhost:9763/services/SupplierService/");
	}
	
	public Collection<Product> getItemList(String devise) throws RemoteException{
		GetItemList g = new GetItemList();
		ArrayList<Product> prod = new ArrayList<Product>(Arrays.asList(sss.getItemList(g).get_return()));
		
		GetExchangeRate ger = new GetExchangeRate();
		ger.setDevise("dollar");
		ger.setDevise2(devise);
		
		double exRate = bss.getExchangeRate(ger).get_return();
		
		for (Product p : prod){
			p.setPrice(p.getPrice()*exRate);
		}
		
		return prod;
	}
	
	public int getStock(String itemId) throws RemoteException{
		GetStock g = new GetStock();
		g.setItemId(itemId);
		
		return sss.getStock(g).get_return();
	}
	
	public double getPrice(String itemId, String devise) throws RemoteException{
		GetExchangeRate ger = new GetExchangeRate();
		ger.setDevise("dollar");
		ger.setDevise2(devise);
		
		double exRate = bss.getExchangeRate(ger).get_return();
		
		GetPrice gp = new GetPrice();
		gp.setItemId(itemId);
		
		double price = sss.getPrice(gp).get_return();
		
		return exRate * price;
	}
	
	
	public boolean buy(String itemId, int qt, String devise, String clientFirstName, String clientName, String numero, int expirationMonth, int expirationYear, String key) throws RemoteException{
		Buy b = new Buy();
		b.setItemId(itemId);
		b.setQt(qt);
		
		if(!sss.buy(b).get_return())
			return false;			//invalid product or quantity
		
		Debit d = new Debit();
		d.setAmount(getPrice(itemId, devise));
		d.setClientFirstName(clientFirstName);
		d.setClientName(clientName);
		d.setExpirationMonth(expirationMonth);
		d.setExpirationYear(expirationYear);
		d.setKey(key);
		d.setNumero(numero);
		
		if (!bss.debit(d).get_return()){			// debit fail => cancel buy on supplier
			CancelBuy cb = new CancelBuy();
			sss.cancelBuy(cb);
			return false;
		}
		
		return true;
	}
	
	//TODO del (kept for client test)
	public double getExchangeRate() throws RemoteException{
		GetExchangeRate g = new GetExchangeRate();
		
		return bss.getExchangeRate(g).get_return();
	}
}
