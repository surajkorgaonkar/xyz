package sir_did;



public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item= new Item("book",25);
		
		
		EComsite flipkart = new EComsite();
		flipkart.choosepayment("cc");
		flipkart.makepayment(item);
		
		
		
		
		
		
	}

}
