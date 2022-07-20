package chainOfResponsibilities;

public class SubtractNumbers implements Chain{

	private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Number request) {
		
		if(request.getCalcWanted() == "sub"){
			
			System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "+
					(request.getNumber1()-request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}

	
	
}

