package sir_did;



public class EComsite {

	 paymentmethod pm;
	public void choosepayment(String pqr) {
		// TODO Auto-generated method stub
		if(pqr=="cc")
			pm= new credit_card();
		else if(pqr=="dc")
			pm= new debit_card();
		else if(pqr=="nb")
		pm= new net_banking();
		else if(pqr=="cod")
		pm= new cash_on_delivery();
		else
			System.out.println("wrong option choosen");
		
			
		
		
	}

	public void makepayment(Item item) {
		// TODO Auto-generated method stub
		pm.makepayment(item);
	}

}
