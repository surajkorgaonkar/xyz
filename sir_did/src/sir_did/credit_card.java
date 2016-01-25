package sir_did;

public class credit_card implements paymentmethod {

	@Override
	public void makepayment(Item item) {
		// TODO Auto-generated method stub
		System.out.println("payment method= Crdit card.");
		System.out.println("Item purchased=" +item.name );
		
	}

	///System.out.println("payment done_=cc");
}
