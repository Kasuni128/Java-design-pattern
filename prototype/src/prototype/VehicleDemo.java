package prototype;

public class VehicleDemo {

	public static void main(String[] args) {
		Car car=new Car("Audi A8","Audi",2016,"Luxury");
		System.out.println(car.toString());

        Car cloneObj=car.clone();
        cloneObj.setCategory("Sports");
        System.out.println(cloneObj.toString());
        
       
        cloneObj.setCarModel("Leaf");
        cloneObj.setManufacturer("Nissan");
        cloneObj.setYOM(2018);
        System.out.println(cloneObj);



	}

}
