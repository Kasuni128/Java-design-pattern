package chainOfResponsibilities;

public class Calculations {

	public static void main(String[] args){
		
		
		Chain Cal1 = new AddNumbers();
		Chain Cal2 = new SubtractNumbers();

		
		Cal1.setNextChain(Cal2);
				
		Number request = new Number(10,20,"add");
		
		Cal1.calculate(request);
		
	}
}




