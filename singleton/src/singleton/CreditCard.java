package singleton;

public class CreditCard {
	
	private static CreditCard card;
	
	int checkLength, checkCode;
	
	private CreditCard() {
		
	}
	
	public static CreditCard getInstance()
	{
		if(card == null)
			card = new CreditCard();
		
		return card;
	}
	
	
	public boolean validate(String cardno, int code)
	{
		checkLength = cardno.length();
		checkCode = code % 3;
		
		if(checkLength != 16)
			return false;
		
		else if(checkCode != 0)
			return false;
		
		System.out.println("Card Number " +cardno +" validated Successfully");
		return true;
		
	}

}


