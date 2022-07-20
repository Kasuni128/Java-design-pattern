package singleton;

public class User {

	public static void main(String[] args) {
		CreditCard card1 = CreditCard.getInstance();
		CreditCard card2 = CreditCard.getInstance();
		
		card1.validate("1234567891234567",300);
		card2.validate("12345678912345658",300);

	}

}




