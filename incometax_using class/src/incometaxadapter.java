
public class incometaxadapter  extends newclassincometax implements interfacetax{

	
	

	@Override
	public double calculate(double d) {
		// TODO Auto-generated method stub
		//adapter class calling new class using 
        double disp1;
		
		disp1 = calculate1(d);
		
		return disp1;
	}

}
