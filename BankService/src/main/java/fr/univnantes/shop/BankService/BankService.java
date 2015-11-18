package fr.univnantes.shop.BankService;

import java.util.ArrayList;

public class BankService {
	
	public double getExchangeRate(String devise,String devise2){
		return 1.09;
	}
	
	public boolean debit(String cn, String cfn, String n, int em, int ey, String k, double amount){
		return debit(new ClientBankInfo(cn, cfn, n, em, ey, k), amount);
	}
	
	private boolean isValidClient(ClientBankInfo cbi){
		
		ArrayList<ClientBankInfo> clients = new ArrayList<ClientBankInfo>();
		clients.add(new ClientBankInfo("Jean", "Neymar", "1234567891011", 1, 2017, "304"));
		clients.add(new ClientBankInfo("Jean", "Bombeur", "1234567891011", 1, 2017, "304"));
		clients.add(new ClientBankInfo("Yvan", "Draissamere", "1234567891011", 1, 2017, "304"));
		
		return clients.contains(cbi);
	}

	private boolean debit(ClientBankInfo cbi, double amount){
		return isValidClient(cbi);
	}
	
	
	public static void main(String args[]){
		BankService b= new BankService();
		System.out.println(b.debit("Jean", "Neymar", "1234567891011", 9, 2016, "304", 400));
		System.out.println(b.debit("Jean", "Peuplu", "1234567891011", 9, 2016, "304", 400));
	}
}
