
public class TestDriver {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.checkout(3500);
		cart1.setPaymentStrategy(new CreditCardPayment());
		cart1.checkout(16500);
		cart1.setPaymentStrategy(new ScanPayment());
		cart1.checkout(9600);
	}

}
