//floorpanel class_1438
import java.util.ArrayList;


public class Floorpanel {
	//Button goup,godown;
     int p;
	
	
	
		
	 
	public void attachment(Elevator elevator) {
		ArrayList totalfloorpanel = new ArrayList(5);
		for(int i=0;i<=5;i++)
		{
			totalfloorpanel.add(i);
		}
		int randomIndex = (int)(Math.random() * totalfloorpanel.size());
		p = (int) totalfloorpanel.get(randomIndex);
		System.out.println("your at position " +p);
		elevator.move(p);
		
		
	}

}
