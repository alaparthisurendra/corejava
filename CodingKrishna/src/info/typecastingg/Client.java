package info.typecastingg;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		Payment payment = new Cashpayment();
		client.doPayment(payment, 200);
		payment = new CardPayment();
		client.doPayment(payment, 400);
	}

	private void doPayment(Payment pay, int amt) {
		pay.processPayment(amt);
		//pay.printSlip();
		if (pay instanceof CardPayment) {
			CardPayment cardPay = (CardPayment) pay;
			cardPay.printSlip();
		}
	}
}
