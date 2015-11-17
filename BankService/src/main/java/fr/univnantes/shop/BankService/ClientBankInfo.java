package fr.univnantes.shop.BankService;

public class ClientBankInfo {
	private String clientName;
	private String clientFirstName;
	private String numero;
	private int expirationMonth;
	private int expirationYear;
	private String key;
	
	public ClientBankInfo(String cfn, String cn, String n, int em, int ey, String k){
		clientName=cn;
		clientFirstName=cfn;
		numero=n;
		expirationMonth=em;
		expirationYear=ey;
		key=k;
	}
	
	public String getClientName() {
		return clientName;
	}

	public String getClientFirstName() {
		return clientFirstName;
	}

	public String getNumero() {
		return numero;
	}

	public int getExpirationMonth() {
		return expirationMonth;
	}

	public int getExpirationYear() {
		return expirationYear;
	}

	public String getKey() {
		return key;
	}
	
	@Override
	public boolean equals(Object o){
		if (o instanceof ClientBankInfo){
			ClientBankInfo cl = (ClientBankInfo) o;
			return 	clientName.equals(cl.clientName) &&
					clientFirstName.equals(cl.clientFirstName) &&
					numero.equals(cl.numero) &&
					expirationMonth==cl.expirationMonth &&
					expirationYear==cl.expirationYear &&
					key.equals(cl.key);
		}
		return false;
	}
}
