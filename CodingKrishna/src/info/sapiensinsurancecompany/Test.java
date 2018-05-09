package info.sapiensinsurancecompany;

public class Test {

	public static void main(String[] args) {
		test(new Integer(10));
		test(new Float(15.0));
		test(10);
		test(20.00);
	}
public static void test(Number n)
{
	System.out.println(n);
}
}
