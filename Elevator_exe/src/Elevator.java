
//elevator class_1438
import java.util.ArrayList;
import java.util.Scanner;

public class Elevator {
	Scanner in = new Scanner(System.in);
    int curr_ele_position;
    int place;
	public Elevator(int no_of_floor) {
		
		ArrayList totalelevatorpanel = new ArrayList(no_of_floor);
		for(int i=0;i<=no_of_floor;i++)
		{
		totalelevatorpanel.add(i);
		}
		
		int randomIndex = (int)(Math.random() * totalelevatorpanel.size());
		
		System.out.println("ELEVATOR POSITION AND CURRENT FLOOR POSITION IN RANDOMLY GENERATED");
		System.out.println("lift is at position");
        System.out.println(totalelevatorpanel.get(randomIndex));
        curr_ele_position = (int) totalelevatorpanel.get(randomIndex);
		
	}
 
	

	
	
	
	       Door door= new Door();
	public void move(int current_floor) {
		
		if(current_floor == curr_ele_position){
			door.status();
		
		System.out.println("enter  FLOOR NUMBER  in ELEVATOR  PANEL to which you want to go");
		   place=in.nextInt();
		      
		   
		               if(place >=current_floor)
		                {
		            	   System.out.println("ELEVATOR IS MOVING UP PLEASE WAIT ...");
		            	             for(int q=current_floor;q<=place;q++)
		  	                          {System.out.println("floor at "+q);}
		    	                  door.putstatus();
		                      }
		                 else
		                  {
		            	   System.out.println("ELEVATOR IS MOVING DOWN PLEASE WAIT ..."); 
		            	   for(int q=current_floor;q>=place;q--)
	                          {System.out.println("floor at "+q);}
	                            door.putstatus();
		            	   
		                       }
		}
		else if(current_floor >  curr_ele_position)
		{
			System.out.println("ELEVATOR IS MOVING UP PLEASE WAIT ...");
		   for(int q=curr_ele_position;q<=current_floor;q++)
	             {System.out.println("floor at "+q);}
			
		   door.status();
		   System.out.println("enter  FLOOR NUMBER  in ELEVATOR  PANEL to which you want to go");
		   place=in.nextInt();
		      
		   
		               if(place >=current_floor)
		                {
		            	   System.out.println("ELEVATOR IS MOVING UP PLEASE WAIT ...");
		            	             for(int q=current_floor;q<=place;q++)
		  	                          {System.out.println("floor at "+q);}
		    	                  door.putstatus();
		                      }
		                 else
		                  {
		            	   System.out.println("ELEVATOR IS MOVING DOWN PLEASE WAIT ..."); 
		            	   for(int q=current_floor;q>=place;q--)
	                          {System.out.println("floor at "+q);}
 	                            door.putstatus();
		            	   
		                       }
		   
		}
		
		else
		
			{
			System.out.println("ELEVATOR IS MOVING DOWN PLEASE WAIT...");
			 for(int w=curr_ele_position;w>=current_floor;w--)
		             {System.out.println("floor at "+w);}
			   
			door.status();
			
			System.out.println("enter  FLOOR NUMBER  in ELEVATOR  PANEL to which you want to go");
			   place=in.nextInt();
			   
			   
			   if(place >=current_floor)
               {
           	   System.out.println("ELEVATOR IS MOVING UP PLEASE WAIT ...");
           	             for(int q=current_floor;q<=place;q++)
 	                          {System.out.println("floor at "+q);}
   	                  door.putstatus();
                     }
                else
                 {
           	   System.out.println("ELEVATOR IS MOVING DOWN PLEASE WAIT ..."); 
           	   for(int q=current_floor;q>=place;q--)
                     {System.out.println("floor at "+q);}
                        door.putstatus();
           	   
                      }
			   
			   
			}
	
		
	}

	
}
