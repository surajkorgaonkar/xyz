package elevator1;
import java.util.Scanner;
import java.util.*;
public class elevtor_prg {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int  ch,floor,floorup,exit;
		
		System.out.println("The elevator is now on  groundfloor  and building has 10 floor");
		System.out.println(" enter 0 for basement");
		System.out.println("please enter the floor number  to which your currently ");
		floor=in.nextInt();
		
        
	    if((floor>=1)&&(floor<=10)) 
	    {
	    	Elevatormove();
	    }
	    else if(floor>10)
	    {
	    	System.out.println("please enter correct floor number");
	    	
	    }
		
	    else
	    {
	    	ElevatorUp();
	    }
		

	}
	
	
	
	
	
	
	
	
	
	public static void ElevatorUp()
	{
		
		Scanner in = new Scanner(System.in);
		int floorup,exit;
		System.out.println("the elevator has arrived and its opened please get in and enter to which floor you want to go");
    	floorup=in.nextInt();
    	System.out.println("processing...");
    	System.out.println("you are at your  "+floorup+"  floor please enter 0 to opened");
    	exit=in.nextInt();
    	if(exit==0)
    		System.out.println("finish");
    	else
    		System.out.println("enter 0 to opened the door"); 
	}
	
	
	
	public static void Elevatormove()
	{
		System.out.println("wait");	
    	System.out.println("the elevator is on its way up to your floor");
    	ElevatorUp();
	}
	
	
	
}


