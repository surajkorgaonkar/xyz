package car1438;

public class main_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       car c = new car();
       subsystem wheels = new subsystem();
       parts p1=new parts();
       p1.setPrice(50);
       parts p2=new parts();
       p2.setPrice(500);
       parts p3=new parts();
       p3.setPrice(400);
       
       wheels.addpart(p1);
       wheels.addpart(p2);
       wheels.addpart(p3);
       
      // parts p = new parts();
       
       System.out.println("total cost="+wheels.getTotalCostparts()); 
		
		
		
	}

}
