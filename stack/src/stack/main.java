package stack;
import java.util.*;
public  class main extends stack_methods {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int p;
		stack_methods s = new stack_methods();
		
		s.push(20);
	    s.push(30);
	    s.push(40);
	    s.push(50);
	    s.push(60);
	    s.push(70);
	    System.out.println("total number in an array is= 6 " );	
	    s.display();
	    System.out.println("****************************************************************************");
	    System.out.println(" after POP elements are as");
	   s.pop();
	   System.out.println("  after POP elements are as");
	   s.pop();
	   System.out.println("  after POP elements are as");
	   s.pop();
	   System.out.println(" after POP elements are as");
	   s.pop();
	   System.out.println("  after POP elements are as");
	   s.pop();
	   System.out.println("  after POP elements are as");
	   s.pop();
	   System.out.println("  after POP elements are as");
	   s.pop();
		


	}

}
