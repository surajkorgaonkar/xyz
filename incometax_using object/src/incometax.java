
public class incometax implements interfacetax {

	

	@Override
	public double calculate(double i) {
		// TODO Auto-generated method stub
		 double pay;
		pay = (i*40)/100;
		return pay;
	}

}
