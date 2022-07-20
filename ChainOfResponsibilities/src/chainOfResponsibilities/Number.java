package chainOfResponsibilities;

public class Number {
	private int num1;
	private int num2;
	
	private String cal;
	
	public Number(int newNum1, int newNum2, String newCal){
		
		num1 = newNum1;
		num2 = newNum2;
		cal = newCal;
		
	}
	
	public int getNumber1(){ return num1; }
	public int getNumber2(){ return num2; }
	public String getCalcWanted(){ return cal; }
}



