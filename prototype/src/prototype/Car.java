package prototype;

public class Car implements VehicleClone {
	
		 private String carModel;
		 private String manufacturer;
		 private int yOM;
		 private String category;
		 
		public Car(String carModel, String manufacturer, int yOM, String category) {
			
			this.carModel = carModel;
			this.manufacturer = manufacturer;
			this.yOM = yOM;
			this.category = category;
		}

		public String getCarModel() {
			return carModel;
		}

		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public int getYOM() {
			return yOM;
		}

		public void setYOM(int yOM) {
			this.yOM = yOM;
		}
		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			String  CarDetail="Car Model: "+this.carModel+" "+"Manufacturer: "+ this.manufacturer+" "+"YOM: "+ this.yOM+" "+"Category: "+ this.category;
		       return CarDetail;
		} 
		
		 @Override
		    public Car clone() {
		        Car car=new Car(this.carModel,this.manufacturer,this.yOM,this.category);
		        return car;
		    }

		

}
