package stack;

import java.util.ArrayList;

public class stack_methods implements interface_methods {
    int p=0;
    ArrayList <Integer> stackarray = new ArrayList <Integer>(6);
	@Override
	public void push(int number ) {
		// TODO Auto-generated method stub
		
		stackarray.add(number);
		p++;
			
	}

	@Override
	public void pop() {
		
		if(p==0)
			System.out.println(" arraylist EMPTY");
		else
		{	p--;
		stackarray.remove(p);
		//get_top();
		System.out.println(stackarray);	
		}
		
	}

	@Override
	public void get_top() {
		// TODO Auto-generated method stub
		System.out.println("top of stack=");
	
	}

	@Override
	public boolean isempty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("elements are as");
		System.out.println(stackarray);	
		
	}

	
	
	

	
		
	}


