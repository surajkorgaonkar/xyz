package sir_did;

public class net_banking implements paymentmethod {

	@Override
	public void makepayment(Item item) {
		System.out.println("payment method= net banking.");
		System.out.println("Item purchased=" );
	}

}
