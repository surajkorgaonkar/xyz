
package item_exam1;
import java.util.*;
public class main_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// assume that item details such as price are defined in class Item.

		Item item1= new Item();

		 

		EComsite flipkart = new EComsite();

		
		
		String  xyz= flipkart.chosePaymentMethod("credit_card");

		//X specifies the chosen method

		 

		flipkart.makePayment(item1.getPrice(),xyz,item1.getdisp());

		 

		//similarly you can show different payment method for different items…

		 

		}
		
	}


