package enumtwo;

enum Country {
	INDIA("j", "Rs"), USA("a", "USD"), UK("$", "Doller"), EUROP("c", "europ"), UAE("#", "diya");

	String symbol;
	String currency;
	
	Country(String string, String a) {
		this.symbol = string;
		this.currency = a;
	}

	public static Country getCountry(String  c)
	{
		for(Country sea:Country.values()) {
	          if(c.equals(sea.symbol)) {
	        	  return sea;
	         }
		} 
		return null;
	}
		   
	public static String getCountry1( String currency)
	{
		for(Country sea:Country.values()) {
	          if(currency.equals(sea.currency)) {
	        	 return  sea.symbol();
					}
	
		}
		return null;
		
	}
	


	
	public String symbol() {
		return  symbol;

	}

	public String currency() {
	return currency;

	}





   
   }
   

	

