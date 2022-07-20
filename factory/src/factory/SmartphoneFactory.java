package factory;

public class SmartphoneFactory {
	public SmartPhone getSmartPhone(String priceType){
		if(priceType == null) {
			return null;
		}
		if(priceType == "Low Range Price") {
			return new Huawei();
		}else if(priceType == "Middle Range Price") {
			return new Oppo();
		}else if(priceType == "Highest Range Price") {
			return new IPhone();
		}
		return null;
		
	}
}




