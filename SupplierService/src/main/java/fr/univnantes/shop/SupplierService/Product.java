package fr.univnantes.shop.SupplierService;

public class Product {
	private String refId;
	private String name; 
	private double price; 
	private int quantity;
	
	public Product(String r, String n, double p, int q){
		refId=r;
		name=n;
		price=p;
		quantity=q;
	}

	public String getRefId() {
		return refId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int q){
		if (q>=0)
			quantity=q;
	}

}
