
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
				double disp;
		   /* old system */incometax tax = new incometax();
				/*new systemincometaxadapter tax = new incometaxadapter();*/
		    disp = tax.calculate(50000.00);
		    System.out.println("the tax payment of Rs "+disp+" need to pay");
		    
		   

	}

}
