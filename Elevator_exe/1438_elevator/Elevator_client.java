//main class
import java.util.ArrayList;

public class Elevator_client {

	public static void main(String[] args) {
		Elevator elevator = new Elevator(5);
		Floorpanel floorpanel = new Floorpanel();
	    floorpanel.attachment(elevator);
	 ///Elevatorpanel elevatorpanel = new Elevatorpanel();
	    Door door= new Door();
	    
	    
	    
	}

}
