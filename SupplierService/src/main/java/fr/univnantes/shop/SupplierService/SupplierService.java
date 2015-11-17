package fr.univnantes.shop.SupplierService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SupplierService {
	
	private Map<String, Product> products;
	
	public SupplierService(){
		products = new HashMap<String, Product>();
		products.put("a", new Product("a", "parapluie", 12.3, 5));
		products.put("b", new Product("b", "chapeau", 45, 10));
	}
	
	public Collection<Product> getItemList(){
		return products.values();
	}
	
	public int getStock(String itemId){
		Product p = products.get(itemId);
		if (p!=null)
			return p.getQuantity();
		return 0;
	}
	
	public double getPrice(String itemId){
		Product p = products.get(itemId);
		if (p!=null)
			return p.getPrice();
		return 0;
	}
	
	public boolean buy(String itemId, int qt){
		Product p = products.get(itemId);
		if (p==null)
			return false;
		if (p.getQuantity()<qt)
			return false;
		
		p.setQuantity(p.getQuantity()-qt);
		return true;
	}
	
	public void cancelBuy(String itemId, int qt){
		Product p = products.get(itemId);
		if (p!=null)
			p.setQuantity(p.getQuantity()+qt);
	}
}
