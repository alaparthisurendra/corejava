package info.typecastingg;

public class CardPayment implements Payment{

	@Override
	public boolean processPayment(int amount) {
		System.out.println("payment done using card:"+amount);
		return true;
	}
	public void printSlip()
	{
		System.out.println("printing slip for payment");
	}

}
