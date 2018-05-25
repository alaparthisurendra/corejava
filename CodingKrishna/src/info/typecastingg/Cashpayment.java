package info.typecastingg;

public class Cashpayment implements Payment {

	@Override
	public boolean processPayment(int amount) {
		System.out.println("payment done using cash:"+amount);
		return true;
	}

}
