package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		  SmartphoneFactory smartphonefactory = new SmartphoneFactory();
	      SmartPhone phone = smartphonefactory.getSmartPhone("Middle Range Price");
	      phone.Brand();

	}

}


