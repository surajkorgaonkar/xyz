package car1438;

import java.util.ArrayList;

public class subsystem {
	carcomponent cc;
	ArrayList<parts> partss = new ArrayList<parts>(5);
	int cost = 0;
	public int getTotalCostparts()
	{   
		for(parts p:partss){
			cost = cost + p.getprice();
			System.out.println(cost);
		}
		
		return cost;
		
	}
	
	
	
	public void addpart(parts i) {
		partss.add(i);
		// TODO Auto-generated method stub
		
	}



	
}
