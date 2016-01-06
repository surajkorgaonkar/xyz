package item_exam1;

public class EComsite {
	
	
	
	
	

	public String chosePaymentMethod( String abc) {
		
		if( abc =="credit_card"){  System.out.println("payment method= Crdit card.");
		                             return abc;}
		else if(abc =="debit_card"){  System.out.println("payment method= debit_card.");
		                              return abc;}
		else if(abc =="net_banking"){  System.out.println("payment method= net_banking.");
		                                  return abc;}	
		else if (abc =="cash_on_delivery"){  System.out.println("payment method= cash_on_delivery.");
		                                return abc;}
		else {  System.out.println("invalid payment method");
		               return abc;}
			
		// TODO Auto-generated method stub
		
	}



	public void makePayment(Object price, String xyz,Object Bag) {
		// TODO Auto-generated method stub
		if(xyz =="net_banking"){  System.out.println("enter all NET BANKING  details and make your payment");
		System.out.println("details successfully done  money has been deducted from your account");}
		
		
		else if(xyz =="credit_card"){  System.out.println("enter all CREDIT CARD  details and make your payment");
		System.out.println("details successfully done  money has been deducted from your account");}
		
		else if(xyz =="debit_card"){  System.out.println("enter all DEBIT CARD  details and make your payment");
		System.out.println("details successfully done  money has been deducted from your account");}
		
		
		else if(xyz =="cash_on_delivery")
		{  System.out.println("fill your address details");
		System.out.println("details successfully done  ");
		System.out.println("your order will be delivered after one week  ");}
		
		else {  System.out.println("invalid payment method");}
			
		
		
		System.out.println("Item Price="+price);
		System.out.println("Item Name= "+Bag);
		System.out.println("WELCOME");
	}
 
}
